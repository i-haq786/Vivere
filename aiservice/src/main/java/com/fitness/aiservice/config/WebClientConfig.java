package com.fitness.aiservice.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;

@Configuration
public class WebClientConfig {
    @Bean
    @LoadBalanced
    //allows webclient to resolve service via eureka: whichever ip the services are u can call it by its name.
    public WebClient.Builder webClientBuilder() {
        return WebClient.builder();
    }
}
