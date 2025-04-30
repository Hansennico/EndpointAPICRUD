package com.hansen.EndpointAPI;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.hansen.EndpointAPI"})
@EntityScan(basePackages = {"com.hansen.EndpointAPI.model"})
public class EndpointApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(EndpointApiApplication.class, args);
	}

}
