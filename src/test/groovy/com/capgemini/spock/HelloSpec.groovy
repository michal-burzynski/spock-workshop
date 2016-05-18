package com.capgemini.spock

import spock.lang.Specification;

//complete code that all tests pass
class HelloSpec extends Specification{
	
	def "should say 'Hello world' for unknown language"() {
		given:
		def hello = new Hello()
		when:
		def result = hello.sayHello("xx")
		then:
		result == "Hello world"
	}
	
	//test min. pl, de, en
	def "should translate greeting"() {
		given:
		def hello = new Hello()
		when:
		def result = hello.sayHello(language)
		then:
		result == transaltion
		
		where:
		language	|	transaltion
		"pl"		|	"Dzien dobry"
		"de"		| 	"Guten Morgen"
		"en"		| 	"Good morning"
		"test"		|	"Hello world"
		""			|	"Hello world"
	}
	
	def "should throw exception when language is null"() {
		given:
		def hello = new Hello()
		when:
		def result = hello.sayHello(null)
		then:
		thrown(IllegalArgumentException)
	}
}
