package com.vinay.poc_activemq_receiver.config;

import jakarta.jms.ConnectionFactory;
import org.springframework.boot.autoconfigure.jms.DefaultJmsListenerContainerFactoryConfigurer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jms.config.DefaultJmsListenerContainerFactory;

@Configuration
public class JmsConfiguration {

    /**
     * Creates a listener factory for consuming messages from queues.
     * By default, pubSubDomain is false.
     *
     * @param configurer        Configures the factory with default settings.
     * @param connectionFactory The JMS connection factory.
     * @return A DefaultJmsListenerContainerFactory for queue messaging.
     */
    @Bean
    public DefaultJmsListenerContainerFactory queueListenerFactory(
            DefaultJmsListenerContainerFactoryConfigurer configurer,
            ConnectionFactory connectionFactory) {
        DefaultJmsListenerContainerFactory factory = new DefaultJmsListenerContainerFactory();
        configurer.configure(factory, connectionFactory);
        return factory;
    }

    /**
     * Creates a listener factory for consuming messages from topics.
     * Explicitly sets the pub-sub domain to true for this factory.
     *
     * @param configurer        Configures the factory with default settings.
     * @param connectionFactory The JMS connection factory.
     * @return A DefaultJmsListenerContainerFactory for topic messaging.
     */
    @Bean
    public DefaultJmsListenerContainerFactory topicListenerFactory(
            DefaultJmsListenerContainerFactoryConfigurer configurer,
            ConnectionFactory connectionFactory) {
        DefaultJmsListenerContainerFactory factory = new DefaultJmsListenerContainerFactory();
        configurer.configure(factory, connectionFactory);
        factory.setPubSubDomain(true);
        return factory;
    }

}
