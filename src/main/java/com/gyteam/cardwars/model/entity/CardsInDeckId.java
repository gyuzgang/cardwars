package com.gyteam.cardwars.model.entity;

import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class CardsInDeckId implements Serializable {
    private Long cardId;
    private Long deckId;
}
