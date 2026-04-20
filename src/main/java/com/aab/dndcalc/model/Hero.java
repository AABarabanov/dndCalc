package com.aab.dndcalc.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Hero {

    @Id
    @GeneratedValue
    private Long id;

    private String name;
    private String race;
    private String heroClass;
    private int level;
    private int defenceClass;
    private int attackCheck;
    private int damageByHero;
    private int loadCapacity;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

}
