package com.gyteam.cardwars.game;

import com.gyteam.cardwars.game.gamecard.card.GameCardAbs;
import com.gyteam.cardwars.model.enums.LandType;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class Player {

    private static final int GAME_FIELDS_COUNT = 4;
    private GameField[] player2GameFields = new GameField[GAME_FIELDS_COUNT];

    private int hitPoints = 25;

    private int playersActionsCount;

    private GameDeck handDeck;
    private List<GameCardAbs> dropDeck = new ArrayList<>();

    private List<GameCardAbs> handCards;

    public Player(GameDeck handDeck) {
        this.handDeck = handDeck;
    }

    public void beforeGame(List<LandType> landTypes) {
        if (landTypes.size() != GAME_FIELDS_COUNT)
             throw new IllegalStateException("Number of fields is " + landTypes.size() + " != " + GAME_FIELDS_COUNT);

        for (int i = 0; i < GAME_FIELDS_COUNT; i++) {
            player2GameFields[i].setLandType(landTypes.get(i));
        }
    }

    public void prepareCards() {

    }

    public void placeCreature() {

    }

    public void placeBuilding() {

    }

    // mb move to
    public void moveCard(){}
    public void takeCardFromDrop(){}
    public void takeDroppedCardToDeckTop(){}



    public void takeCardFromDeck() {
        handCards.add(handDeck.takeCard());
    }

    public void takeCardFromPlayer(Player p, int i) {
        handCards.add(p.giveHandCard(i));
    }

    public GameCardAbs giveHandCard(int i) {
        if (i < 0) {
            return handCards.remove(0);
        } else if (i > handCards.size()) {
            return handCards.get(handCards.size() - 1);
        } else {
            return handCards.remove(i);
        }

    }

    public int takeDamage(int damage) {
        hitPoints -= damage;
        return hitPoints;
    }

    public boolean hasFloopable() {
//        for (GameCardAbs card : getHandCards()) {
//            if (card instanceof Floopable && PositionalState.PREPARED == card.getState().contains) {
//                return true;
//            }
//        }
        return false;
    }

    public void getHandDeck() {
        // get deck from DB
        // create GameDeck(deckFromDb)

    }


}
