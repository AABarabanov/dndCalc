package com.aab.dndcalc.servise;

import com.aab.dndcalc.model.Hero;

public interface HeroService {
    Hero addHero(Hero heroFromRequest);
    Hero getHeroById(Long id);

    Hero putHeroById(Long id, Hero heroFromRequest);
    // todo Рассмотреть возможность частичного обновления

    void deleteHero(Long id);
}
