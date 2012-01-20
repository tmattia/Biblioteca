package com.twu.biblioteca;

public class Rating {
	
	private int score;

	public Rating(int score) throws InvalidRatingScoreException {
		setScore(score);
	}
	
	public void setScore(int score) throws InvalidRatingScoreException {
		if (score < 1 || score > 10) {
			throw new InvalidRatingScoreException();
		}
		this.score = score;
	}
	
	public String toString() {
		return String.valueOf(score);
	}

}
