package com.twu.biblioteca;

public class Application {
	
	public final static String WELCOME_MSG = "Welcome to the Bangalore Public Library System!";
	public final static String SELECT_OPTION_MSG = "Type the number of the option and press return:";
	public final static String INVALID_OPTION_MSG = "The option you have entered does not exist, please try again. An option should be entered a single integer number. For example, input \"3\" (without the quotes) to select the third option of the menu.";
	
	Printer printer;
	Menu menu;
	InputReader inputReader;
	
	public Application(Printer printer, Menu menu, InputReader inputReader) {
		this.printer = printer;
		this.menu = menu;
		this.inputReader = inputReader;
	}
	
	public void start() {
		printer.println(WELCOME_MSG);
		printer.println(menu.toString());
		printer.println(SELECT_OPTION_MSG);
		int optionKey = inputReader.readInteger();
		if (menu.isValidOption(optionKey)) {
			MenuOption option = menu.getOption(optionKey);
			option.execute();
		} else {
			printer.println(INVALID_OPTION_MSG);
		}
	}

}
