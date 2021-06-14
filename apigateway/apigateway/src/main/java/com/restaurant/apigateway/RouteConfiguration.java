package com.restaurant.apigateway;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RouteConfiguration {

    @Bean
    public RouteLocator myRoutes(RouteLocatorBuilder builder) {
        return builder.routes().build();
    }

    @Bean
    public RouteLocator restaurantRoute(RouteLocatorBuilder builder) {

        return builder.routes()
                .route(p -> p
                        .path("/restaurantorder/*")
                        .filters(f -> f.hystrix(config -> {
                            config
                                    .setName("restaurant-order")
                                    .setFallbackUri("forward:/fallback/accountFallback");
                        }))

                        .uri("lb://RESTAURANTORDER"))
                .build();
    }

}