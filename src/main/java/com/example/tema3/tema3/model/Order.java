package com.example.tema3.tema3.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
import java.util.List;

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

    @OneToMany(mappedBy = "order")
    List<OrderDetails> orderDetailsList;

    @ManyToOne
    @JoinColumn(name = "customer_id")
    Customer customer;

}
