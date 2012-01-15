package com.twu.biblioteca;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;
import org.junit.Test;

public class ApplicationTest {
	
	@Test
	public void shouldShowAnWelcomeMessageWhenApplicationStarts() {
		Printer mockedPrinter = mock(Printer.class);
		Menu mockedMenu = mock(Menu.class);
		
		Application app = new Application(mockedPrinter, mockedMenu);
		app.start();
		
		verify(mockedPrinter).println(Application.WELCOME_MESSAGE);
	}
	
	@Test
	public void shouldShowMenuOptionsWhenApplicationStarts() {
		final String FAKE_LIST_OF_OPTIONS = "Fake list of options";
		
		Printer mockedPrinter = mock(Printer.class);
		Menu mockedMenu = mock(Menu.class);
		when(mockedMenu.toString()).thenReturn(FAKE_LIST_OF_OPTIONS);
		
		Application app = new Application(mockedPrinter, mockedMenu);
		app.start();
		
		verify(mockedPrinter).println(FAKE_LIST_OF_OPTIONS);
	}
	
}