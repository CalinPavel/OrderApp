package com.example.tema3.tema3.controller;

import com.example.tema3.tema3.Service.CustomerService;
import com.example.tema3.tema3.dto.PostalDetailsUserDTO;
import com.example.tema3.tema3.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping("/user-postal-details/{username}")
    public ResponseEntity<?> getUserPostalDetails(@PathVariable String username) {
        Customer customer = customersService.findByUsername(username);

        if(customer == null){
            String errorMessage = "User not found with username: " + username;
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(errorMessage);
        }

        PostalDetailsUserDTO dto = new PostalDetailsUserDTO();
        dto.setAddress(customer.getAddress());
        dto.setPhone(customer.getPhone());
        dto.setCity(customer.getCity());

        return ResponseEntity.ok(dto);
    }

}
