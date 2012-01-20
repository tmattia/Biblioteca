package com.twu.biblioteca;

import org.junit.Test;

import static org.mockito.Mockito.*;

public class CheckLibraryNumberActionTest {

	@Test
	public void shouldShowNotificationIfUserIsNotLoggedIn() {
		Console mockedConsole = mock(Console.class);
		Authenticator mockedAuthenticator = mock(Authenticator.class);
		when(mockedAuthenticator.isLoggedIn()).thenReturn(false);

		CheckLibraryNumberAction action = new CheckLibraryNumberAction(mockedConsole, mockedAuthenticator);
		action.execute();

		verify(mockedConsole).println(CheckLibraryNumberAction.PLEASE_TALK_TO_LIBRARIAN);
	}
	
	@Test
	public void shouldShowLibraryNumberIfUserIsLoggedIn() {
		final String LIBRARY_NUMBER = "111-1111";
		
		Console mockedConsole = mock(Console.class);
		Authenticator mockedAuthenticator = mock(Authenticator.class);
		when(mockedAuthenticator.isLoggedIn()).thenReturn(true);
		when(mockedAuthenticator.getCurrentUserLibraryNumber()).thenReturn(LIBRARY_NUMBER);
		
		CheckLibraryNumberAction action = new CheckLibraryNumberAction(mockedConsole, mockedAuthenticator);
		action.execute();
		
		verify(mockedConsole).println(LIBRARY_NUMBER);
	}

}
