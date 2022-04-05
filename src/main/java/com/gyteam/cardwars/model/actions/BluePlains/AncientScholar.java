package com.gyteam.cardwars.model.actions.BluePlains;

import com.gyteam.cardwars.model.actions.Action;
import lombok.NoArgsConstructor;

@NoArgsConstructor
public class AncientScholar implements Action {

    @Override
    public void action() {
        System.out.println("I'm a Ancient Scholar");
    }
}
