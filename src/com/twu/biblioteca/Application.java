package com.twu.biblioteca;

public class Application {
	
	public final static String WELCOME_MESSAGE = "Welcome to the Bangalore Public Library System!";
	
	Printer printer;
	Menu menu;
	
	public Application(Printer printer, Menu menu) {
		this.printer = printer;
		this.menu = menu;
	}
	
	public void start() {
		printer.println(WELCOME_MESSAGE);
		printer.println(menu.toString());
	}

}
