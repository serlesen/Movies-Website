package com.devworld.movies_website.mappers;

import com.devworld.movies_website.dto.MovieDTO;
import com.devworld.movies_website.entities.Movies;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;

@Mapper(componentModel = "spring")
public interface MovieMapper {

    MovieDTO toMovieDto(Movies movies);
}
