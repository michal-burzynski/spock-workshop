package com.capgemini.spock

import spock.lang.Specification;

class FirstSpecification extends Specification {
	
	def "should add two integers"() {
		given:
		def a = 1
		def b = 3
		when:
		def result = Math.max(a, b)
		then:
		result == 3
	}

}
