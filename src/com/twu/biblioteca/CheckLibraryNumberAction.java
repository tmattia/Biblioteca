package com.twu.biblioteca;

public class CheckLibraryNumberAction implements Action {
	
	public static final String PLEASE_TALK_TO_LIBRARIAN = "Please talk to Librarian. Thank you.";
	private Console console;
	
	public CheckLibraryNumberAction(Console console) {
		this.console = console;
	}

	@Override
	public void execute() {
		console.println(PLEASE_TALK_TO_LIBRARIAN);
	}

}
