package com.twu.biblioteca;

public class Application {
	
	Printer printer;
	
	public Application(Printer printer) {
		this.printer = printer;
	}
	
	public void start() {
		printer.println("Welcome to the Bangalore Public Library System!");
	}

}
