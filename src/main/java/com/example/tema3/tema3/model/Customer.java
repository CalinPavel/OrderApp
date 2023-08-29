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
public class Customer {
    @Id
    @GeneratedValue
    Integer id;

    String username;

    String last_name;

    String first_name;

    String phone;

    String address;

    String city;

    String postalCode;

    String country;
}
