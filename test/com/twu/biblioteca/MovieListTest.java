package com.twu.biblioteca;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.Test;


public class MovieListTest {

	@Test
	public void shouldHaveStringRepresentation() {
		final String LINE_BREAK = System.getProperty("line.separator");
		final String FIRST_MOVIE = "1. First Movie";
		final String SECOND_MOVIE = "2. Second Movie";

		Movie mockedMovie1 = mock(Movie.class);
		when(mockedMovie1.toString()).thenReturn(FIRST_MOVIE);
		Movie mockedMovie2 = mock(Movie.class);
		when(mockedMovie2.toString()).thenReturn(SECOND_MOVIE);
		
		MovieList movieList = new MovieList();
		movieList.add(mockedMovie1);
		movieList.add(mockedMovie2);
		
		assertEquals(FIRST_MOVIE + LINE_BREAK + SECOND_MOVIE + LINE_BREAK, movieList.toString());
	}
	
}
