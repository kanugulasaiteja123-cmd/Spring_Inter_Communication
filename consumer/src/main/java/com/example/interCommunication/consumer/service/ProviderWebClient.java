package com.example.interCommunication.consumer.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;
@Service
@RequiredArgsConstructor
public class ProviderWebClient {
    private final WebClient webClient; // Injected from the central config
    public Mono<String> getInstanceInfo() {
        return webClient.get()
                .uri("/instance-info")
                .retrieve()
                .bodyToMono(String.class);
    }
// Other methods for different endpoints can be added here
// public Mono<String> getOtherEndpoint() { ... }
}
