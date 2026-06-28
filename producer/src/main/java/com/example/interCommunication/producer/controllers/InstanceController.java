package com.example.interCommunication.producer.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
public class InstanceController {
    @Value("${server.port}")
    private String port;
    // Generate a unique ID for this application instance
    private final String instanceId = UUID.randomUUID().toString();
    @GetMapping("/instance-info")
    public String getInstanceInfo() {
// Log to the console (optional but useful for demonstration)
        System.out.println("Request received at instance running on port: " +
                port);
// Return the response body
        return "Instance served by port: " + port + " | Instance ID: " +
                instanceId;
    }
}
