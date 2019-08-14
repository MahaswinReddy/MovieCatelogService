package com.persistent.movieCatelogApp.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MovieCatelogController {
	
@RequestMapping("/catelog")
public List<String> getMovieCatelog() {
	List<String> list = new ArrayList<>();
	list.add("Chanti");
	list.add("GangLeader");
return list;
	
}
}
