package com.twu.biblioteca;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.Test;


public class AuthenticatorTest {

	@Test
	public void shouldBeLoggedInWhenUserIsSet() {
		User mockedUser = mock(User.class);
		
		Authenticator authenticator = new Authenticator(mockedUser);
		
		assertTrue(authenticator.isLoggedIn());
	}
	
	@Test
	public void shouldNotBeLoggedInWhenUserIsNotSet() {
		Authenticator authenticator = new Authenticator(null);
		
		assertFalse(authenticator.isLoggedIn());
	}

	@Test
	public void shouldReturnCurrentUserLibraryNumber() {
		final String LIBRARY_NUMBER = "111-1111";
		
		User mockedUser = mock(User.class);
		when(mockedUser.getLibraryNumber()).thenReturn(LIBRARY_NUMBER);
		
		Authenticator authenticator = new Authenticator(mockedUser);
		
		assertEquals(LIBRARY_NUMBER, authenticator.getCurrentUserLibraryNumber());
	}
	
}
