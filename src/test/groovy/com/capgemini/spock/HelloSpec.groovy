package com.capgemini.spock

import spock.lang.Specification;

class HelloSpec extends Specification{
	
	def "should say 'Hello world' for unknown language"() {
		given:
		
		when:
		
		then:
		
	}
	
	//test min. pl, de, en
	def "should translate greeting"() {
		given:
		def hello = new Hello()
		when:
		
		then:
		result == transaltion
		
		where:
		language	|	transaltion
		
	}
	
	def "should throw exception when language is null"() {
		given:
		def hello = new Hello()
		when:
		def result = hello.sayHello(null)
		then:
		
	}
}
