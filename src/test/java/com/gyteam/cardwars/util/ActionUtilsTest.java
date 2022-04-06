package com.gyteam.cardwars.util;

import com.gyteam.cardwars.model.actions.ActionUtils;
import com.gyteam.cardwars.model.dto.GameCard;
import com.gyteam.cardwars.model.enums.CardType;
import com.gyteam.cardwars.model.enums.LandType;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

/**
 * Temporary tests to check getActionClassByName method
 */
public class ActionUtilsTest {

    private static final String NAME_COOLDOG = "Cool Dog";
    private static final String NAME_BLOOD_FORTRESS = "Blood Fortress";

    private static final String DESCRIPTION = "";
    private static final int COST = 1;

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;
    private final PrintStream originalErr = System.err;

    @BeforeEach
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
        System.setErr(new PrintStream(errContent));
    }

    @AfterEach
    public void restoreStreams() {
        System.setOut(originalOut);
        System.setErr(originalErr);
    }

    @Test
    void setBLuePlainsActionTest() {
        GameCard gameCards = getBLuePlainsCard();

        gameCards.setAction(ActionUtils.getActionClassByName(gameCards.getName(), gameCards.getLandType().getName()));
        gameCards.getAction().action();

        Assertions.assertEquals(gameCards.getName(), removeWords(outContent.toString()));
    }

    @Test
    void setRainbowActionTest() {
        GameCard gameCards = getRainbowCard();

        gameCards.setAction(ActionUtils.getActionClassByName(gameCards.getName(), gameCards.getLandType().getName()));
        gameCards.getAction().action();

        Assertions.assertEquals(gameCards.getName(), removeWords(outContent.toString()));
    }

    GameCard getBLuePlainsCard() {
        var card = new GameCard();
        card.setName(NAME_COOLDOG);
        card.setDescription(DESCRIPTION);
        card.setCardType(CardType.CREATURE);
        card.setCost(COST);
        card.setLandType(LandType.BLUE_PLAINS);

        return card;
    }

    GameCard getRainbowCard() {
        var card = new GameCard();
        card.setName(NAME_BLOOD_FORTRESS);
        card.setDescription(DESCRIPTION);
        card.setCardType(CardType.BUILDING);
        card.setCost(COST);
        card.setLandType(LandType.RAINBOW);

        return card;
    }


    String removeWords(String message) {
        return message.replaceAll("I'm a ", "")
                .replaceAll("\n", "")
                .replaceAll("\r", "");
    }

}
