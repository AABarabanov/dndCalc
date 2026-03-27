package com.aab.dndcalc.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
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
    private int level;
    private int defenceClass;
    private int attackCheck;
    private int damageByHero;
    private int loadCapacity;

}
