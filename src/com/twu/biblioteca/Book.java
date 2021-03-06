package com.twu.biblioteca;

public class Book implements Record {
	
	private int number;
	private String description;

	public Book(int number, String description) {
		this.number = number;
		this.description = description;
	}
	
	public String toString() {
		return number + ". " + description;
	}

	public int getNumber() {
		return number;
	}

}
