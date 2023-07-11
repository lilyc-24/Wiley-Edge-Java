package com.lily.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = "com.lily")
@EntityScan(basePackages = "com.lily.dto")
@EnableJpaRepositories(basePackages = "com.lily.model.persistance")
public class ShareServiceRestApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(ShareServiceRestApiApplication.class, args);
	}

}
