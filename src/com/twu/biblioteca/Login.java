package com.twu.biblioteca;

public class Login {
	
	public static final String ENTER_LIBRARY_NUMBER_MSG = "Enter your library number:";
	public static final String ENTER_PASSWORD_MSG = "Enter your password:";
	
	Console console;
	UserList userList;

	public Login(Console console, UserList userList) {
		this.console = console;
		this.userList = userList;
	}

	public User requireLogin() {
		console.println(ENTER_LIBRARY_NUMBER_MSG);
		String libraryNumber = console.readLine();
		console.println(ENTER_PASSWORD_MSG);
		String password = console.readLine();
		
		User user = userList.findByLibraryNumber(libraryNumber);
		if (user == null || !user.checkPassword(password)) {
			return null;
		}
		return user;
	}

}
