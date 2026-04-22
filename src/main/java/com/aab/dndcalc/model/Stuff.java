package com.aab.dndcalc.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

public class Stuff {

    @Getter
    @Setter
    @Entity
    static class Weapon {
        @Id
        @GeneratedValue
        private Long id;
        private String name;
        private String damageType;
        private String damageDices;
        private int skillBonus;
        private int additionalModifier;
        private int weight;
        private boolean inUse;

    }

    @Getter
    @Setter
    @Entity
    static class Shield {
        @Id
        @GeneratedValue
        private Long id;
        private int additionalModifier;
        private int weight;
        private int defenceModifier;
        private boolean inUse;

    }

    @Getter
    @Setter
    @Entity
    static class Other {
        @Id
        @GeneratedValue
        private Long id;
        private String name;
        private String description;
        private int weight;

    }
}