package com.twu.biblioteca;

public class Authenticator {
	
	private User user;

	public Authenticator(User user) {
		this.user = user;
	}

	public boolean isLoggedIn() {
		return (user != null);
	}

	public String getCurrentUserLibraryNumber() {
		return user.getLibraryNumber();
	}

}
