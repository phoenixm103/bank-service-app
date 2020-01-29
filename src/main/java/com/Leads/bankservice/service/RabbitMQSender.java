package com.Leads.bankservice.service;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import com.Leads.bankservice.common.CustomerVM;
import com.Leads.bankservice.customerservice.CustomerLedger;

@Service
public class RabbitMQSender {
	
	@Autowired
	private AmqpTemplate rabbitTemplate;
 
	@Value("${queue2.rabbitmq.exchange}")
	private String exchange;
 
	@Value("${queue2.rabbitmq.routingkey}")
	private String routingkey;
 
	@Scheduled
	public void send(CustomerLedger customerLedger) {
		//String CustomMessage = "This is a message from sender"+ message;
	
		rabbitTemplate.convertAndSend(exchange, routingkey, customerLedger);
		//System.out.println("Send msg to consumer= " + CustomMessage+" ");
 
	}
}
