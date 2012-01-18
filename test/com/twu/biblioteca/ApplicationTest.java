package com.twu.biblioteca;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import static org.mockito.Matchers.anyInt;

import org.junit.Before;
import org.junit.Test;

public class ApplicationTest {
	
	Console mockedConsole;
	Menu mockedMenu;
	Application app;
	
	@Before
	public void setUp() {
		mockedConsole = mock(Console.class);
		mockedMenu = mock(Menu.class);
		app = new Application(mockedConsole, mockedMenu);
	}
	
	@Test
	public void shouldShowAnWelcomeMessageWhenApplicationStarts() {
		app.start();
		
		verify(mockedConsole).println(Application.WELCOME_MSG);
	}
	
	@Test
	public void shouldShowMenuOptionsWhenApplicationStarts() {
		final String FAKE_LIST_OF_OPTIONS = "Fake list of options";
		when(mockedMenu.toString()).thenReturn(FAKE_LIST_OF_OPTIONS);
		
		app.start();
		
		verify(mockedConsole).println(FAKE_LIST_OF_OPTIONS);
	}
	
	@Test
	public void shouldPromptForOptionSelectionWhenApplicationStarts() {
		app.start();
		
		verify(mockedConsole).println(Application.SELECT_OPTION_MSG);
		verify(mockedConsole).readInteger();
	}
	
	@Test
	public void shouldShowNotificationWhenInvalidOptionIsSelected() {
		when(mockedMenu.isValidOption(anyInt())).thenReturn(false);
		
		app.start();
		
		verify(mockedConsole).println(Application.INVALID_OPTION_MSG);
	}
	
	@Test
	public void shouldExecuteOptionWhenOptionIsSelected() {
		MenuOption mockedOption = mock(MenuOption.class);
		when(mockedMenu.isValidOption(anyInt())).thenReturn(true);
		when(mockedMenu.getOption(anyInt())).thenReturn(mockedOption);
		
		app.start();
		
		verify(mockedOption).execute();
	}
	
}