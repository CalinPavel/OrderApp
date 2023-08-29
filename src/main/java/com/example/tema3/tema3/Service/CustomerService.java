package com.example.tema3.tema3.Service;

import com.example.tema3.tema3.model.Customer;
import com.example.tema3.tema3.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {
    @Autowired
    CustomerRepository customersRepository;

    public Customer CreateCustomer(Customer c){
        return  customersRepository.save(c);
    }

    public Customer findByUsername(String username){
        List<Customer> all = customersRepository.findAll();
        for (Customer itr : all)
            if(itr.getUsername().equals(username))
                return itr;
        return null;
    }
}
