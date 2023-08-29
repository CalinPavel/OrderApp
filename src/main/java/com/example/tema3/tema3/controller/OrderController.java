package com.example.tema3.tema3.controller;

import com.example.tema3.tema3.Service.OrderService;
import com.example.tema3.tema3.Service.ProductService;
import com.example.tema3.tema3.model.Order;
import com.example.tema3.tema3.model.Product;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class OrderController {

    public final OrderService orderService;

    public OrderController(OrderService orderService){
        this.orderService = orderService;
    }

    @PostMapping(value = "/insertOrder")
    public Order insertOrder(@RequestBody Order order){
        return orderService.insertOrder(order);
    }

    @GetMapping("/orders/{customerId}")
    public List<Order> getOrdersByCustomerId(@PathVariable Integer customerId) {
        return orderService.findByCustomerId(customerId);
    }

}
