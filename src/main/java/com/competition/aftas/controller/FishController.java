package com.competition.aftas.controller;

import com.competition.aftas.domain.Fish;
import com.competition.aftas.service.FishService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/fish")
public class FishController {

    @Autowired
    private FishService fishService;

    @PostMapping
    public Fish saveFish(@RequestBody Fish fish) {
        return fishService.saveFish(fish);
    }


}
