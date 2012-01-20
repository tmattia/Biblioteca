package com.twu.biblioteca;

public class ListMoviesAction implements Action {
	
	final static public String LIST_OF_MOVIES_MSG = "List of Movies in the library:";
	
	private Console console;
	private MovieList movieList;

	public ListMoviesAction(Console console, MovieList movieList) {
		this.console = console;
		this.movieList = movieList;
	}

	@Override
	public void execute() {
		console.println(LIST_OF_MOVIES_MSG);
		console.println(movieList.toString());
	}

}
