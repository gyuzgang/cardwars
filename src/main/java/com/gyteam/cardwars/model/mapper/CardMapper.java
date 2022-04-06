package com.gyteam.cardwars.model.mapper;

import com.gyteam.cardwars.model.actions.ActionUtils;
import com.gyteam.cardwars.model.dto.GameCard;
import com.gyteam.cardwars.model.entity.Card;
import org.mapstruct.AfterMapping;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;

import java.util.List;

@Mapper(componentModel = "spring", imports = {ActionUtils.class})
public interface CardMapper {

    @Mapping(target = "action", ignore = true)
    GameCard toGameCard(Card card);

    @AfterMapping
    default void setAction(@MappingTarget GameCard gameCard) {
        gameCard.setAction(ActionUtils.getActionClassByName(gameCard.getName(), gameCard.getLandType().getName()));
    }

    List<GameCard> toGameCardList(List<Card> cards);

}
