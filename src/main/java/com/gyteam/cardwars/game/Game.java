package com.gyteam.cardwars.game;

import com.gyteam.cardwars.game.gamecard.card.GameCardAbs;
import com.gyteam.cardwars.game.gamecard.cardability.FloopableAbility;
import com.gyteam.cardwars.game.gamecard.cardtype.Building;
import com.gyteam.cardwars.game.gamecard.cardtype.Creature;
import com.gyteam.cardwars.game.gamecard.cardtype.Spell;
import com.gyteam.cardwars.model.Board;

import java.util.List;


public class Game implements Runnable {

    private final Board board;

    private GameState gameState;

    private final Player p1;
    private final Player p2;

    private enum PlayersAction {
        PLAY_CARD,
        TAKE_CARD,
        FLOOP,
        END_ACTIONS
    }

    public Game(Board board, Player p1, Player p2) {
        this.board = board;
        this.p1 = p1;
        this.p2 = p2;
    }

    @Override
    public void run() {
        while (true) {
            if (turn(p1)) {
                return;
            }
            if (turn(p2)) {
                return;
            }
        }
    }

    private boolean turn(Player p) {
        prepareCards(p);
        takeCard(p);
        boolean isEndedActions = false;
        while (!isEndedActions && canPlay(p)) {
            switch (getPlayersAction()) {
                case PLAY_CARD -> playCard();
                case TAKE_CARD -> takeCard(p);
                case FLOOP -> floop();
                case END_ACTIONS -> isEndedActions = true;
            }
        }
        attack();

        return isGameOver();
    }

    private boolean canPlay(Player p) {
        return p.getPlayersActionsCount() > 0 && !p.hasFloopable();
    }

    private PlayersAction getPlayersAction() {
        return null;
    }

    private void prepareCards(Player p) {
        p.prepareCards();
    }

    private void takeCard(Player p) {
        if (p.getPlayersActionsCount() < 1) {
            return;
        }

        p.takeCardFromDeck();
    }

    private void playCard() {
        GameCardAbs card = getCardToPlay();
        if (card instanceof Building) {
            placeBuilding();
        }
        if (card instanceof Creature) {
            placeCreature();
        }
        if (card instanceof Spell) {
            castSpell();
        }
    }

    private void castSpell() {

    }

    private void placeCreature() {

    }

    private void placeBuilding() {

    }

    private GameCardAbs getCardToPlay() {
        return null;
    }

    private void floop() {
        getCardToFloop().floop();
    }

    private void attack() {
        List<Creature> attackingCards = getAttackingCards();
        for (Creature card : attackingCards) {
            card.attack(gameState);
        }
    }

    private boolean isGameOver() {
        return p1.getHitPoints() <= 0 || p2.getHitPoints() <= 0;
    }

    // TODO
    private FloopableAbility getCardToFloop() {
        return null;
    }

    // TODO
    private List<Creature> getAttackingCards() {
        return null;
    }


}
