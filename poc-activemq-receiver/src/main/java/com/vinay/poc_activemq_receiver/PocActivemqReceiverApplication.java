package com.vinay.poc_activemq_receiver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jms.annotation.EnableJms;

@SpringBootApplication
@EnableJms
public class PocActivemqReceiverApplication {

	public static void main(String[] args) {
		SpringApplication.run(PocActivemqReceiverApplication.class, args);
	}

}
