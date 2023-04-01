package com.devworld.movies_website.service;

import com.devworld.movies_website.dto.MovieDTO;
import com.devworld.movies_website.dto.MoviedetailDTO;
import com.devworld.movies_website.entities.Movies;
import com.devworld.movies_website.mappers.MovieMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
@RequiredArgsConstructor
public class MovieService {



    private static List<MovieDTO> movieslist=new ArrayList<>();
    private static List<Movies> movies=new ArrayList<>();
    private final MovieMapper movieMapper;

    static
    {
        movies.add(new Movies(1,"Whiplash",new Date(2014),8.2,"story of young Drummer","Damien Chazelle",new String[]{"Sid","Rob","Bob","Alice","sarah"}));
        movies.add(new Movies(2,"The Shawshank Redemption",new Date(1994),9.2,"story of Prisoner","Damien smithson",new String[]{"Sid","Rob","Bob","Alice","sarah"}));
        movies.add(new Movies(3,"Forrest Gump",new Date(1994),8.8,"story of Hardworking Man ","Tom Hank",new String[]{"Sid","Rob","Bob","Alice","sarah"}));
        movies.add(new Movies(4,"Suits",new Date(2016),9.0,"story of Lawyer","Chazelle John",new String[]{"Sid","Rob","Bob","Alice","sarah"}));
        movies.add(new Movies(5,"Saving Private Ryan",new Date(1998),8.6,"story of Soldier","Damien Macron",new String[]{"Sid","Rob","Bob","Alice","sarah"}));
    }
    public List<MovieDTO> getMovieslist()
    {
        for (Movies mov: movies) {
            movieslist.add(movieMapper.toMovieDto(mov));
        }
        return movieslist;
    }
    public Movies getMovie(int id)
    {
        for (Movies askedMovie: movies) {
            if(askedMovie.getMovieId()==id)
            {
                return askedMovie;
            }
        }
        return null;
    }





}
