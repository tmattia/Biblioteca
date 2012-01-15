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
		ArrayList<MenuOption> mockedOptions = new ArrayList<MenuOption>();
		mockedOptions.add(mockedOption1);
		mockedOptions.add(mockedOption2);
		
		Menu menu = new Menu(mockedOptions);
		
		assertEquals(FIRST_OPTION + LINE_BREAK + SECOND_OPTION + LINE_BREAK, menu.toString());
	}

}
