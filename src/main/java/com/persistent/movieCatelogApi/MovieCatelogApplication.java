package com.persistent.movieCatelogApi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages= {"com.persistent.movieCatelogApp.controller"})

public class MovieCatelogApplication {

	public static void main(String[] args) {
		SpringApplication.run(MovieCatelogApplication.class, args);
		System.out.println("MovieCatlog Application is up");

	}

}
