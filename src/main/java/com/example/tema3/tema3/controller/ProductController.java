package com.example.tema3.tema3.controller;

import com.example.tema3.tema3.Service.ProductService;
import com.example.tema3.tema3.model.Customer;
import com.example.tema3.tema3.model.Product;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class ProductController {

    public final ProductService productService;

    public ProductController(ProductService productService){
        this.productService = productService;
    }

    @PostMapping(value = "/insertProduct")
    public Product insertProduct(@RequestBody Product product){
        return productService.insertProduct(product);
    }

    @GetMapping(value = "/getAllProducts")
    public List<Product> insertProduct(){
        return productService.getAll();
    }
}
