package com.aab.dndcalc.service;

import com.aab.dndcalc.model.Hero;
import com.aab.dndcalc.repository.HeroRepository;
import com.aab.dndcalc.servise.HeroServiceImpl;
import com.aab.dndcalc.utils.TestDataFactory;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Optional;

import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;


@ExtendWith(MockitoExtension.class)
public class HeroServiceImplTest {

    @Mock
    private HeroRepository heroRepository;

    @InjectMocks
    private HeroServiceImpl heroService;

    private Hero inputHero;

    @BeforeEach
    void setUp(){
        inputHero = TestDataFactory.createHero();
    }

    @Test
    void addHeroShouldReturnAndSaveHero() {

        when(heroRepository.save(any(Hero.class))).thenReturn(inputHero);
        Hero result = heroService.addHero(inputHero);

        assertEquals(inputHero, result);
    }

    @Test
    void getHeroByIdShouldReturnHeroIfExists() {
        when(heroRepository.findById(anyLong())).thenReturn(Optional.of(inputHero));
        Hero result = heroService.getHeroById(inputHero.getId());

        assertNotNull(result);
        assertEquals(inputHero, result);
    }

    @Test
    void getHeroByIdShouldReturnNullIfNotFound() {
        when(heroRepository.findById(anyLong())).thenReturn(Optional.empty());
        Hero result = heroService.getHeroById(inputHero.getId());
        assertNull(result);
    }

    @Test
    void putHeroByIdShouldReturnAndSaveHero() {

        Hero newHero = TestDataFactory.createHero();

        when(heroRepository.save(any(Hero.class))).thenReturn(newHero);
        Hero result = heroService.putHeroById(inputHero.getId(), newHero);

        assertNotNull(result);
        assertEquals(newHero, result);
    }

    @Test
    void deleteHeroByIdIfExists() {
        Long id = inputHero.getId();
        heroService.deleteHero(id);

        assertNull(heroService.getHeroById(id));
    }

}
