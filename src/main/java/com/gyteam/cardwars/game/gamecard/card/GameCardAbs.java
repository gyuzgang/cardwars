package com.gyteam.cardwars.game.gamecard.card;

import com.gyteam.cardwars.game.gamecard.GameCardState;
import com.gyteam.cardwars.model.entity.Card;
import com.gyteam.cardwars.model.enums.CardType;
import com.gyteam.cardwars.model.enums.LandType;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public abstract class GameCardAbs {

    protected String name;
    protected String description;
    protected Integer cost;
    protected Integer attack;
    protected Integer defense;
    // probably redundant since card type is defined by the interface
    protected CardType cardType;
    protected LandType landType;
    protected GameCardState gameCardState;

    public GameCardAbs(Card card) {
        this.name = card.getName();
        this.description = card.getDescription();
        this.cost = card.getCost();
        this.attack = card.getAttack();
        this.defense = card.getDefense();
        this.cardType = card.getCardType();
        this.landType = card.getLandType();
        this.gameCardState = new GameCardState(card.getAttack(), card.getDefense());
    }
}
