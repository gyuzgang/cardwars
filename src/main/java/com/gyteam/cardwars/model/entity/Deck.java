package com.gyteam.cardwars.model.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "deck")
@Getter
@Setter
@NoArgsConstructor
public class Deck {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @Column
    private String name;
    @Column
    private String description;

    @OneToMany
    private Set<CardsInDeck> cardsInDeck;

    @OneToMany
    private Set<LandsInDeck> landsInDecks;


}
