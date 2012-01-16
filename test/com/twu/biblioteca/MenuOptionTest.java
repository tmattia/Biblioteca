package com.twu.biblioteca;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import static org.mockito.Mockito.*;

public class MenuOptionTest {

	@Test
	public void shouldHaveAStringRepresentation() {
		final int KEY = 3;
		final String DESCRIPTION = "Option description";

		MenuOption option = new MenuOption(KEY, DESCRIPTION, null);

		assertEquals(KEY + ". " + DESCRIPTION, option.toString());
	}
	
	@Test
	public void shouldForwardExecutionToActionObject() {
		Action mockedAction = mock(Action.class);
		
		MenuOption option = new MenuOption(1, null, mockedAction);
		option.execute();
		
		verify(mockedAction).execute();
	}

}