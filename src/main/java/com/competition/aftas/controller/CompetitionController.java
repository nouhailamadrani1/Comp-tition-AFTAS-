package com.competition.aftas.controller;

import com.competition.aftas.domain.Competition;
import com.competition.aftas.service.CompetitionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/competitions")
public class CompetitionController {

    @Autowired
    private CompetitionService competitionService;

    @PostMapping
    public Competition saveCompetition(@RequestBody Competition competition) {
        return competitionService.saveCompetition(competition);
    }

    @GetMapping("/{code}")
    public Competition getCompetitionByCode(@PathVariable Long code) {
        return competitionService.getCompetitionByCode(code);
    }

    @GetMapping
    public List<Competition> getAllCompetitions() {
        return competitionService.getAllCompetitions();
    }

    @PutMapping("/{code}")
    public Competition updateCompetition(@PathVariable Long code, @RequestBody Competition updatedCompetition) {
        return competitionService.updateCompetition(code, updatedCompetition);
    }

    @DeleteMapping("/{code}")
    public void deleteCompetition(@PathVariable Long code) {
        competitionService.deleteCompetition(code);
    }
}
