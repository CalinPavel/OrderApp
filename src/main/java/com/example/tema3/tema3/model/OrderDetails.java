package com.example.tema3.tema3.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import jakarta.persistence.Id;

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

}
