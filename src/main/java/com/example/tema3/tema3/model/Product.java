package com.example.tema3.tema3.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@NoArgsConstructor
@Getter
@Setter
public class Product {
    @Id
    @GeneratedValue
    Integer code;

    String name;

    String description;

    Integer stock;

    Double price;

    @OneToMany(mappedBy = "product")
    List<OrderDetails> orderDetailsList;
}
