package com.twu.biblioteca;

import org.junit.Test;

import static org.mockito.Mockito.*;

public class CheckLibraryNumberActionTest {

	@Test
	public void shouldShowNotification() {
		Console mockedConsole = mock(Console.class);

		CheckLibraryNumberAction action = new CheckLibraryNumberAction(mockedConsole);
		action.execute();

		verify(mockedConsole).println(CheckLibraryNumberAction.PLEASE_TALK_TO_LIBRARIAN);
	}

}
