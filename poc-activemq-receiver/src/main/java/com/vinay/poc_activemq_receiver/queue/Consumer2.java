package com.vinay.poc_activemq_receiver.queue;

import lombok.extern.slf4j.Slf4j;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class Consumer2 {

    @JmsListener(destination = "exampleQueue", containerFactory = "queueListenerFactory")
    public void receiveMessage(String message) {
        log.info("Received message: {}", message);
    }

}
