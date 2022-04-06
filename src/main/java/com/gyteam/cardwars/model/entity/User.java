package com.gyteam.cardwars.model.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.Set;

@Entity
@Table(name = "player")
public class User {
    @Id
    private Long id;

    @OneToMany
    private Set<Deck> deck;

}
