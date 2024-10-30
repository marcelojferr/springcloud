package com.javaproject.customer.springcloud.client.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Customer {

    private Long id;
    private String name;
}