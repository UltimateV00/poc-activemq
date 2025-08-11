package com.vinay.activemqdemo.queue;

import com.vinay.activemqdemo.constant.Constant;
import jakarta.jms.JMSException;
import jakarta.jms.TextMessage;
import lombok.extern.slf4j.Slf4j;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class Consumer2 {

    @JmsListener(destination = Constant.QUEUE_NAME, containerFactory = Constant.QUEUE_LISTENER_FACTORY)
    public void receiveMessage(TextMessage textMessage) throws JMSException {
        log.info("Received message: {}", textMessage.getText());
    }

}
