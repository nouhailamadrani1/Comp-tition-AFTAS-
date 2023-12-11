package com.competition.aftas.controller;

import com.competition.aftas.domain.Competition;
import com.competition.aftas.service.CompetitionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/competitions")
public class CompetitionController {

    @Autowired
    private CompetitionService competitionService;

    @PostMapping
    public Competition saveCompetition(@RequestBody Competition competition) {
        return competitionService.saveCompetition(competition);
    }


}
