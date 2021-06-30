package com.dhitha.petstoreapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = "com.dhitha")
@EnableJpaRepositories(basePackages = "com.dhitha")
@EntityScan(basePackages = "com.dhitha")
public class PetstoreApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(PetstoreApiApplication.class, args);
	}

}
