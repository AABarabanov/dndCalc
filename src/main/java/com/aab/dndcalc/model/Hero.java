package com.aab.dndcalc.model;

public class Hero {

    private String name;
    private String race;
    private int level;
    private int defenceClass;
    private int attackCheck;
    private int damageByHero;
    private int loadCapacity;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getDefenceClass() {
        return defenceClass;
    }

    public void setDefenceClass(int defenceClass) {
        this.defenceClass = defenceClass;
    }

    public int getAttackCheck() {
        return attackCheck;
    }

    public void setAttackCheck(int attackCheck) {
        this.attackCheck = attackCheck;
    }

    public int getDamageByHero() {
        return damageByHero;
    }

    public void setDamageByHero(int damageByHero) {
        this.damageByHero = damageByHero;
    }

    public int getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(int loadCapacity) {
        this.loadCapacity = loadCapacity;
    }
}
