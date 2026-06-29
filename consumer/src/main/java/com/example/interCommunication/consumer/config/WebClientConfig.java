package com.example.interCommunication.consumer.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;

@Configuration
public class WebClientConfig {
    @Bean
    public WebClient webClient() {
        return WebClient.builder()
                .baseUrl("http://localhost:8081") // Base URL for all requests
                // .defaultHeader("Authorization", "Bearer ...") // Add default headers
                // .filter(...) // Add filters for logging, etc.
                .build();
    }
}
