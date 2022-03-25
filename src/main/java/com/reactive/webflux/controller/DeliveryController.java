package com.reactive.webflux.controller;

import com.reactive.webflux.domain.Delivery;
import com.reactive.webflux.service.DeliveryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.time.Duration;

@RestController
@RequestMapping("/api/v1/delivery")
public class DeliveryController {

    @Autowired
    private DeliveryService deliveryService;

    @GetMapping
    public Flux<Delivery> getAllDeliveries() {
        return deliveryService.getAllDeliveries().log();
    }

    @GetMapping("{id}")
    public Mono<Delivery> getDeliveryById(@PathVariable int id) {
        return deliveryService.getDeliveryById(id);
    }

    @GetMapping(value = "/stream", produces = MediaType.TEXT_EVENT_STREAM_VALUE)
    public Flux<String> getDeliveriesAsStream() {
        return Flux.interval(Duration.ofSeconds(1))
                .log()
                .map(res -> "Hello Webflux streams @ " + res);
    }
}
