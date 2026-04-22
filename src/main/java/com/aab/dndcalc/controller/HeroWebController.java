package com.aab.dndcalc.controller;

import com.aab.dndcalc.model.Hero;
import com.aab.dndcalc.model.User;
import com.aab.dndcalc.servise.HeroService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequiredArgsConstructor
@RequestMapping("/heroes")
public class HeroWebController {

    private final HeroService heroService;

    @GetMapping
    public String listHeroes(Model model,
                             @AuthenticationPrincipal User currentUser) {
        List<Hero> heroes = heroService.getUserHeroes(currentUser);

        model.addAttribute("heroes", heroes);
        model.addAttribute("username", currentUser.getUsername());

        return "heroes";
    }

    @GetMapping("/new")
    public String showCreateForm(Model model) {
        model.addAttribute("hero", new Hero());
        return "hero-form";
    }

    @PostMapping("/new")
    public String createHero(@ModelAttribute Hero hero,
                             @AuthenticationPrincipal User currentUser) {
        hero.setUser(currentUser);
        heroService.addHero(hero);
        return "redirect:/heroes";
    }

    @GetMapping("/{id}")
    public String viewHero(@PathVariable Long id,
                           Model model,
                           @AuthenticationPrincipal User currentUser) {
        Hero hero = heroService.getHeroByIdAndUser(id, currentUser);
        model.addAttribute("hero", hero);
        return "hero-detail";
    }


    @GetMapping("/{id}/edit")
    public String editHero(@PathVariable Long id,
                           Model model,
                           @AuthenticationPrincipal User currentUser) {
        Hero hero = heroService.getHeroByIdAndUser(id, currentUser);
        model.addAttribute("hero", hero);
        return "hero-edit";
    }

    @PostMapping("/{id}/edit")
    public String updateHero(@PathVariable Long id,
                             @ModelAttribute Hero hero,
                             @AuthenticationPrincipal User currentUser) {
        Hero existingHero = heroService.getHeroByIdAndUser(id, currentUser);

        existingHero.setName(hero.getName());
        existingHero.setRace(hero.getRace());
        existingHero.setHeroClass(hero.getHeroClass());
        existingHero.setLevel(hero.getLevel());
        existingHero.setDefenceClass(hero.getDefenceClass());
        existingHero.setAttackCheck(hero.getAttackCheck());
        existingHero.setDamageByHero(hero.getDamageByHero());
        existingHero.setLoadCapacity(hero.getLoadCapacity());

        heroService.addHero(existingHero);

        return "redirect:/heroes/" + id;
    }

    @PostMapping("/{id}/delete")
    public String deleteHero(@PathVariable Long id) {
        heroService.deleteHero(id);
        return "redirect:/heroes";
    }


}
