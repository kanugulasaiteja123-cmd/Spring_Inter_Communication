package com.example.interCommunication.consumer.controller;

import com.example.interCommunication.consumer.feign.ProviderFeignClient;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/feign") // Base path for this controller
@RequiredArgsConstructor // Lombok: creates a constructor for final fields
public class FeignController {
    // Inject the Feign client
    private final ProviderFeignClient providerFeignClient;

    @GetMapping("/instance")
    public String getInstance() {
        // Simply call the Feign client method.
        // The HTTP call to the Provider happens behind the scenes.
        return providerFeignClient.getInstanceInfo();
    }
}
