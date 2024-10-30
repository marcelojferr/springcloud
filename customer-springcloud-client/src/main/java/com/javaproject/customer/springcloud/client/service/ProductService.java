package com.javaproject.customer.springcloud.client.service;

import java.util.Arrays;
import java.util.List;

import com.javaproject.customer.springcloud.client.exception.UnauthorizedException;
import com.javaproject.customer.springcloud.client.model.Product;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

    private AuthenticationService authenticationService;

    public ProductService(AuthenticationService authenticationService) {
        this.authenticationService = authenticationService;
    }

    public List<Product> getAll(String token) throws Exception {

        if (this.authenticationService.isValid(token)) {

            Product productA = new Product(1L, "iPhone", 300.0);
            Product productB = new Product(2L, "Television", 100.0);
            Product productC = new Product(3L, "Mouse", 8.0);
    
            return Arrays.asList(productA, productB, productC);
        
        } else {
            throw new UnauthorizedException("Not authorized");
        }

    }
}