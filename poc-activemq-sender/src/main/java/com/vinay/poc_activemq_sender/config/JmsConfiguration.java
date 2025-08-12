package com.vinay.poc_activemq_sender.config;

import jakarta.jms.ConnectionFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jms.core.JmsTemplate;

@Configuration
public class JmsConfiguration {

    /**
     * Creates a JmsTemplate specifically for sending messages to queues.
     * By default, pubSubDomain is false.
     *
     * @param connectionFactory The JMS connection factory.
     * @return A JmsTemplate for queue messaging.
     */
    @Bean
    public JmsTemplate queueJmsTemplate(ConnectionFactory connectionFactory) {
        return new JmsTemplate(connectionFactory);
    }

    /**
     * Creates a JmsTemplate specifically for sending messages to topics.
     * Explicitly sets the pub-sub domain to true for this template.
     *
     * @param connectionFactory The JMS connection factory.
     * @return A JmsTemplate for topic messaging.
     */
    @Bean
    public JmsTemplate topicJmsTemplate(ConnectionFactory connectionFactory) {
        JmsTemplate jmsTemplate = new JmsTemplate(connectionFactory);
        jmsTemplate.setPubSubDomain(true);
        return jmsTemplate;
    }

}
