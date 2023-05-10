package com.devsuperior.dslists.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.dslists.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long>{

}
