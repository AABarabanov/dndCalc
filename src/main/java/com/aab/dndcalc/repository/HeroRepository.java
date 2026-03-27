package com.aab.dndcalc.repository;

import com.aab.dndcalc.model.Hero;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HeroRepository extends JpaRepository<Hero, Long> {
}
