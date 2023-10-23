package com.example.PlayStream.repo;

import com.example.PlayStream.entity.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game, Long> {
    Game findByName(String name);
}