package com.example.tema3.tema3.controller;

import com.example.tema3.tema3.Service.CustomerService;
import com.example.tema3.tema3.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class CustomerController {
    public final CustomerService customersService;

    @Autowired
    public CustomerController(CustomerService customersService){
        this.customersService = customersService;
    }

    @PostMapping(value = "/createCustomer")
    public Customer CreateCustomer(@RequestBody Customer customer){
        return customersService.CreateCustomer(customer);
    }
}
