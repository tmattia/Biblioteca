package com.twu.biblioteca;

import java.util.ArrayList;

public class BookList extends ArrayList<Book> {
	
	public boolean contains(int bookNumber) {
		for (Book book : this) {
			if (book.getNumber() == bookNumber) {
				return true;
			}
		}
		return false;
	}
	
	public String toString() {
		String ret = "";
		for (Book book : this) {
			ret += book.toString() + "\n";
		}
		return ret;
	}

}
