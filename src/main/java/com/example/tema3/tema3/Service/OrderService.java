package com.example.tema3.tema3.Service;

import com.example.tema3.tema3.dto.Item;
import com.example.tema3.tema3.model.Customer;
import com.example.tema3.tema3.model.Order;
import com.example.tema3.tema3.model.OrderDetails;
import com.example.tema3.tema3.repository.CustomerRepository;
import com.example.tema3.tema3.repository.OrderRepository;
import com.example.tema3.tema3.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Service
public class OrderService {

    public final OrderRepository orderRepository;
    public final CustomerRepository customerRepository;

    public final ProductRepository productRepository;


    @Autowired
    public OrderService (OrderRepository orderRepository, CustomerRepository customerRepository, ProductRepository productRepository){
        this.orderRepository = orderRepository;
        this.customerRepository = customerRepository;
        this.productRepository = productRepository;
    }

    public Order insertOrder(Order o){
        return orderRepository.save(o);
    }

    public List<Order> findByCustomerId(Integer id){
        List<Order> all = orderRepository.findAll();
        List<Order> out = new ArrayList<>();
        for (Order itr : all)
            if(Objects.equals(itr.getId(), id))
                out.add(itr);
        return out;
    }

    public void addProductByUserId(Item item , Integer count){
        List<Customer> all = customerRepository.findAll();
        List<Order> orderList = new ArrayList<>();

        for (Customer itr : all)
            if(itr.getId().equals(item.getCustomerId()))
                orderList = itr.getOrderList();

        if(!orderList.isEmpty())
            for (Order itr2 : orderList)
                if(itr2.getId().equals(item.getOrderId()))
                    itr2.getOrderDetailsList().add(new OrderDetails(String.valueOf(item.getProductId()) ,count , productRepository.findById(item.getProductId()).get().getPrice()));
    }

}
