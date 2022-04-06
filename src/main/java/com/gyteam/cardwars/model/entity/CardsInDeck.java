package com.gyteam.cardwars.model.entity;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name ="cards_in_deck")
public class CardsInDeck {

    @EmbeddedId
    private CardsInDeckId cardsInDeckId;

    // Count of the card existing in the deck
    @Column
    private Integer count;
}
