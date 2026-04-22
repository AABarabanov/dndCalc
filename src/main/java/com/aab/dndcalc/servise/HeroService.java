package com.aab.dndcalc.servise;

import com.aab.dndcalc.model.Hero;
import com.aab.dndcalc.model.User;

import java.util.List;
import java.util.Map;

public interface HeroService {
    Hero addHero(Hero heroFromRequest);
    List<Hero> getUserHeroes(User userFromRequest);
    Hero getHeroById(Long id);
    Hero getHeroByIdAndUser(Long id, User user);
    Hero putHeroById(Long id, Hero heroFromRequest);
    Hero patchHero(Long id, Map<String, Object> updates, User user);
    void deleteHero(Long id);

}
