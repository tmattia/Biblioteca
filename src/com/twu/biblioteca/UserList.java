package com.twu.biblioteca;

import java.util.ArrayList;

public class UserList extends ArrayList<User> {

	public User findByLibraryNumber(String libraryNumber) {
		for (User user : this) {
			if (user.getLibraryNumber().equals(libraryNumber)) {
				return user;
			}
		}
		return null;
	}

}
