package com.competition.aftas.controller;

import com.competition.aftas.domain.Level;
import com.competition.aftas.service.LevelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/levels")
public class LevelController {

    @Autowired
    private LevelService levelService;

    @PostMapping
    public Level saveLevel(@RequestBody Level level) {
        return levelService.saveLevel(level);
    }

    @GetMapping("/{code}")
    public Level getLevelById(@PathVariable Integer code) {
        return levelService.getLevelById(code);
    }

    @GetMapping
    public List<Level> getAllLevels() {
        return levelService.getAllLevels();
    }

    @PutMapping("/{code}")
    public Level updateLevel(@PathVariable Integer code, @RequestBody Level updatedLevel) {
        return levelService.updateLevel(code, updatedLevel);
    }

    @DeleteMapping("/{code}")
    public void deleteLevel(@PathVariable Integer code) {
        levelService.deleteLevel(code);
    }
}
