package com.javaproject.customer.springcloud.client.controller;

import java.util.Arrays;
import java.util.List;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import com.javaproject.customer.springcloud.client.model.Customer;

@Service
public class CustomerController {

    public ResponseEntity<List<Customer>> getAll() {
        Customer customerA = new Customer(1L, "John");
        Customer customerB = new Customer(1L, "Phillip");
        Customer customerC = new Customer(1L, "Mary");

        return ResponseEntity.ok().body(
            Arrays.asList(customerA, customerB, customerC)
        );
    }
}