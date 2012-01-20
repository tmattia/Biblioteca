package com.twu.biblioteca;

public class CheckLibraryNumberAction implements Action {
	
	public static final String PLEASE_TALK_TO_LIBRARIAN = "Please talk to Librarian. Thank you.";
	
	private Console console;
	private Authenticator authenticator;
	
	public CheckLibraryNumberAction(Console console, Authenticator authenticator) {
		this.console = console;
		this.authenticator = authenticator;
	}

	@Override
	public void execute() {
		if (authenticator.isLoggedIn()) {
			console.println(authenticator.getCurrentUserLibraryNumber());
		} else {
			console.println(PLEASE_TALK_TO_LIBRARIAN);
		}
	}

}
