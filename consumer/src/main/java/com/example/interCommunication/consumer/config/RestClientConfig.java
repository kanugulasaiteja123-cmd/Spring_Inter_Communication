package com.example.interCommunication.consumer.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestClient;
@Configuration
public class RestClientConfig {
    @Bean
    public RestClient restClient() {
        // Create and configure a RestClient bean
        return RestClient.builder()
                .baseUrl("http://localhost:8081") // Set the base URL for all requests
                // .defaultHeader("Authorization", "Bearer ...") // Example:add a default header
                // .requestInterceptor(...) // Example: add an interceptor
                .build();
    }
}
