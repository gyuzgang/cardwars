package com.gyteam.cardwars.game.gamecard;

import com.gyteam.cardwars.game.PositionalState;
import lombok.Data;

import java.util.Set;

@Data
public class GameCardState {

    private Set<PositionalState> states;

    private int actualAttack;
    private int actualDefense;

    public GameCardState(int actualAttack, int actualDefense) {
        this.actualAttack = actualAttack;
        this.actualDefense = actualDefense;
    }
}
