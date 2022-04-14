package com.mauroph.dsmovies.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mauroph.dsmovies.dto.MovieDTO;
import com.mauroph.dsmovies.dto.ScoreDTO;
import com.mauroph.dsmovies.services.ScoreService;

@RestController
@RequestMapping(value = "/scores")
public class ScoreController {
	@Autowired
	private ScoreService service ;
	@PutMapping(value = "/{id}")
	public MovieDTO saveScore(@RequestBody ScoreDTO dto){
		MovieDTO movieDTO = service.saveScore(dto);
		
		return movieDTO;
	} 	
} 
