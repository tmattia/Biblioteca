package com.twu.biblioteca;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.Test;


public class BookListTest {
	
	@Test
	public void shouldFindBookByNumberIfBookIsOnList() {
		final int BOOK_NUMBER = 1;
		
		Book mockedBook = mock(Book.class);
		when(mockedBook.getNumber()).thenReturn(BOOK_NUMBER);
		
		BookList bookList = new BookList();
		bookList.add(mockedBook);
		
		assertTrue(bookList.contains(BOOK_NUMBER));
	}
	
	@Test
	public void shouldNotFindBookByNumberIfBookIsNotOnList() {
		final int BOOK_ON_LIST_NUMBER = 1;
		final int BOOK_NOT_ON_LIST_NUMBER = 2;
		
		Book mockedBook = mock(Book.class);
		when(mockedBook.getNumber()).thenReturn(BOOK_ON_LIST_NUMBER);
		
		BookList bookList = new BookList();
		bookList.add(mockedBook);
		
		assertFalse(bookList.contains(BOOK_NOT_ON_LIST_NUMBER));
	}

}
