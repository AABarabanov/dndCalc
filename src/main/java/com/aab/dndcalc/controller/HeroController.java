package com.aab.dndcalc.controller;

import com.aab.dndcalc.model.Hero;
import com.aab.dndcalc.model.User;
import com.aab.dndcalc.servise.HeroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("api/dndcalc")
public class HeroController {

    @Autowired
    public HeroService heroService;

    @PostMapping("/add")
    public Hero addHero(@RequestBody Hero newHero) {
        return heroService.addHero(newHero);
    }

    @GetMapping("/hero/{id}")
    public Hero getHeroById(@PathVariable Long id) {
        return heroService.getHeroById(id);
    }

    @PutMapping("/put/{id}")
    public Hero putHeroById(@PathVariable Long id, Hero heroFromRequest) {
        return heroService.putHeroById(id, heroFromRequest);
    }

    @PatchMapping("/hero/{id}")
    public Hero patchHeroById(@PathVariable Long id,
                              @RequestBody Map<String, Object> updates,
                              @AuthenticationPrincipal User currentUser) {
        return heroService.patchHero(id, updates, currentUser);
    }


    @DeleteMapping("/delete/{id}")
    public void deleteHero(@PathVariable Long id) {
        heroService.deleteHero(id);
    }

}
