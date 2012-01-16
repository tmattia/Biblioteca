package com.twu.biblioteca;

import java.util.ArrayList;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;
import org.junit.Test;

public class MenuTest {
	
	final String LINE_BREAK = System.getProperty("line.separator");
	
	@Test
	public void shouldReturnAListOfOptionsAsStringRepresentation() {
		final String FIRST_OPTION = "1. First Option";
		final String SECOND_OPTION = "2. Second Option";
		
		MenuOption mockedOption1 = mock(MenuOption.class);
		when(mockedOption1.toString()).thenReturn(FIRST_OPTION);
		MenuOption mockedOption2 = mock(MenuOption.class);
		when(mockedOption2.toString()).thenReturn(SECOND_OPTION);
		
		ArrayList<MenuOption> options = new ArrayList<MenuOption>();
		options.add(mockedOption1);
		options.add(mockedOption2);
		Menu menu = new Menu(options);
		
		assertEquals(FIRST_OPTION + LINE_BREAK + SECOND_OPTION + LINE_BREAK, menu.toString());
	}
	
	@Test
	public void shouldCheckIfAnOptionIsValid() {
		final int VALID_OPTION_KEY = 1;
		final int INVALID_OPTION_KEY = 2;
		
		MenuOption mockedOption1 = mock(MenuOption.class);
		when(mockedOption1.getKey()).thenReturn(VALID_OPTION_KEY);
		
		ArrayList<MenuOption> options = new ArrayList<MenuOption>();
		options.add(mockedOption1);
		Menu menu = new Menu(options);

		assertTrue(menu.isValidOption(VALID_OPTION_KEY));
		assertFalse(menu.isValidOption(INVALID_OPTION_KEY));
	}
	
	@Test
	public void shouldAccessAnOptionThroughItsKey() {
		final int OPTION_KEY = 1;
		
		MenuOption mockedOption = mock(MenuOption.class);
		when(mockedOption.getKey()).thenReturn(OPTION_KEY);
		
		ArrayList<MenuOption> options = new ArrayList<MenuOption>();
		options.add(mockedOption);
		Menu menu = new Menu(options);
		
		assertEquals(mockedOption, menu.getOption(OPTION_KEY));
	}

}
