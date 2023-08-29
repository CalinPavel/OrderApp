package com.example.tema3.tema3.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Entity
@Table(name = "`order`")
@Setter
@Getter
@NoArgsConstructor
public class Order {
    @Id
    @GeneratedValue
    Integer id;

    Date order_date;

    Date shipped_date;

    String status;

    String comments;

    @ManyToOne
    Customer customer_id;
}
