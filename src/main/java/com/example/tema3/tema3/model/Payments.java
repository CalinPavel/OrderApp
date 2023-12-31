package com.example.tema3.tema3.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Entity
@Setter
@Getter
@NoArgsConstructor
public class Payments {
    @Id
    @GeneratedValue
    Integer customer_id;

    Date payment_date;

    Double amount;

    @ManyToOne
    @JoinColumn(name = "customer")
    Customer customer;
}
