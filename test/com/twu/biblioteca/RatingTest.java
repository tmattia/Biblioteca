package com.twu.biblioteca;

import static org.junit.Assert.assertEquals;

import org.junit.Test;


public class RatingTest {

	@Test
	public void shouldHaveStringRepresentation() throws InvalidRatingScoreException {
		Rating rating = new Rating(10);
		
		assertEquals("10", rating.toString());
	}
	
	@Test(expected=InvalidRatingScoreException.class)
	public void shouldRejectScoreEqualToZero() throws InvalidRatingScoreException {
		new Rating(0);
	}
	
	@Test(expected=InvalidRatingScoreException.class)
	public void shouldRejectScoreLowerThanZero() throws InvalidRatingScoreException {
		new Rating(-10);
	}
	
	@Test(expected=InvalidRatingScoreException.class)
	public void shouldRejectScoreGreaterThanTen() throws InvalidRatingScoreException {
		new Rating(11);
	}
	
	@Test
	public void shouldAllowScoresBetweenOneAndTen() throws InvalidRatingScoreException {
		new Rating(1);
		new Rating(5);
		new Rating(10);
	}
	
}
