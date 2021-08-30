package com.thanthu.jmsdemo.listner;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.messaging.Message;
import org.springframework.messaging.MessageHeaders;
import org.springframework.messaging.handler.annotation.Headers;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

import com.thanthu.jmsdemo.config.JmsConfig;
import com.thanthu.jmsdemo.model.HelloWorldMessage;

@Component
public class HelloMessageListener {

	@JmsListener(destination = JmsConfig.MY_QUEUE)
	public void listen(@Payload HelloWorldMessage helloWorldMessage, @Headers MessageHeaders headers, Message message) {

		System.out.println("I Got a Message!!!!!");

		System.out.println(helloWorldMessage);

	}

}
