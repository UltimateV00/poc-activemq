package com.vinay.activemqdemo.topic;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Component;

@Slf4j
@RequiredArgsConstructor
@Component
public class Publisher {

    private final JmsTemplate topicJmsTemplate;

    // The message sent by the Publisher should be received by both Subscribers
    // because topics follow publisher-subscriber (one-to-many) model of communication.
    public void sendOrder() {
        Order order = new Order();
        order.setOrderId("Ord-123");
        order.setProduct("Macbook");
        order.setQuantity(1);

        String topicName = "exampleTopic";

        log.info("Sending object: {} to topic: {}", order, topicName);
        topicJmsTemplate.convertAndSend(topicName, order);
    }
}
