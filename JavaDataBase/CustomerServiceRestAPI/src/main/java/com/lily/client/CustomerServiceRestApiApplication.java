package com.lily.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.lily")
public class CustomerServiceRestApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(CustomerServiceRestApiApplication.class, args);
	}

}
