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
	@Override
	public String toString() {
		return "Hello [id=" + id + ", word=" + word + "]";
	}

}
