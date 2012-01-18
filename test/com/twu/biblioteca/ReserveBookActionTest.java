package com.twu.biblioteca;

import static org.mockito.Mockito.*;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InOrder;


public class ReserveBookActionTest {
	
	final int EXISTING_BOOK_NUMBER = 1;
	final int NON_EXISTING_BOOK_NUMBER = 99;
	
	Console mockedConsole;
	BookList mockedBookList;
	ReserveBookAction rba;
	
	@Before
	public void setUp() {
		mockedConsole = mock(Console.class);
		mockedBookList = mock(BookList.class);
		rba = new ReserveBookAction(mockedConsole, mockedBookList);
	}

	@Test
	public void shouldPromptForBookNumber() {
		rba.execute();
		
		InOrder inOrder = inOrder(mockedConsole);
		inOrder.verify(mockedConsole).println(ReserveBookAction.ENTER_BOOK_NUMBER_MSG);
		inOrder.verify(mockedConsole).readInteger();
	}
	
	@Test
	public void shouldReserveBookIfBookNumberExists() {
		when(mockedBookList.contains(anyInt())).thenReturn(true);
		
		rba.execute();
		
		verify(mockedConsole).println(ReserveBookAction.BOOK_RESERVED);
	}
	
	public void shouldNotReserveBookIfBookNumberDoesNotExist() {
		when(mockedBookList.contains(anyInt())).thenReturn(false);
		
		rba.execute();
		
		verify(mockedConsole).println(ReserveBookAction.BOOK_NOT_RESERVED);
	}
	
}
