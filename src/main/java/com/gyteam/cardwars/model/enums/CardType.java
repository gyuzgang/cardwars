package com.gyteam.cardwars.model.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum CardType {
    SPELL("Spell"),
    CREATURE("Creature"),
    BUILDING("Building");

    private String name;
}
