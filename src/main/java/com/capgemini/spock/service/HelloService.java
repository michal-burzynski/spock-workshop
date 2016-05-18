package com.capgemini.spock.service;

import java.util.ArrayList;
import java.util.List;

import com.capgemini.spock.client.MessageRecipient;

public class HelloService {
	
	private final List<MessageRecipient> recipients;
	
	public HelloService(List<MessageRecipient> recipients) {
		this.recipients = recipients;
	}
	
	public List<String> broadcastMessage(String message) {
		List<String> responseStatuses = new ArrayList<>();
		
		recipients.stream().forEach(recipient ->
		responseStatuses.add(recipient.receiveMessage(message)));
		
		return responseStatuses;
	}
	

}
