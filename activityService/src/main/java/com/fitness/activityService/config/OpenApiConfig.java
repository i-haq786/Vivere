package com.fitness.activityService.config;

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
                )).info(new Info()
                        .title("Activity Service 🏃")
                        .description("Part of Vivere — an intelligent fitness platform.\n\n" +
                                "This service manages user activity data and workout records.\n\n" +
                                "Capabilities include:\n" +
                                "- Retrieving all recorded activities for tracking and analysis.\n" +
                                "- Fetching detailed information for a specific activity.\n" +
                                "- Creating and storing new activity entries.\n\n" +
                                "Designed to support activity tracking, historical insights, and data-driven fitness workflows.")
                        .version("1.0.0")
                );
    }
}