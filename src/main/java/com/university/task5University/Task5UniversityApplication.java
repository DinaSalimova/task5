package com.university.task5University;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
public class Task5UniversityApplication {

	public static void main(String[] args) {
		SpringApplication.run(Task5UniversityApplication.class, args);
	}

}
