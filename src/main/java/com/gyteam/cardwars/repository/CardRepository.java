package com.gyteam.cardwars.repository;

import com.gyteam.cardwars.model.entity.Card;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface CardRepository extends JpaRepository<Card, String> {

    Optional<Card> findByName(String name);

    List<Card> findAll();
}
