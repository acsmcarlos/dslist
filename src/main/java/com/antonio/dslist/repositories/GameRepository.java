package com.antonio.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.antonio.dslist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long>{

}
