package com.twu.biblioteca;

public class User {
	
	private String libraryNumber;
	private String password;

	public User(String libraryNumber, String password) {
		this.libraryNumber = libraryNumber;
		this.password = password;
	}

	public String getLibraryNumber() {
		return libraryNumber;
	}

	public String getPassword() {
		return password;
	}

	public boolean checkPassword(String otherPassword) {
		return password.equals(otherPassword);
	}

}
