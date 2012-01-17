package com.twu.biblioteca;


public class ReserveBookAction implements Action {
	
	public final static String ENTER_BOOK_NUMBER_MSG = "Please enter the number of the Book you wish to reserve:";
	public static final String BOOK_RESERVED = "Thank you! Enjoy the book.";
	public static final String BOOK_NOT_RESERVED = "Sorry we don't have that book yet.";
	
	private Console console;
	private BookList bookList;
	
	public ReserveBookAction(Console console, BookList bookList) {
		this.console = console;
		this.bookList = bookList;
	}

	@Override
	public void execute() {
		console.println(ENTER_BOOK_NUMBER_MSG);
		int bookNumber = console.readInteger();
		if (bookList.contains(bookNumber)) {
			console.println(BOOK_RESERVED);
		} else {
			console.println(BOOK_NOT_RESERVED);
		}
	}

}
