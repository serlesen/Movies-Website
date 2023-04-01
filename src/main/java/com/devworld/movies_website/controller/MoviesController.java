package com.devworld.movies_website.controller;

import com.devworld.movies_website.dto.MovieDTO;
import com.devworld.movies_website.entities.Movies;
import com.devworld.movies_website.service.MovieService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RestController
public class MoviesController {

    private final MovieService movieService;

    @GetMapping("/movies")
    List<MovieDTO> getallmovies()
    {
        return movieService.getMovieslist();
    }

    @GetMapping("/movies/{id}")
    Movies getMoviebyId(@PathVariable  int id)
    {
        return movieService.getMovie(id);
    }


}
