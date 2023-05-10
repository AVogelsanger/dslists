package com.devsuperior.dslists.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.dslists.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long>{

}
