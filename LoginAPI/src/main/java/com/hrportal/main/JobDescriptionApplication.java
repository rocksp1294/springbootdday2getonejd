package com.hrportal.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JobDescriptionApplication {
	public static void main(String[] args) {
		SpringApplication.run(JobDescriptionApplication.class, args);
		System.out.println("spring boot deployed successfully");
	}
}
