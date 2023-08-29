package com.example.tema3.tema3.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Setter
@Getter
@NoArgsConstructor
public class OrderDetails {
    @Id
    @GeneratedValue
    Integer id;

    String product_code;

    Integer quantity;

    Double priceEach;

    @ManyToOne
    @JoinColumn(name = "code")
    Product product;

    @ManyToOne
    @JoinColumn(name = "order_id")
    Order order;

    public OrderDetails(String product_code, Integer quantity, Double priceEach) {
        this.product_code = product_code;
        this.quantity = quantity;
        this.priceEach = priceEach;
    }
}
