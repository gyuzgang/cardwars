package com.gyteam.cardwars.model.entity;

import com.gyteam.cardwars.model.enums.CardType;
import com.gyteam.cardwars.model.enums.LandType;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "card")
public class Card {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "description")
    private Integer description;

    @Column(name = "cost")
    private Integer cost;

    @Column(name = "attack")
    private Integer attack;

    @Column(name = "defense")
    private Integer defense;

    @Column(name = "cardType")
    private CardType cardType;

    @Column(name = "landType")
    private LandType landType;


}
