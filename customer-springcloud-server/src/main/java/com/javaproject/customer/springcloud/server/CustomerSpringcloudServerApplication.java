package com.javaproject.customer.springcloud.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class CustomerSpringcloudServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(CustomerSpringcloudServerApplication.class, args);
	}

}
