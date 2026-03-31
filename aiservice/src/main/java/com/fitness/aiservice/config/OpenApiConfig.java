package com.fitness.aiservice.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.servers.Server;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class OpenApiConfig {

    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .servers(List.of(
                        new Server().url("http://localhost:8080")
                ))
                .info(new Info()
                        .title("Fitness AI Service 💪")
                        .description("Part of Vivere — an intelligent fitness platform.\n\n" +
                                "Provides AI-driven fitness recommendations tailored to user behavior and activity data.\n\n" +
                                "This service supports:\n" +
                                "- Fetching personalized recommendations for a specific user based on their profile and past activities.\n" +
                                "- Retrieving recommendations linked to a specific activity to provide context-aware insights.\n" +
                                "- Creating and storing new recommendations generated from incoming data or external inputs.\n\n" +
                                "Designed to enable dynamic, data-driven fitness guidance and continuously evolving recommendation logic.")
                        .version("1.0.0")
                );
    }
}