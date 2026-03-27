package com.aab.dndcalc.model;

public class Stuff {

    static class Weapon {
        private String name;
        private String damageType;
        private String damageDices;
        private int skillBonus;
        private int additionalModifier;
        private int weight;
        private boolean inUse;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getDamageDices() {
            return damageDices;
        }

        public void setDamageDices(String damageDices) {
            this.damageDices = damageDices;
        }

        public String getDamageType() {
            return damageType;
        }

        public void setDamageType(String damageType) {
            this.damageType = damageType;
        }

        public int getSkillBonus() {
            return skillBonus;
        }

        public void setSkillBonus(int skillBonus) {
            this.skillBonus = skillBonus;
        }

        public int getAdditionalModifier() {
            return additionalModifier;
        }

        public void setAdditionalModifier(int additionalModifier) {
            this.additionalModifier = additionalModifier;
        }

        public int getWeight() {
            return weight;
        }

        public void setWeight(int weight) {
            this.weight = weight;
        }

        public boolean isInUse() {
            return inUse;
        }

        public void setInUse(boolean inUse) {
            this.inUse = inUse;
        }
    }

    static class Shield {
        private int additionalModifier;
        private int weight;
        private int defenceModifier;
        private boolean inUse;

        public int getAdditionalModifier() {
            return additionalModifier;
        }

        public void setAdditionalModifier(int additionalModifier) {
            this.additionalModifier = additionalModifier;
        }

        public int getWeight() {
            return weight;
        }

        public void setWeight(int weight) {
            this.weight = weight;
        }

        public int getDefenceModifier() {
            return defenceModifier;
        }

        public void setDefenceModifier(int defenceModifier) {
            this.defenceModifier = defenceModifier;
        }

        public boolean isInUse() {
            return inUse;
        }

        public void setInUse(boolean inUse) {
            this.inUse = inUse;
        }
    }

    static class Other {
        private String name;
        private String description;
        private int weight;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public int getWeight() {
            return weight;
        }

        public void setWeight(int weight) {
            this.weight = weight;
        }
    }
}