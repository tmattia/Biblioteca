package com.twu.biblioteca;


public class ReserveBookAction implements Action {
	
	public final static String ENTER_BOOK_NUMBER_MSG = "Please enter the number of the Book you wish to reserve:";
	public static final String BOOK_RESERVED = "Thank you! Enjoy the book.";
	public static final String BOOK_NOT_RESERVED = "Sorry we don't have that book yet.";
	
	private Console console;
	private BookList bookList;
	private Authenticator authenticator;
	
	public ReserveBookAction(Console console, BookList bookList, Authenticator authenticator) {
		this.console = console;
		this.bookList = bookList;
		this.authenticator = authenticator;
	}

	@Override
	public void execute() {
		if (!authenticator.isLoggedIn()) {
			authenticator.requireLogin();
		}
		
		console.println(ENTER_BOOK_NUMBER_MSG);
		int bookNumber = console.readInteger();
		if (bookList.contains(bookNumber)) {
			console.println(BOOK_RESERVED);
		} else {
			console.println(BOOK_NOT_RESERVED);
		}
	}

}
