package com.gyteam.cardwars.game;

import com.gyteam.cardwars.game.gamecard.cardtype.Building;
import com.gyteam.cardwars.game.gamecard.cardtype.Creature;
import com.gyteam.cardwars.model.enums.LandType;
import lombok.Data;

@Data
public class GameField {

    private Creature creature;
    private Building building;

    private LandType landType;
}
