package com.vinay.poc_activemq_sender.topic;

import com.google.gson.Gson;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Component;

@Slf4j
@RequiredArgsConstructor
@Component
public class Publisher {

    private final JmsTemplate topicJmsTemplate;
    private final Gson gson;

    // The message sent by the Publisher should be received by both Subscribers
    // because topics follow publisher-subscriber (one-to-many) model of communication.
    public void sendOrder() {
        String topicName = "exampleTopic";

        Order order = new Order();
        order.setOrderId("Ord-123");
        order.setProduct("Macbook");
        order.setQuantity(1);

        // The order object is converted into a JSON string and then sent to ActiveMQ
        String jsonMessage = gson.toJson(order);

        log.info("Sending message: {} to topic: {}", jsonMessage, topicName);
        topicJmsTemplate.convertAndSend(topicName, jsonMessage);
    }
}
