package com.restaurant.restaurantgateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

@SpringBootApplication
@EnableHystrix
public class RestaurantgatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(RestaurantgatewayApplication.class, args);
    }

}
