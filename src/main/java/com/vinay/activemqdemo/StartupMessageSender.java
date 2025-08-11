package com.vinay.activemqdemo;

import com.vinay.activemqdemo.queue.Producer;
import com.vinay.activemqdemo.topic.Publisher;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Slf4j
@RequiredArgsConstructor
@Component
public class StartupMessageSender implements CommandLineRunner {

    private final Producer producer;
    private final Publisher publisher;

    @Override
    public void run(String... args) {
        producer.sendMessage();
        publisher.sendOrder();
    }

}
