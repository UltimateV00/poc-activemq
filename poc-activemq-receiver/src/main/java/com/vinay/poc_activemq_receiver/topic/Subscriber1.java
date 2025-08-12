package com.vinay.poc_activemq_receiver.topic;

import com.google.gson.Gson;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Slf4j
@RequiredArgsConstructor
@Component
public class Subscriber1 {

    private final Gson gson;

    @JmsListener(destination = "exampleTopic", containerFactory = "topicListenerFactory")
    public void receiveOrder(String jsonMessage) {
        log.info("Received json message: {}", jsonMessage);

        try {
            Order order = gson.fromJson(jsonMessage, Order.class);
            log.info("Successfully received the order: {}", order);
        } catch (Exception e) {
            log.error("Failed to deserialize the json message!");
        }
    }

}
