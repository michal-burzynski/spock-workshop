package com.capgemini.spock

class HelloWorld {
	
	static main(args) {
		//print Hello world in console
		println "Hellow world"
		
		//create new Hello object "first" with id = 1, word = "Hello"
		def first = new Hello(id: 1, word: "Hello")
		
		//create new list with "first" object
		def list = [first]
		
		//add new Hello object "second" with id = 2, word = "world" to list
		def second = new Hello(id: 2, word: "world")
		list << second
		
		//list ids for all element from the list to cosole
		println list.id		
				
		//change id = 3, word = Bye in "first" object
		first.with{
			id = 3
			word = "Bye"
		}
		
		//create map with "first" = first, "second" = second
		def map = [first: first, second: second]		
		
		//print map to console
		println map
		
	}
}
