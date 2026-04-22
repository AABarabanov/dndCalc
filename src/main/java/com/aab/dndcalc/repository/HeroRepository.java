package com.aab.dndcalc.repository;

import com.aab.dndcalc.model.Hero;
import com.aab.dndcalc.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface HeroRepository extends JpaRepository<Hero, Long> {
    List<Hero> findByUser(User user);
    Optional<Hero> findByIdAndUser(Long id, User user);
}
