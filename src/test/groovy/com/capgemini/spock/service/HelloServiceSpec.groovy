package com.capgemini.spock.service

import com.capgemini.spock.client.MessageRecipient;

import spock.lang.Specification;

class HelloServiceSpec extends Specification{
	
	def "should send message once to all recipients"() {
		given:
		def message = "Hello"
		def firstRecipient = Mock(MessageRecipient)
		MessageRecipient secondRecipient = Mock()
		def helloService = new HelloService([firstRecipient, secondRecipient])
		
		when:
		def result = helloService.broadcastMessage(message)
		
		then:
		1 * firstRecipient.receiveMessage(message) >> "ERROR"
		1 * secondRecipient.receiveMessage(message) >> "OK"
		result == ["ERROR", "OK"]
	}
}
