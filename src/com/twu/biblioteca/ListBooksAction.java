package com.twu.biblioteca;

public class ListBooksAction implements Action {
	
	final static public String LIST_OF_BOOKS_MSG = "List of Books in the library:";
	
	private Console console;
	private BookList bookList;

	public ListBooksAction(Console console, BookList bookList) {
		this.console = console;
		this.bookList = bookList;
	}

	@Override
	public void execute() {
		console.println(LIST_OF_BOOKS_MSG);
		console.println(bookList.toString());
	}

}
