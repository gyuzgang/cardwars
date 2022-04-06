package com.gyteam.cardwars.game;

import com.gyteam.cardwars.game.gamecard.card.GameCardAbs;
import com.gyteam.cardwars.game.gameland.GameLand;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.List;
import java.util.Set;

@AllArgsConstructor
@Getter
public class GameDeck {

    private List<GameCardAbs> cards;
    private Set<GameLand> lands;

    public GameCardAbs takeCard() {
        if (!cards.isEmpty())
            return cards.remove(0);
        return null;
    }
}
