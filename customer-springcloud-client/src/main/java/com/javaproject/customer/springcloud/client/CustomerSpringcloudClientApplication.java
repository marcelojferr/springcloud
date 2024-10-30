package com.javaproject.customer.springcloud.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class CustomerSpringcloudClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(CustomerSpringcloudClientApplication.class, args);
	}

}
