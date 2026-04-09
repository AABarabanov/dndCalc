package com.aab.dndcalc.utils;

import com.aab.dndcalc.model.Hero;

public class TestDataFactory {

    private static Long counter = 0L;

    public static Hero createHero() {

        counter++;

        Hero hero = new Hero();

        hero.setId(counter);
        hero.setName("TestHero" + counter);
        hero.setRace("TestRace" + counter);
        hero.setLevel(1);
        hero.setDefenceClass(1);
        hero.setAttackCheck(1);
        hero.setDamageByHero(1);
        hero.setLoadCapacity(1);
        return hero;
    }



}
