package com.devsupeior.dsmovie.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsupeior.dsmovie.dto.MovieDTO;
import com.devsupeior.dsmovie.dto.ScoreDTO;
import com.devsupeior.dsmovie.services.ScoreService;


@RestController
@RequestMapping(value = "/Scores")
public class ScoreController {
	
	@Autowired
	private ScoreService service;
	
	@PutMapping
	public MovieDTO SaveScore(@RequestBody ScoreDTO dto){
		
		MovieDTO movieDTO = service.saveScore(dto);
		
		return movieDTO;
	}
}


