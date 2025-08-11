package com.vinay.activemqdemo.queue;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Component;

@Slf4j
@RequiredArgsConstructor
@Component
public class Producer {

    private final JmsTemplate queueJmsTemplate;

    // The message sent by the Producer should be received by only 1 Consumer
    // even though there are 2 Consumers listening because queues follow point-to-point
    // communication.
    public void sendMessage() {
        String message = "Hello from the Spring Boot producer!";
        String queueName = "exampleQueue";

        log.info("Sending message: {} to queue: {}", message, queueName);
        queueJmsTemplate.convertAndSend(queueName, message);
    }

}
