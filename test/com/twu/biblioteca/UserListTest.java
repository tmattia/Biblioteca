package com.twu.biblioteca;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.Test;

public class UserListTest {
	
	@Test
	public void shouldFindByLibraryNumberIfUserIsOnList() {
		final String LIBRARY_NUMBER = "111-1111";
		
		User mockedUser = mock(User.class);
		when(mockedUser.getLibraryNumber()).thenReturn(LIBRARY_NUMBER);
		
		UserList userList = new UserList();
		userList.add(mockedUser);
		
		assertNotNull(userList.findByLibraryNumber(LIBRARY_NUMBER));
	}
	
	@Test
	public void shouldNotFindByLibraryNumberIfUserIsNotOnList() {
		final String LIBRARY_NUMBER = "111-1111";
		
		UserList userList = new UserList();
		
		assertNull(userList.findByLibraryNumber(LIBRARY_NUMBER));
	}

}
