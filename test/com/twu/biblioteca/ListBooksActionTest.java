package com.twu.biblioteca;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.inOrder;

import org.junit.Test;
import org.mockito.InOrder;

public class ListBooksActionTest {
	
	@Test
	public void shouldListBooks() {
		final String FAKE_BOOK_LIST = "Fake book list";
		
		Console mockedConsole = mock(Console.class);
		BookList mockedBookList = mock(BookList.class);
		when(mockedBookList.toString()).thenReturn(FAKE_BOOK_LIST);
		
		ListBooksAction listBooksAction = new ListBooksAction(mockedConsole, mockedBookList);
		listBooksAction.execute();

		InOrder inOrder = inOrder(mockedConsole);
		inOrder.verify(mockedConsole).println(ListBooksAction.LIST_OF_BOOKS_MSG);
		inOrder.verify(mockedConsole).println(FAKE_BOOK_LIST);
	}

}
