package com.vinay.poc_activemq_receiver.topic;

import lombok.Data;

@Data
public class Order {
    private String orderId;
    private String product;
    private int quantity;
}
