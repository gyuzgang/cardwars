package com.gyteam.cardwars.model.actions.BluePlains;

import com.gyteam.cardwars.model.actions.Action;
import com.gyteam.cardwars.model.dto.GameCard;

public class CoolDog extends GameCard implements Action {

    @Override
    public void action() {
        System.out.println("I'm a Cool Dog");
    }
}
