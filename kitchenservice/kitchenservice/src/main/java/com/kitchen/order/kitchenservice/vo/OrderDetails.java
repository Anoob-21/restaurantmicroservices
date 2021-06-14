package com.kitchen.order.kitchenservice.vo;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class OrderDetails {

    private String customerId;
    private String orderDetails;
    private String message;
    private Boolean flag = Boolean.TRUE;
}