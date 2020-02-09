package com.vikastadge.spring;

import com.vikastadge.spring.beans.MovieService;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App {

    public static void main( String[] args ) {
        ConfigurableApplicationContext context = new AnnotationConfigApplicationContext("com.vikastadge.spring");
        MovieService movieService = context.getBean(MovieService.class);
        System.out.println("movie list :-"+movieService.getMovieList());
        movieService.getListFromDB();
        System.out.println("movie list :-"+movieService.getMovieList());
        context.close();
    }
}
