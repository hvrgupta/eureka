package com.ecommerce.consumer.webclient;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@Service
@RequiredArgsConstructor
public class ProviderWebClient {
    private final WebClient webClient;

    public Mono<String> getInstace() {
        return webClient.get().uri("/instance-info").retrieve().bodyToMono(String.class);
    }
}
