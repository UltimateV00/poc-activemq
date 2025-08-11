package com.vinay.activemqdemo.topic;

import lombok.Data;

import java.io.Serializable;

@Data
public class Order implements Serializable {
    private String orderId;
    private String product;
    private int quantity;

}
