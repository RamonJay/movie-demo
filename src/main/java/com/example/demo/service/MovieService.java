package com.example.demo.service;

import java.util.List;

import com.example.demo.models.Movie;

public interface MovieService {
	
	public List<Movie> getAllMovie();
	public Movie addMovie(Movie movie);
	
}
