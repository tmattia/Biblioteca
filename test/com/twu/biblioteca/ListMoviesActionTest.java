package com.twu.biblioteca;

import static org.mockito.Mockito.inOrder;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.Test;
import org.mockito.InOrder;


public class ListMoviesActionTest {

	@Test
	public void shouldListMovies() {
		final String FAKE_LIST_OF_MOVIES = "Fake list of movies";
		
		Console mockedConsole = mock(Console.class);
		MovieList mockedMovieList = mock(MovieList.class);
		when(mockedMovieList.toString()).thenReturn(FAKE_LIST_OF_MOVIES);
		
		ListMoviesAction listMoviesAction = new ListMoviesAction(mockedConsole, mockedMovieList);
		listMoviesAction.execute();
		
		InOrder inOrder = inOrder(mockedConsole);
		inOrder.verify(mockedConsole).println(ListMoviesAction.LIST_OF_MOVIES_MSG);
		inOrder.verify(mockedConsole).println(FAKE_LIST_OF_MOVIES);
	}
	
}
