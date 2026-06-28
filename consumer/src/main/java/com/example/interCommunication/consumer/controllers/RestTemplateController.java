package com.example.interCommunication.consumer.controllers;

import com.example.interCommunication.consumer.service.RestTemplateClient;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/rest-template")
@RequiredArgsConstructor
public class RestTemplateController {

    private final RestTemplateClient restTemplateClient;

    //Method-1
//    @GetMapping("/instance")
//    public String getInstance() {
//        // 1. Create a new RestTemplate instance (Inefficient)
//        RestTemplate restTemplate = new RestTemplate();
//        // 2. Define the Provider's URL (Hard-coded - not ideal)
//        String providerUrl = "http://localhost:8081/instance-info";
//        // 3. Make the GET request and map the response to a String
//        String response = restTemplate.getForObject(providerUrl, String.class);
//        // 4. Return the Provider's response to the client
//        return response;
//    }

    //Method-2
    @GetMapping("/instance")
    public String getInstance() {
        // Simply delegate the call to the dedicated client service
        return restTemplateClient.getInstanceInfo();
    }
}
