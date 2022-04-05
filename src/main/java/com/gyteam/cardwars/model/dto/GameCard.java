package com.gyteam.cardwars.model.dto;

import com.gyteam.cardwars.model.actions.Action;
import com.gyteam.cardwars.model.enums.CardType;
import com.gyteam.cardwars.model.enums.LandType;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class GameCard {

    private String name;
    private String description;
    private Integer cost;
    private Integer attack;
    private Integer defense;
    private CardType cardType;
    private LandType landType;
    private Action action;
}
