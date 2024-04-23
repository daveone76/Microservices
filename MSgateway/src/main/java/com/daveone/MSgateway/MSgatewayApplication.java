package com.daveone.MSgateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


@EnableDiscoveryClient
@SpringBootApplication
public class MSgatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(MSgatewayApplication.class, args);
	}

}
