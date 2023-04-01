package com.devworld.movies_website.dto;

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
public class MovieDTO {
    private Integer movieId;
    private String movieTitle;
    private Date movieReleaseYear;
    private Double movieRating;
}
