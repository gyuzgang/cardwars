package com.gyteam.cardwars.model.entity;

import com.gyteam.cardwars.model.enums.LandType;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;


@Entity
@Table(name = "land")
@Getter
@Setter
@NoArgsConstructor
public class Land {

    @Id
    private Long id;

    @Enumerated(EnumType.STRING)
    @Column(name = "land_type")
    private LandType landType;
}
