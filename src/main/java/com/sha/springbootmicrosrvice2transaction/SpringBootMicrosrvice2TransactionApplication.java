package com.sha.springbootmicrosrvice2transaction;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@PropertySource("classpath:application-${spring.profiles.active:default}.properties")
public class SpringBootMicrosrvice2TransactionApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootMicrosrvice2TransactionApplication.class, args);
	}

}
