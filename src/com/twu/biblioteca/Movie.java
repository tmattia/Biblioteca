package com.twu.biblioteca;

public class Movie {
	
	static final String RATING_NOT_AVAILABLE_MSG = "N/A";
	
	private String name;
	private String director;
	private Rating rating;
	
	public Movie(String name, String director, Rating rating) {
		this.name = name;
		this.director = director;
		this.rating = rating;
	}
	
	public String toString() {
		return name + "\t" + director + "\t" + ratingToString();
	}
	
	private String ratingToString() {
		return rating == null ? RATING_NOT_AVAILABLE_MSG : rating.toString();
	}

}
