package com.reactive.webflux.domain;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Data
@Table
public class Delivery {
    @Id
    private int id;

    private String itemName;
    private long quantity;
    private String userName;
}
