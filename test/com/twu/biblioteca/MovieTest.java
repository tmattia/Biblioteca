package com.twu.biblioteca;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.Test;



public class MovieTest {

	@Test
	public void shouldHaveStringRepresentation() {
		final String MOVIE_NAME = "Movie Name";
		final String DIRECTOR_NAME = "Director Name";
		final String RATING_STRING = "10";
		
		Rating mockedRating = mock(Rating.class);
		when(mockedRating.toString()).thenReturn(RATING_STRING);
		
		Movie movie = new Movie(MOVIE_NAME, DIRECTOR_NAME, mockedRating);
		
		assertEquals(MOVIE_NAME + "\t" + DIRECTOR_NAME + "\t" + RATING_STRING, movie.toString());
	}
	
	@Test
	public void shouldHaveStringRepresentationWhenRatingIsNotAvailable() {
		final String MOVIE_NAME = "Movie Name";
		final String DIRECTOR_NAME = "Director Name";
		
		Movie movie = new Movie(MOVIE_NAME, DIRECTOR_NAME, null);
		
		assertEquals(MOVIE_NAME + "\t" + DIRECTOR_NAME + "\t" + Movie.RATING_NOT_AVAILABLE_MSG, movie.toString());
	}
	
}
