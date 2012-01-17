package com.twu.biblioteca;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		Console console = new Console();

		Book book1 = new Book(1, "First Book");
		Book book2 = new Book(2, "Second Book");
		BookList bookList = new BookList();
		bookList.add(book1);
		bookList.add(book2);
		
		ListBooksAction listBooksAction = new ListBooksAction(console, bookList);
		MenuOption listBooksOption = new MenuOption(1, "List books", listBooksAction);
		
		CheckLibraryNumberAction checkLibraryNumberAction = new CheckLibraryNumberAction(console);
		MenuOption checkLibraryNumberOption = new MenuOption(2, "Check Library number", checkLibraryNumberAction);
		
		ReserveBookAction reserveBookAction = new ReserveBookAction(console, bookList);
		MenuOption reserveBookOption = new MenuOption(3, "Reserve book", reserveBookAction);
		
		ArrayList<MenuOption> options = new ArrayList<MenuOption>();
		options.add(listBooksOption);
		options.add(checkLibraryNumberOption);
		options.add(reserveBookOption);
		Menu menu = new Menu(options);

		Application app = new Application(console, menu);
		app.start();
	}
	
}
