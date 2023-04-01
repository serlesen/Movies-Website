package com.devworld.movies_website.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.Date;
@Component
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Movies {
    private Integer movieId;
    private String movieTitle;
    private Date movieReleaseYear;
    private Double movieRating;
    private String movieDescription;
    private String movieDirector;
    private String[] movieActors;
}
