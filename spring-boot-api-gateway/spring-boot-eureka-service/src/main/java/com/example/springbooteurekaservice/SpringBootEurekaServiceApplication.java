package com.example.springbooteurekaservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableZuulProxy
@EnableEurekaServer
@SpringBootApplication
public class SpringBootEurekaServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootEurekaServiceApplication.class, args);
	}

}
