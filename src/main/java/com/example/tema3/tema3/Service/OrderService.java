package com.example.tema3.tema3.Service;

import com.example.tema3.tema3.model.Order;
import com.example.tema3.tema3.repository.OrderRepository;
import org.antlr.v4.runtime.atn.SemanticContext;
import org.aspectj.weaver.ast.Or;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Service
public class OrderService {

    public final OrderRepository orderRepository;

    @Autowired
    public OrderService (OrderRepository orderRepository){
        this.orderRepository = orderRepository;
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

}
