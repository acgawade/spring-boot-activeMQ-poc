package com.achyutg.activemqpoc.eventHandler;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class ActiveMQConsumer {

	@JmsListener(destination = "inmemory.queue")
	public void listener(String message) {
		System.out.println("Received the message 1 as : " + message);
	}

	@JmsListener(destination = "inmemory.queue")
	public void listener2(String message) {
		System.out.println("Received the message 2 as : " + message);
	}

}
