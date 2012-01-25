package com.twu.biblioteca;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) throws InvalidRatingScoreException {
		Console console = new Console();
		UserList userList = new UserList();
		User user = new User("111-1111", "password");
		userList.add(user);
		Login login = new Login(console, userList);
		Authenticator authenticator = new Authenticator(null, login);

		Book book1 = new Book(1, "First Book");
		Book book2 = new Book(2, "Second Book");
		BookList bookList = new BookList();
		bookList.add(book1);
		bookList.add(book2);
		
		ListRecordsAction listBooksAction = new ListRecordsAction(console, bookList);
		MenuOption listBooksOption = new MenuOption(1, "List books", listBooksAction);
		
		Movie movie1 = new Movie("First Movie", "Director A", new Rating(10));
		Movie movie2 = new Movie("Second Movie", "Director A", null);
		Movie movie3 = new Movie("Third Movie", "Director B", new Rating(4));
		MovieList movieList = new MovieList();
		movieList.add(movie1);
		movieList.add(movie2);
		movieList.add(movie3);
		
		ListRecordsAction listMoviesAction = new ListRecordsAction(console, movieList);
		MenuOption listMoviesOption = new MenuOption(2, "List movies", listMoviesAction);
		
		CheckLibraryNumberAction checkLibraryNumberAction = new CheckLibraryNumberAction(console, authenticator);
		MenuOption checkLibraryNumberOption = new MenuOption(3, "Check Library number", checkLibraryNumberAction);
		
		ReserveBookAction reserveBookAction = new ReserveBookAction(console, bookList, authenticator);
		MenuOption reserveBookOption = new MenuOption(4, "Reserve book", reserveBookAction);
		
		ArrayList<MenuOption> options = new ArrayList<MenuOption>();
		options.add(listBooksOption);
		options.add(listMoviesOption);
		options.add(checkLibraryNumberOption);
		options.add(reserveBookOption);
		Menu menu = new Menu(options);

		Application app = new Application(console, menu);
		app.start();
	}
	
}
