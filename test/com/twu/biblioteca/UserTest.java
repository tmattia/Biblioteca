package com.twu.biblioteca;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

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
	
	@Test
	public void shouldCheckForValidPasswords() {
		final String VALID_PASSWORD = "valid";
		final String INVALID_PASSWORD = "invalid";
		
		User user = new User(null, VALID_PASSWORD);
		
		assertTrue(user.checkPassword(VALID_PASSWORD));
		assertFalse(user.checkPassword(INVALID_PASSWORD));
	}
	
}
