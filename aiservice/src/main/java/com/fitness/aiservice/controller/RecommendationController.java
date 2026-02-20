package com.fitness.aiservice.controller;

import com.fitness.aiservice.dto.RecommendationRequest;
import com.fitness.aiservice.dto.RecommendationResponse;
import com.fitness.aiservice.service.RecommendationService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/recommendation")
public class RecommendationController {
    private final RecommendationService recommendationService;

    @GetMapping("/userId/{userId}")
    public ResponseEntity<List<RecommendationResponse>> getUserRecommendation(@PathVariable String userId) {
        return ResponseEntity.ok(recommendationService.getUserRecommendations(userId));
    }

    @PostMapping
    public ResponseEntity<RecommendationResponse> addRecommendations(@RequestBody RecommendationRequest recommendationRequest) {
        return ResponseEntity.ok(recommendationService.addRecommendation(recommendationRequest));
    }

    @GetMapping("/activityId/{activityId}")
    ResponseEntity<RecommendationResponse> getActivityRecommendation(@PathVariable String activityId) {
        return ResponseEntity.ok(recommendationService.getActivityRecommendation(activityId));
    }
}
