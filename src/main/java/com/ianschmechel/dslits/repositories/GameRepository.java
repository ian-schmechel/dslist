package com.ianschmechel.dslits.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ianschmechel.dslits.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long>{

}
