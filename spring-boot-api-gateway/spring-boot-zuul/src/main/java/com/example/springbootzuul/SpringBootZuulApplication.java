package com.example.springbootzuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;
import com.example.springbootzuul.filters.ErrorFilter;
import com.example.springbootzuul.filters.PostFilter;
import com.example.springbootzuul.filters.PreFilter;
import com.example.springbootzuul.filters.RouteFilter;

@SpringBootApplication
@EnableZuulProxy
public class SpringBootZuulApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootZuulApplication.class, args);
	}

	@Bean
	public PreFilter preFilter() {
		return new PreFilter();
	}
	@Bean
	public PostFilter postFilter() {
		return new PostFilter();
	}
	@Bean
	public ErrorFilter errorFilter() {
		return new ErrorFilter();
	}
	@Bean
	public RouteFilter routeFilter() {
		return new RouteFilter();
	}

}
