package com.example.demo.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.models.Movie;
import com.example.demo.repository.MovieRepository;
import com.example.demo.service.MovieService;

@Service
public class MovieServiceImpl implements MovieService {

	@Autowired
	MovieRepository movieRepository;

	@Override
	public List<Movie> getAllMovie() {

		return (List<Movie>) movieRepository.findAll();
	}

	@Override
	public Movie addMovie(Movie movie) {

		return movieRepository.save(movie);
	}

}
