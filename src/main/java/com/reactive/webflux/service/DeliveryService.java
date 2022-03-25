package com.reactive.webflux.service;

import com.reactive.webflux.domain.Delivery;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface DeliveryService {
    public Flux<Delivery> getAllDeliveries();
    public Mono<Delivery> getDeliveryById(int id);
}
