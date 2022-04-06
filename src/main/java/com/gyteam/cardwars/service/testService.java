package com.gyteam.cardwars.service;

import com.gyteam.cardwars.model.dto.GameCard;
import com.gyteam.cardwars.model.entity.Card;
import com.gyteam.cardwars.model.mapper.CardMapper;
import com.gyteam.cardwars.repository.CardRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/card")
@RestController
@RequiredArgsConstructor
public class testService {

    @Autowired
    private CardMapper cardMapper;
    @Autowired
    private CardRepository cardRepository;

    @GetMapping("/{name}")
    ResponseEntity<GameCard> findByName(@PathVariable String name) {
        Card card = cardRepository.findByName("Ancient Scholar").orElse(null);
        GameCard gameCard = cardMapper.toGameCard(card);
//        gameCard.getAction().action();
        return ResponseEntity.status(HttpStatus.OK)
                .body(gameCard);
    }

    @GetMapping("/{name}")
    ResponseEntity<GameCard> findByName2(@PathVariable String name) {
        // find Card from repo
        // find class by Card Name
        // create object
        // map Card to GameCard


        Card card = cardRepository.findByName("Ancient Scholar").orElse(null);
        GameCard gameCard = cardMapper.toGameCard(card);
//        reflexionMethodGetClassByName(gameCard.getName());
//        PunkCat punkCatcard =  new PunkCat();
//        PunkCat punkCatcard = (PunkCat) CardMapper.toGameCard2(card);
//        gameCard.getAction().action();
        return ResponseEntity.status(HttpStatus.OK)
                .body(gameCard);
    }
}
