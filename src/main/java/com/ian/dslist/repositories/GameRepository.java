package com.ian.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ian.dslist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long>{

	
}
