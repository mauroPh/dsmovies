package com.mauroph.dsmovies.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mauroph.dsmovies.entities.Movie;

public interface MovieRepository extends JpaRepository <Movie,Long>{

}
