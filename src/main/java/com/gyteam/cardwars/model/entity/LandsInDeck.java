package com.gyteam.cardwars.model.entity;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "lands_in_deck")
@Getter
@Setter
@NoArgsConstructor
public class LandsInDeck {

    @Column(name = "land_id")
    private Long landId;
    @Column(name = "deck_id")
    private Long deckId;
    @Column(name = "count")
//    @Range(min=1,max=4)
    private int count;
}
