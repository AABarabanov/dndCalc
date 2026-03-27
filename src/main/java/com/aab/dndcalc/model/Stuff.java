package com.aab.dndcalc.model;

import lombok.Getter;
import lombok.Setter;

public class Stuff {

    @Getter
    @Setter
    static class Weapon {
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
    static class Shield {
        private int additionalModifier;
        private int weight;
        private int defenceModifier;
        private boolean inUse;

    }

    @Getter
    @Setter
    static class Other {
        private String name;
        private String description;
        private int weight;

    }
}