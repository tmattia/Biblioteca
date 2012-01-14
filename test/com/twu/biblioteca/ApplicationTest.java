package com.twu.biblioteca;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import org.junit.Test;



public class ApplicationTest {
	
	@Test
	public void shouldShowAnWelcomeMessageWhenApplicationStarts() {
		Printer mockedPrinter = mock(Printer.class);
		
		Application app = new Application(mockedPrinter);
		app.start();
		
		verify(mockedPrinter).println("Welcome to the Bangalore Public Library System!");
	}
	
}