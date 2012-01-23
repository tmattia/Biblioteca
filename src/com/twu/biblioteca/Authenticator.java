package com.twu.biblioteca;

public class Authenticator {
	
	private User user;
	private Login login;

	public Authenticator(User user, Login login) {
		this.user = user;
		this.login = login;
	}

	public boolean isLoggedIn() {
		return (user != null);
	}

	public String getCurrentUserLibraryNumber() {
		return user.getLibraryNumber();
	}

	public void requireLogin() {
		while (!isLoggedIn()) {
			user = login.requireLogin();
		}
	}

}
