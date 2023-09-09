package com.example;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
@MapperScan(basePackages = "com.example.dao")
public class Springboot019TransactionalApplication {

	public static void main(String[] args) {
		SpringApplication.run(Springboot019TransactionalApplication.class, args);
	}

}
