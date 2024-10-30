package com.javaproject.customer.springcloud.client.controller;

import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.javaproject.customer.springcloud.client.model.Product;
import com.javaproject.customer.springcloud.client.service.ProductService;

@RestController
@RequestMapping("/product/v1")
public class ProductController {

    private ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping
    public ResponseEntity<List<Product>> getAll(@RequestHeader(value = "Authorization") String token) {

        try {
            return ResponseEntity.ok().body(this.productService.getAll(token));
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.FORBIDDEN).build();
        }
    }
    
}