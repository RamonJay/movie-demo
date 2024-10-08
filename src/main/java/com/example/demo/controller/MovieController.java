package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.Movie;
import com.example.demo.service.MovieService;

@RestController
public class MovieController {
	
	@Autowired
	MovieService movieService;
	
	@GetMapping("/movies")
	public ResponseEntity<List<Movie>> getAllMovies(){
		return ResponseEntity.ok(movieService.getAllMovie());
	}
	
	@PostMapping("/addmovie")
	public ResponseEntity<Movie> addMovie(@RequestBody Movie movie){
		return ResponseEntity.ok(movieService.addMovie(movie));
	}
	
}
