package com.vinay.poc_activemq_sender;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jms.annotation.EnableJms;

@SpringBootApplication
@EnableJms
public class PocActivemqSenderApplication {

	public static void main(String[] args) {
		SpringApplication.run(PocActivemqSenderApplication.class, args);
	}

}
