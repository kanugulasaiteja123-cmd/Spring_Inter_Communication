package com.example.interCommunication.consumer.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
@RequiredArgsConstructor // Lombok annotation to create a constructor for final
public class RestTemplateClient {
    private final RestTemplate restTemplate;
    private static final String PROVIDER_BASE_URL = "http://localhost:8081";
    public String getInstanceInfo() {
        // Construct the full URL and make the call
        String fullUrl = PROVIDER_BASE_URL + "/instance-info";
        return restTemplate.getForObject(fullUrl, String.class);
    }
}
