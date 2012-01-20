package com.twu.biblioteca;

import static org.junit.Assert.assertEquals;
import org.junit.Test;


public class UserTest {

	@Test
	public void shouldHaveALibraryNumber() {
		final String LIBRARY_NUMBER = "111-1111";
		
		User user = new User(LIBRARY_NUMBER, null);
		
		assertEquals(LIBRARY_NUMBER, user.getLibraryNumber());
	}
	
	@Test
	public void shouldHaveAPassword() {
		final String PASSWORD = "123abc";
		
		User user = new User(null, PASSWORD);
		
		assertEquals(PASSWORD, user.getPassword());
	}
	
}
