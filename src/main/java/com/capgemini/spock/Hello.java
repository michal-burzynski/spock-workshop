package com.capgemini.spock;

public class Hello {
			
	private int id;
	private String word;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getWord() {
		return word;
	}
	public void setWord(String word) {
		this.word = word;
	}
	
	public String sayHello(String language) throws IllegalArgumentException {
		if (language == null) {
			throw new IllegalArgumentException("Language should be neither null nor empty");
		}
		
		String result = "Hello world";
		switch (language) {
			case "pl": 	result = "Dzien dobry";
					   	break;
			case "de": 	result = "Guten Morgen";
			   		   	break;
			case "en":  result = "Good morning";
						break;
		}
		return result;
	}
	
	@Override
	public String toString() {
		return "Hello [id=" + id + ", word=" + word + "]";
	}		
	
}
