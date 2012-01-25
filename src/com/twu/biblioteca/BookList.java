package com.twu.biblioteca;


public class BookList extends RecordList<Book> {
	
	public boolean contains(int bookNumber) {
		for (Record book : this) {
			if (((Book) book).getNumber() == bookNumber) {
				return true;
			}
		}
		return false;
	}

}
