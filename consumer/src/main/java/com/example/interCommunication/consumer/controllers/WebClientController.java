package com.example.interCommunication.consumer.controllers;

import com.example.interCommunication.consumer.service.ProviderWebClient;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/api/web-client")
@RequiredArgsConstructor
public class WebClientController {
    private final ProviderWebClient providerWebClient; // Inject the service

    @GetMapping("/instance")
    public Mono<String> getInstance() {
// Simply delegate the call
        return providerWebClient.getInstanceInfo();
    }
}
