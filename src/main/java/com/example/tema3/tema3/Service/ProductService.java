package com.example.tema3.tema3.Service;

import com.example.tema3.tema3.model.Customer;
import com.example.tema3.tema3.model.Product;
import com.example.tema3.tema3.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {


    public final ProductRepository productRepository;

    @Autowired
    ProductService (ProductRepository productService){
        this.productRepository = productService;
    }

    public Product insertProduct(Product p){
        return productRepository.save(p);
    }

    public List<Product> getAll(){
        return productRepository.findAll();
    }
}
