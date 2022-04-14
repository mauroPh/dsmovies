package com.mauroph.dsmovies.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mauroph.dsmovies.entities.Score;
import com.mauroph.dsmovies.entities.ScorePK;

public interface ScoreRepository extends JpaRepository <Score,ScorePK>{

}
