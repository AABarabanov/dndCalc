package com.aab.dndcalc.controller;

import com.aab.dndcalc.model.Hero;
import com.aab.dndcalc.servise.HeroService;
import com.aab.dndcalc.utils.TestDataFactory;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import tools.jackson.databind.ObjectMapper;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.when;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;


@ExtendWith(MockitoExtension.class)
public class HeroControllerTest {

    @Mock
    private HeroService heroService;

    @InjectMocks
    private HeroController heroController;


    private  Hero hero;
    private MockMvc mockMvc;
    private ObjectMapper mapper;

    @BeforeEach
    public void setup() {
        hero = TestDataFactory.createHero();
        mockMvc = MockMvcBuilders.standaloneSetup(heroController).build();
        mapper  = new ObjectMapper();
    }

    @Test
    void addHeroShouldReturn200() throws Exception {
        when(heroService.addHero(any(Hero.class))).thenReturn(hero);
        mockMvc.perform(post("/api/dndcalc/add")
                .contentType(MediaType.APPLICATION_JSON)
                .content(mapper.writeValueAsString(hero)))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.id").value(hero.getId()))
                .andExpect(jsonPath("$.name").value(hero.getName()));
    }

    @Test
    void getHeroByIdShouldReturn200() throws Exception {

        when(heroService.getHeroById(hero.getId())).thenReturn(hero);
        mockMvc.perform(get("/api/dndcalc/hero/{id}", hero.getId())).andExpect(status().isOk())
                .andExpect(jsonPath("$.id").value(hero.getId()))
                .andExpect(jsonPath("$.name").value(hero.getName()));
    }

    @Test
    void putHeroShouldReturn200() throws Exception {
        Hero newHero = TestDataFactory.createHero();
        when(heroService.putHeroById(eq(hero.getId()), any(Hero.class))).thenReturn(newHero);
        mockMvc.perform(put("/api/dndcalc/put/{id}", hero.getId())
                .contentType(MediaType.APPLICATION_JSON)
                .content(mapper.writeValueAsString(newHero)))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.id").value(newHero.getId()))
                .andExpect(jsonPath("$.name").value(newHero.getName()));
    }

    @Test
    void deleteHeroByIdShouldReturn200() throws Exception {
        mockMvc.perform(delete("/api/dndcalc/delete/{id}", hero.getId()))
                .andExpect(status().isOk());
    }
}
