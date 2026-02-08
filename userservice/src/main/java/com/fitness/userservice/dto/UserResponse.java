package com.fitness.userservice.dto;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fitness.userservice.model.UserRole;
import jakarta.persistence.Column;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;

@JsonPropertyOrder({
        "id",
        "email",
        "firstName",
        "lastName",
        "createdAt",
        "updatedAt"
})

@Data
public class UserResponse {
    private String id;
    private String email;
    private String password;
    private String firstName;
    private String lastName;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}
