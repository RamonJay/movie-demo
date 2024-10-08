package com.example.demo.repository;

import org.socialsignin.spring.data.dynamodb.repository.EnableScan;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.models.Movie;

@Repository
@EnableScan
public interface MovieRepository extends CrudRepository<Movie,String> {

}
