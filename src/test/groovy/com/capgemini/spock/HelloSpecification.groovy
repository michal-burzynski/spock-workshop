package com.capgemini.spock

import spock.lang.Specification;

class HelloSpecification extends Specification {
	
	def "should return Hello world"() {
		given:
		def hello = new Hello()
		when:
		def result = hello.sayHello()
		then:
		result == "Hello world1"
	}
}
