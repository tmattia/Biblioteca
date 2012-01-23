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
		
		Authenticator authenticator = new Authenticator(mockedUser, null);
		
		assertTrue(authenticator.isLoggedIn());
	}
	
	@Test
	public void shouldNotBeLoggedInWhenUserIsNotSet() {
		Authenticator authenticator = new Authenticator(null, null);
		
		assertFalse(authenticator.isLoggedIn());
	}

	@Test
	public void shouldReturnCurrentUserLibraryNumber() {
		final String LIBRARY_NUMBER = "111-1111";
		
		User mockedUser = mock(User.class);
		when(mockedUser.getLibraryNumber()).thenReturn(LIBRARY_NUMBER);
		
		Authenticator authenticator = new Authenticator(mockedUser, null);
		
		assertEquals(LIBRARY_NUMBER, authenticator.getCurrentUserLibraryNumber());
	}
	
	@Test
	public void shouldBeLoggedInAfterSuccessfulLogin() {
		User mockedUser = mock(User.class);
		Login mockedLogin = mock(Login.class);
		when(mockedLogin.requireLogin()).thenReturn(mockedUser);
		
		Authenticator authenticator = new Authenticator(null, mockedLogin);
		authenticator.requireLogin();
		
		assertTrue(authenticator.isLoggedIn());
	}
	
	@Test
	public void shouldRequireLoginUntilSuccessful() {
		User mockedUser = mock(User.class);
		Login mockedLogin = mock(Login.class);
		when(mockedLogin.requireLogin()).thenReturn(null); // fail
		when(mockedLogin.requireLogin()).thenReturn(null); // fail
		when(mockedLogin.requireLogin()).thenReturn(mockedUser); // success
		
		Authenticator authenticator = new Authenticator(null, mockedLogin);
		authenticator.requireLogin();
		
		assertTrue(authenticator.isLoggedIn());
	}
	
}
