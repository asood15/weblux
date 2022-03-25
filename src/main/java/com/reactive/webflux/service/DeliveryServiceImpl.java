package com.reactive.webflux.service;

import com.reactive.webflux.domain.Delivery;
import com.reactive.webflux.repository.DeliveryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class DeliveryServiceImpl implements DeliveryService {
    @Autowired
    private DeliveryRepository deliveryRepository;

    @Override
    public Flux<Delivery> getAllDeliveries() {
        return deliveryRepository.findAll();
    }

    @Override
    public Mono<Delivery> getDeliveryById(final int id) {
        return deliveryRepository.findById(id);
    }
}
