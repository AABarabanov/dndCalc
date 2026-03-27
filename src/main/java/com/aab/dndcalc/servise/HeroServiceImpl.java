package com.aab.dndcalc.servise;

import com.aab.dndcalc.model.Hero;
import com.aab.dndcalc.repository.HeroRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

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
    public Hero pullHeroById(Long id, Hero heroFromRequest) {
        return repository.save(heroFromRequest);
    }

    @Override
    public void deleteHero(Long id) {
        repository.deleteById(id);
    }
}
