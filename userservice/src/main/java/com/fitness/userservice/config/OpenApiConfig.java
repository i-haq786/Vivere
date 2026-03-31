package com.fitness.userservice.config;

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
                        .title("User Service 👤")
                        .description("Part of Vivere — an intelligent fitness platform.\n\n" +
                                "This service manages user profiles and validation workflows.\n\n" +
                                "Capabilities include:\n" +
                                "- Registering new users and onboarding them into the platform.\n" +
                                "- Retrieving user data for system-wide access and integration.\n" +
                                "- Validating users to ensure authenticity and enable secure interactions across services.\n\n" +
                                "Designed to serve as the core identity and user management layer for the Vivere ecosystem.")
                        .version("1.0.0")
                );
    }
}