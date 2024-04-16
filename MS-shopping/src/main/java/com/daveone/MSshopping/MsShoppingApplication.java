package com.daveone.MSshopping;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class MsShoppingApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsShoppingApplication.class, args);
	}

}
