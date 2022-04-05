package com.gyteam.cardwars.model.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum LandType {
    CORN_FIELDS("Corn Fields"),
    BLUE_PLAINS("Blue Plains"),
    USELESS_SWAMP("USELESS_SWAMP"),
    NICE_LANDS("USELESS_SWAMP"),
    SANDE_LANDS("USELESS_SWAMP"),
    RAINBOW("Rainbow"),
    ICY_LANDS("USELESS_SWAMP");

    private String name;
}
