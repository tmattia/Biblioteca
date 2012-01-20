package com.twu.biblioteca;

import java.util.ArrayList;

public class MovieList extends ArrayList<Movie> {
	
	public String toString() {
		String ret = "";
		for (Movie movie : this) {
			ret += movie.toString() + "\n";
		}
		return ret;
	}

}
