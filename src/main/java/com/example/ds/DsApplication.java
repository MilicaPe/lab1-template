package com.example.ds;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication
public class DsApplication {

	public static void main(String[] args) {
		SpringApplication.run(DsApplication.class, args);
	}

}
