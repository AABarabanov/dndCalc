package com.aab.dndcalc.servise;

import com.aab.dndcalc.model.Hero;
import com.aab.dndcalc.model.User;
import com.aab.dndcalc.repository.HeroRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

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
}
