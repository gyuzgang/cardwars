package com.gyteam.cardwars.model.actions.BluePlains;

import com.gyteam.cardwars.game.gamecard.cardability.FloopableAbility;
import lombok.NoArgsConstructor;

@NoArgsConstructor
public class AncientScholar implements FloopableAbility {

    @Override
    public void floop() {
        System.out.println("I'm a Ancient Scholar");
    }
}
