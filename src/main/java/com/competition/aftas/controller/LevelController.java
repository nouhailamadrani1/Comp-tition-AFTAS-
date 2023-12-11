package com.competition.aftas.controller;

import com.competition.aftas.domain.Level;
import com.competition.aftas.service.LevelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/levels")
public class LevelController {

    @Autowired
    private LevelService levelService;

    @PostMapping
    public Level saveLevel(@RequestBody Level level) {
        return levelService.saveLevel(level);
    }


}
