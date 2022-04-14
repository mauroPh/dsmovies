package com.mauroph.dsmovies.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mauroph.dsmovies.entities.User;

public interface UserRepository extends JpaRepository <User,Long>{

	User findByEmail(String email);
}
