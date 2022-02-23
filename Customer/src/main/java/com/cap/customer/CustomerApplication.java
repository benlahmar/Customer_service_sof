package com.cap.customer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.actuate.trace.http.HttpTraceRepository;
import org.springframework.boot.actuate.trace.http.InMemoryHttpTraceRepository;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;

import org.springframework.security.crypto.bcrypt.*;
@SpringBootApplication
@EnableEurekaClient
public class CustomerApplication {

	public static void main(String[] args) {
		SpringApplication.run(CustomerApplication.class, args);
	}
	
	@Bean
	public HttpTraceRepository httpTraceRepository()
	{
		return new InMemoryHttpTraceRepository();
	}
	
	@Bean
	public BCryptPasswordEncoder  bCryptPasswordEncoder()
	{
		return new BCryptPasswordEncoder();
	}
}
