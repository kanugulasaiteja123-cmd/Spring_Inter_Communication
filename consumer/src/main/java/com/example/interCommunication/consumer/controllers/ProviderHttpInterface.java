package com.example.interCommunication.consumer.controllers;

import org.springframework.web.service.annotation.GetExchange;
import org.springframework.web.service.annotation.HttpExchange;

// 1. Declare the base URL for all methods in this interface
@HttpExchange(url = "http://localhost:8081")
public interface ProviderHttpInterface {

    // 2. Declare a method for the specific endpoint
    // Uses the same annotations as a Spring @RestController
    @GetExchange("/instance-info") // Path to the Provider's endpoint
    String getInstanceInfo(); // Return type matches the Provider's response

    // Future methods for other endpoints:
    // @PostExchange("/new-resource")
    // String createResource(@RequestBody NewResourceRequest request);
}
