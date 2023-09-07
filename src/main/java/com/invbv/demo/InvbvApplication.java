package com.invbv.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
public class InvbvApplication {

	public static void main(String[] args) {
		SpringApplication.run(InvbvApplication.class, args);
	}

}
