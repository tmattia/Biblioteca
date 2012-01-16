package com.twu.biblioteca;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.Test;

public class ApplicationTest {
	
	Printer mockedPrinter;
	Menu mockedMenu;
	InputReader mockedInputReader;
	Application app;
	
	@Before
	public void setUp() {
		mockedPrinter = mock(Printer.class);
		mockedMenu = mock(Menu.class);
		mockedInputReader = mock(InputReader.class);
		app = new Application(mockedPrinter, mockedMenu, mockedInputReader);
	}
	
	@Test
	public void shouldShowAnWelcomeMessageWhenApplicationStarts() {
		app.start();
		
		verify(mockedPrinter).println(Application.WELCOME_MSG);
	}
	
	@Test
	public void shouldShowMenuOptionsWhenApplicationStarts() {
		final String FAKE_LIST_OF_OPTIONS = "Fake list of options";
		when(mockedMenu.toString()).thenReturn(FAKE_LIST_OF_OPTIONS);
		
		app.start();
		
		verify(mockedPrinter).println(FAKE_LIST_OF_OPTIONS);
	}
	
	@Test
	public void shouldPromptForOptionSelectionWhenApplicationStarts() {
		app.start();
		
		verify(mockedPrinter).println(Application.SELECT_OPTION_MSG);
		verify(mockedInputReader).readInteger();
	}
	
	@Test
	public void shouldShowNotificationWhenInvalidOptionIsSelected() {
		final int INVALID_OPTION_KEY = 100;
		
		when(mockedInputReader.readInteger()).thenReturn(INVALID_OPTION_KEY);
		when(mockedMenu.isValidOption(INVALID_OPTION_KEY)).thenReturn(false);
		
		app.start();
		
		verify(mockedPrinter).println(Application.INVALID_OPTION_MSG);
	}
	
	@Test
	public void shouldExecuteOptionWhenOptionIsSelected() {
		final int OPTION_KEY = 1;
		MenuOption mockedOption = mock(MenuOption.class);
		
		when(mockedInputReader.readInteger()).thenReturn(OPTION_KEY);
		when(mockedMenu.isValidOption(OPTION_KEY)).thenReturn(true);
		when(mockedMenu.getOption(OPTION_KEY)).thenReturn(mockedOption);
		app.start();
		
		verify(mockedOption).execute();
	}
	
}