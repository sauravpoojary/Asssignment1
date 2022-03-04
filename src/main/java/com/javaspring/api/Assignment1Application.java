package com.javaspring.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class Assignment1Application extends SpringBootServletInitializer {
	
//	@Override
//    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
//        return builder.sources(Assignment1Application.class);
//    }

	public static void main(String[] args) {
		SpringApplication.run(Assignment1Application.class, args);
	}

}
