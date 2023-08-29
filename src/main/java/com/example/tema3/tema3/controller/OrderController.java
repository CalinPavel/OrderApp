package com.example.tema3.tema3.controller;

import com.example.tema3.tema3.Service.CustomerService;
import com.example.tema3.tema3.Service.OrderService;
import com.example.tema3.tema3.Service.ProductService;
import com.example.tema3.tema3.dto.Item;
import com.example.tema3.tema3.model.Customer;
import com.example.tema3.tema3.model.Order;
import com.example.tema3.tema3.model.Product;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class OrderController {

    public final OrderService orderService;
    private CustomerService customerService;

    public OrderController(OrderService orderService ,CustomerService customerService){
        this.orderService = orderService;
        this.customerService = customerService;
    }

    @PostMapping(value = "/insertOrder")
    public Order insertOrder(@RequestBody Order order){
        return orderService.insertOrder(order);
    }

    @GetMapping("/orders/{customerId}")
    public List<Order> getOrdersByCustomerId(@PathVariable Integer customerId) {
        return orderService.findByCustomerId(customerId);
    }

    @PostMapping("/addOrderWithProducts/{count}")
    public void addOrderWithProducts(@RequestBody Item item , @PathVariable Integer count) {
        orderService.addProductByUserId(item, count);
    }

}
