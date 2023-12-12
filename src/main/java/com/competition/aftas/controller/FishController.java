package com.competition.aftas.controller;

import com.competition.aftas.domain.Fish;
import com.competition.aftas.service.FishService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/fish")
public class FishController {

    @Autowired
    private FishService fishService;

    @PostMapping
    public Fish saveFish(@RequestBody Fish fish) {
        return fishService.saveFish(fish);
    }

    @GetMapping("/{id}")
    public Fish getFishById(@PathVariable Integer id) {
        return fishService.getFishById(id);
    }

    @GetMapping
    public List<Fish> getAllFish() {
        return fishService.getAllFish();
    }

    @PutMapping("/{id}")
    public Fish updateFish(@PathVariable Integer id, @RequestBody Fish updatedFish) {
        return fishService.updateFish(id, updatedFish);
    }

    @DeleteMapping("/{id}")
    public void deleteFish(@PathVariable Integer id) {
        fishService.deleteFish(id);
    }
}
