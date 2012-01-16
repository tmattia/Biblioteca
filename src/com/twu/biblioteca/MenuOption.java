package com.twu.biblioteca;

public class MenuOption {
	
	private int key;
	private String description;
	private Action action;

	public MenuOption(int key, String description, Action action) {
		this.key = key;
		this.description = description;
		this.action = action;
	}
	
	public String toString() {
		return key + ". " + description;
	}

	public int getKey() {
		return key;
	}
	
	public void execute() {
		action.execute();
	}

}
