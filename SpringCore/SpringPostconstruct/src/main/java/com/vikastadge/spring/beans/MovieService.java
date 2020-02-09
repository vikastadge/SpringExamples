package com.vikastadge.spring.beans;

import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Service
public class MovieService {

    List<String> movieList = new ArrayList<>();

    public List<String> getMovieList() {
        return movieList;
    }

    public void setMovieList(List<String> movieList) {
        this.movieList = movieList;
    }

    @PostConstruct
    public void populateMovieCache(){
        System.out.println("Calling populateMovieCache");
        movieList.add("WAR");
        movieList.add("TANAJI");
    }

    public void getListFromDB(){
        System.out.println("Calling from DB");
        movieList.add("WANTED");
        movieList.add("READY");
    }

    @PreDestroy
    public void clearCache(){
        movieList = Collections.emptyList();
        System.out.println("Calling clearCache");
    }

}
