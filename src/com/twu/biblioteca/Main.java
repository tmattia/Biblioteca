package com.twu.biblioteca;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		Console console = new Console();

		Book book1 = new Book(1, "First Book");
		Book book2 = new Book(2, "Second Book");
		ArrayList<Book> booksList = new ArrayList<Book>();
		booksList.add(book1);
		booksList.add(book2);
		
		ListBooksAction listBooksAction = new ListBooksAction(console, booksList);
		MenuOption listBooksOption = new MenuOption(1, "List books", listBooksAction);
		
		CheckLibraryNumberAction checkLibraryNumberAction = new CheckLibraryNumberAction(console);
		MenuOption checkLibraryNumberOption = new MenuOption(2, "Check Library number", checkLibraryNumberAction);
		
		ArrayList<MenuOption> options = new ArrayList<MenuOption>();
		options.add(listBooksOption);
		options.add(checkLibraryNumberOption);
		Menu menu = new Menu(options);
		
		Application app = new Application(console, menu);
		app.start();
	}
	
}
