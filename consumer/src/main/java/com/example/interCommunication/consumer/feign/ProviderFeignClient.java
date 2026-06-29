package com.example.interCommunication.consumer.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
// 1. Annotate the interface with @FeignClient
@FeignClient(
        name = "provider-service", // Logical name for the client
        url = "http://localhost:8081" // Base URL of the Provider service
)
public interface ProviderFeignClient {
    // 2. Declare a method for each API endpoint you want to call
// Uses the same annotations as a Spring @RestController
    @GetMapping("/instance-info") // Path to the Provider's endpoint
    String getInstanceInfo(); // Return type matches the Provider's response
}