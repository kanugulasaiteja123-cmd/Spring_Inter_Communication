package com.example.interCommunication.consumer.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestClient;

@RestController
@RequestMapping("/api/rest-client")
@RequiredArgsConstructor
public class RestClientController {

    //Method -1
//    @GetMapping("/instance")
//    public String getInstance() {
//        // 1. Create a RestClient instance
//        RestClient restClient = RestClient.create();
//
//        // 2. Make the GET request using the fluent API
//        String response = restClient.get()
//                .uri("http://localhost:8081/instance-info") // Full URL
//                .retrieve() // Execute the request and retrieve the response
//                .body(String.class); // Extract the response body as a String
//        // 3. Return the Provider's response
//        return response;
//    }

    // Inject the RestClient bean
    private final RestClient restClient;

    @GetMapping("/instance")
    public String getInstance() {
        // Use the injected client. Note: only the endpoint path is needed now.
        return restClient.get()
                .uri("/instance-info") // Uses the base URL from the config
                .retrieve()
                .body(String.class);
    }

}
