package com.example.testrevert;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TestrevertApplication {

	public static void main(String[] args) {
		System.out.println("teste 1");

		System.out.println("teste 2");

		SpringApplication.run(TestrevertApplication.class, args);
	}

}
