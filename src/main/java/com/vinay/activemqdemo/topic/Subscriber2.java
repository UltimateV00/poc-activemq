package com.vinay.activemqdemo.topic;

import com.vinay.activemqdemo.constant.Constant;
import lombok.extern.slf4j.Slf4j;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class Subscriber2 {

    @JmsListener(destination = Constant.TOPIC_NAME, containerFactory = Constant.TOPIC_LISTENER_FACTORY)
    public void receiveOrder(Order order) {
        log.info("Received order: {}", order);
    }

}
