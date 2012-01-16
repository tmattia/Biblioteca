package com.twu.biblioteca;

import static org.junit.Assert.*;

import org.junit.Test;


public class BookTest {
	
	@Test
	public void shouldHaveStringRepresentation() {
		final int NUMBER = 1;
		final String DESCRIPTION = "First Book";
		
		Book book = new Book(NUMBER, DESCRIPTION);
		
		assertEquals(book.toString(), NUMBER + ". " + DESCRIPTION);
	}

}
