package com.restaurant.restaurantgateway;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/fallback")
public class FallbackController {

    @GetMapping("/orderFallback")
    public ResponseEntity<String> orderServiceFallback() {
        return new ResponseEntity<>("We are facing some issue with order. Please contact support",
                HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
