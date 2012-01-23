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
	ReserveBookAction reserveBookAction;
	Authenticator mockedAuthenticator;
	
	@Before
	public void setUp() {
		mockedConsole = mock(Console.class);
		mockedBookList = mock(BookList.class);
		mockedAuthenticator = mock(Authenticator.class);
		reserveBookAction = new ReserveBookAction(mockedConsole, mockedBookList, mockedAuthenticator);
	}
	
	@Test
	public void shouldRequireALoggedInUser() {
		when(mockedAuthenticator.isLoggedIn()).thenReturn(false);
		
		reserveBookAction.execute();
		
		verify(mockedAuthenticator).requireLogin();
	}

	@Test
	public void shouldPromptForBookNumber() {
		when(mockedAuthenticator.isLoggedIn()).thenReturn(true);
		
		reserveBookAction.execute();
		
		InOrder inOrder = inOrder(mockedConsole);
		inOrder.verify(mockedConsole).println(ReserveBookAction.ENTER_BOOK_NUMBER_MSG);
		inOrder.verify(mockedConsole).readInteger();
	}
	
	@Test
	public void shouldReserveBookIfBookNumberExists() {
		when(mockedAuthenticator.isLoggedIn()).thenReturn(true);
		when(mockedBookList.contains(anyInt())).thenReturn(true);
		
		reserveBookAction.execute();
		
		verify(mockedConsole).println(ReserveBookAction.BOOK_RESERVED);
	}
	
	public void shouldNotReserveBookIfBookNumberDoesNotExist() {
		when(mockedAuthenticator.isLoggedIn()).thenReturn(true);
		when(mockedBookList.contains(anyInt())).thenReturn(false);
		
		reserveBookAction.execute();
		
		verify(mockedConsole).println(ReserveBookAction.BOOK_NOT_RESERVED);
	}
	
}
