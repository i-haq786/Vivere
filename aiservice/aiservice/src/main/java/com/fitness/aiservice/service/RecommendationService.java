package com.fitness.aiservice.service;

import com.fitness.aiservice.dto.RecommendationRequest;
import com.fitness.aiservice.dto.RecommendationResponse;
import com.fitness.aiservice.model.Recommendation;
import com.fitness.aiservice.repository.RecommendationRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class RecommendationService {
    private final RecommendationRepository recommendationRepository;

    private RecommendationResponse mapToResponse(Recommendation recommendation) {
        RecommendationResponse recommendationResponse = new RecommendationResponse();
        recommendationResponse.setId(recommendation.getId());
        recommendationResponse.setActivityId(recommendation.getActivityId());
        recommendationResponse.setUserId(recommendation.getUserId());
        recommendationResponse.setActivityType(recommendation.getActivityType());
        recommendationResponse.setRecommendation(recommendation.getRecommendation());
        recommendationResponse.setImprovements(recommendation.getImprovements());
        recommendationResponse.setSuggestions(recommendation.getSuggestions());
        recommendationResponse.setSafety(recommendation.getSafety());
        recommendationResponse.setCreatedAt(recommendation.getCreatedAt());

        return recommendationResponse;
    }

    public List<RecommendationResponse> getUserRecommendations(String userId) {
        List<Recommendation> allRecommendations = recommendationRepository.findByUserId(userId);

        if (allRecommendations.isEmpty())
            throw new RuntimeException("No recommendation found for the user id: " + userId);

        return allRecommendations.stream()
                .map(this::mapToResponse)
                .toList();
    }

    public RecommendationResponse addRecommendation(RecommendationRequest recommendationRequest) {
        Recommendation recommendation = Recommendation.builder()
                .activityId(recommendationRequest.getActivityId())
                .userId(recommendationRequest.getUserId())
                .activityType(recommendationRequest.getActivityType())
                .recommendation(recommendationRequest.getRecommendation())
                .improvements(recommendationRequest.getImprovements())
                .suggestions(recommendationRequest.getSuggestions())
                .safety(recommendationRequest.getSafety())
                .build();

        return mapToResponse(recommendationRepository.save(recommendation));
    }
}