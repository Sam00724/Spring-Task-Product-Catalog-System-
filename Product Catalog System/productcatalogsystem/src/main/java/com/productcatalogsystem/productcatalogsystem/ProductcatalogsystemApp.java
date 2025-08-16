package com.productcatalogsystem.productcatalogsystem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProductcatalogsystemApp {

	public static void main(String[] args) {
		SpringApplication.run(ProductcatalogsystemApp.class, args);
		System.out.println("Hello!");
		for (int i = 1; i <= 5; i++) {
			System.out.println("i = " + i);
		}
	}

}
