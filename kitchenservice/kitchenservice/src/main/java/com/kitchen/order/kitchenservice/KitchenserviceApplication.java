package com.kitchen.order.kitchenservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class KitchenserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(KitchenserviceApplication.class, args);
	}

}
