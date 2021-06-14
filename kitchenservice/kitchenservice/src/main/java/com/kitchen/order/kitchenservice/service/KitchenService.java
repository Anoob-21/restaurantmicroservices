package com.kitchen.order.kitchenservice.service;


import com.kitchen.order.kitchenservice.vo.OrderDetails;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class KitchenService {

    public void createKitchenOrder(OrderDetails orderDetails){

        log.info("Oder details is : {}", orderDetails.getCustomerId());
    }
}

