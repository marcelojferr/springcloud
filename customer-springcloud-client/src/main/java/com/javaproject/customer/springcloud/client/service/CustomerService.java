package com.javaproject.customer.springcloud.client.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.javaproject.customer.springcloud.client.exception.UnauthorizedException;
import com.javaproject.customer.springcloud.client.model.Customer;
import com.javaproject.customer.springcloud.client.model.Product;

@RestController
@RequestMapping("/customer/v1")
public class CustomerService {

    private AuthenticationService authenticationService;

    public CustomerService(AuthenticationService authenticationService) {
        this.authenticationService = authenticationService;
    }

    @GetMapping
    public List<Customer> getAll(String token) {

        if (this.authenticationService.isValid(token)) {

        	  Customer customerA = new Customer(1L, "John");
              Customer customerB = new Customer(1L, "Phillip");
              Customer customerC = new Customer(1L, "Mary");
    
            return Arrays.asList(customerA, customerB, customerC);
        
        } else {
            throw new UnauthorizedException("Not authorized");
        }
    }
}