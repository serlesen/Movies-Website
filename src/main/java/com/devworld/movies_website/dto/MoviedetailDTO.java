package com.devworld.movies_website.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class MoviedetailDTO {
    private Integer movieId;
    private String movieDescription;
    private String movieDirector;
    private String[] movieActors;



}
