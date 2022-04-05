package com.gyteam.cardwars.model.mapper;

import com.gyteam.cardwars.model.dto.GameCard;
import com.gyteam.cardwars.model.entity.Card;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface CardMapper {

    @Mapping(target = "action", ignore = true)
    GameCard toGameCard(Card card);
}
