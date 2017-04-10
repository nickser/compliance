package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories({"com.example.repositories.mongo"})
@EnableJpaRepositories({"com.example.repositories.jpa"})
public class ComplianceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ComplianceApplication.class, args);
	}
}
