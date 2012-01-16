package com.twu.biblioteca;

public class Application {
	
	public final static String WELCOME_MSG = "Welcome to the Bangalore Public Library System!";
	public final static String SELECT_OPTION_MSG = "Type the number of the option and press return:";
	public final static String INVALID_OPTION_MSG = "The option you have entered does not exist, please try again. An option should be entered a single integer number. For example, input \"3\" (without the quotes) to select the third option of the menu.";
	
	Console console;
	Menu menu;
	
	public Application(Console console, Menu menu) {
		this.console = console;
		this.menu = menu;
	}
	
	public void start() {
		console.println(WELCOME_MSG);
		console.println(menu.toString());
		console.println(SELECT_OPTION_MSG);
		int optionKey = console.readInteger();
		if (menu.isValidOption(optionKey)) {
			MenuOption option = menu.getOption(optionKey);
			option.execute();
		} else {
			console.println(INVALID_OPTION_MSG);
		}
	}

}
