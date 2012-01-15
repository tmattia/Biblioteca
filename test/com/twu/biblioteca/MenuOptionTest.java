package com.twu.biblioteca;

import static org.junit.Assert.*;

import org.junit.Test;

public class MenuOptionTest {

	@Test
	public void shouldHaveAStringRepresentation() {
		final String THIRD_OPTION = "ThirdOption";
		
		MenuOption option = new MenuOption(3, THIRD_OPTION);
		
		assertEquals("3. " + THIRD_OPTION, option.toString());
	}
	
}
