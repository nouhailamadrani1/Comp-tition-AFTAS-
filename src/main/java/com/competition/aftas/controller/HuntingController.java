package com.competition.aftas.controller;

import com.competition.aftas.domain.Hunting;
import com.competition.aftas.service.HuntingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/huntings")
public class HuntingController {

    @Autowired
    private HuntingService huntingService;

    @PostMapping
    public Hunting saveHunting(@RequestBody Hunting hunting) {
        return huntingService.saveHunting(hunting);
    }


}
