package com.vinay.poc_activemq_sender.controller;

import com.vinay.poc_activemq_sender.queue.Producer;
import com.vinay.poc_activemq_sender.topic.Publisher;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping("/activemq")
public class MessageSenderController {

    private final Producer producer;
    private final Publisher publisher;

    @GetMapping("/message-queue")
    public void sendMessageToQueue() {
        producer.sendMessage();
    }

    @GetMapping("/message-topic")
    public void sendMessageToTopic() {
        publisher.sendOrder();
    }

}
