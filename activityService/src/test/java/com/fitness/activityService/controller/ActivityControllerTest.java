package com.fitness.activityService.controller;

import com.fitness.activityService.dto.ActivityResponse;
import com.fitness.activityService.model.ActivityType;
import com.fitness.activityService.service.ActivityService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class ActivityControllerTest {

    @Mock
    private ActivityService activityService;

    @InjectMocks
    private ActivityController activityController;

    @Test
    void shouldReturnActivityById() {

        // arrange
        String activityId = "act123";

        ActivityResponse response = new ActivityResponse();
        response.setId(activityId);
        response.setType(ActivityType.RUNNING);

        when(activityService.getActivityById(activityId))
                .thenReturn(response);

        // act
        ResponseEntity<ActivityResponse> result =
                activityController.getActivityById(activityId);

        // assert
        assertEquals(HttpStatus.OK, result.getStatusCode());
        assertEquals(activityId, result.getBody().getId());
        assertEquals("RUNNING", result.getBody().getType());
    }
}