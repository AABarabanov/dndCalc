package com.aab.dndcalc.servise;

import com.aab.dndcalc.model.Hero;
import com.aab.dndcalc.model.User;
import com.aab.dndcalc.repository.HeroRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

@Service
@AllArgsConstructor
public class HeroServiceImpl implements HeroService {

    private final HeroRepository repository;

    @Override
    public Hero addHero(Hero heroFromRequest) {
        return repository.save(heroFromRequest);
    }

    @Override
    public Hero getHeroById(Long id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public Hero getHeroByIdAndUser(Long id, User user) {
        return repository.findByIdAndUser(id, user).
                orElseThrow(() -> new RuntimeException("Can't find hero or hero's not yours"));
    }

    @Override
    public Hero putHeroById(Long id, Hero heroFromRequest) {
        return repository.save(heroFromRequest);
    }

    @Override
    public void deleteHero(Long id) {
        repository.deleteById(id);
    }

    @Override
    public List<Hero> getUserHeroes(User userFromRequest) {
        return repository.findByUser(userFromRequest);
    }

    @Override
    @Transactional
    public Hero patchHero(Long id, Map<String, Object> updates, User user) {
        Hero hero = getHeroByIdAndUser(id, user);

        for (Map.Entry<String, Object> entry : updates.entrySet()) {
            switch (entry.getKey()) {
                case "name":
                    hero.setName(entry.getValue().toString());
                    break;
                case "description":
                    hero.setRace(entry.getValue().toString());
                    break;
                case "heroClass":
                    hero.setHeroClass(entry.getValue().toString());
                    break;
                case "level":
                    hero.setLevel((Integer) entry.getValue());
                    break;
                case "defenceClass":
                    hero.setDefenceClass((Integer) entry.getValue());
                    break;
                case "attackCheck":
                    hero.setAttackCheck((Integer) entry.getValue());
                    break;
                case "damageByHero":
                    hero.setDamageByHero((Integer) entry.getValue());
                    break;
                case "loadCapacity":
                    hero.setLoadCapacity((Integer) entry.getValue());
                default:
                    break;
            }
        }
        return repository.save(hero);
    }
}

