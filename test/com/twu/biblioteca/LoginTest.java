package com.twu.biblioteca;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.inOrder;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InOrder;

public class LoginTest {

	Console mockedConsole;
	UserList mockedUserList;

	@Before
	public void setUp() {
		mockedConsole = mock(Console.class);
		mockedUserList = mock(UserList.class);
	}
	
	@Test
	public void shouldRequireLibraryNumberAndPassword() {
		Login login = new Login(mockedConsole, mockedUserList);
		login.requireLogin();
		
		InOrder inOrder = inOrder(mockedConsole);
		inOrder.verify(mockedConsole).println(Login.ENTER_LIBRARY_NUMBER_MSG);
		inOrder.verify(mockedConsole).readLine();
		inOrder.verify(mockedConsole).println(Login.ENTER_PASSWORD_MSG);
		inOrder.verify(mockedConsole).readLine();
	}
	
	@Test
	public void shouldLoginWhenLibraryNumberAndPasswordAreValid() {
		User mockedUser = mock(User.class);
		when(mockedUser.checkPassword(anyString())).thenReturn(true);
		when(mockedUserList.findByLibraryNumber(anyString())).thenReturn(mockedUser);
		
		Login login = new Login(mockedConsole, mockedUserList);
		
		assertNotNull(login.requireLogin());
	}
	
	@Test
	public void shouldNotLoginWhenLibraryNumberIsInvalid() {
		when(mockedUserList.findByLibraryNumber(anyString())).thenReturn(null);
		
		Login login = new Login(mockedConsole, mockedUserList);
		
		assertNull(login.requireLogin());
	}
	
	@Test
	public void shouldNotLoginWhenPasswordIsInvalid() {
		User mockedUser = mock(User.class);
		when(mockedUser.checkPassword(anyString())).thenReturn(false);
		when(mockedUserList.findByLibraryNumber(anyString())).thenReturn(mockedUser);
		
		Login login = new Login(mockedConsole, mockedUserList);
		
		assertNull(login.requireLogin());
	}
	
}
