package com.kitchen.order.kitchenservice.config;

import com.google.gson.Gson;
import com.kitchen.order.kitchenservice.service.KitchenService;
import com.kitchen.order.kitchenservice.vo.OrderDetails;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
@Slf4j
public class CreateOrderListener {

    @Autowired
    KitchenService kitchenService;

    public void receiveOrder(byte[] message) {
        String massageFromRabbitMQ = new String(message);
        log.info(massageFromRabbitMQ);

        if (StringUtils.isNotEmpty(massageFromRabbitMQ)) {
            Gson gson = new Gson();
            Optional<OrderDetails> orderEvent = Optional.of(gson.fromJson(massageFromRabbitMQ, OrderDetails.class));
            if (orderEvent.isPresent()) {
                kitchenService.createKitchenOrder(orderEvent.get());
            }else{
                log.error("Unable to convert message {}", massageFromRabbitMQ) ;
            }


        }

    }
}