package com.reactive.webflux.repository;

import com.reactive.webflux.domain.Delivery;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DeliveryRepository extends ReactiveCrudRepository<Delivery, Integer> {

}
