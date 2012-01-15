package com.twu.biblioteca;

public class MenuOption {
	
	private int order;
	private String description;

	public MenuOption(int order, String description) {
		this.order = order;
		this.description = description;
	}
	
	public String toString() {
		return order + ". " + description;
	}

}
