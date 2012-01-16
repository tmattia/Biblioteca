package com.twu.biblioteca;

import java.util.ArrayList;

public class ListBooksAction implements Action {
	
	final static public String LIST_OF_BOOKS_MSG = "List of Books in the library:";
	
	private Console console;
	private ArrayList<Book> booksList;

	public ListBooksAction(Console console, ArrayList<Book> booksList) {
		this.console = console;
		this.booksList = booksList;
	}

	@Override
	public void execute() {
		console.println(LIST_OF_BOOKS_MSG);
		for (Book book : booksList) {
			console.println(book.toString());
		}
	}

}
