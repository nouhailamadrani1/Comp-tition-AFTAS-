package com.competition.aftas.controller;

import com.competition.aftas.domain.Competition;
import com.competition.aftas.service.CompetitionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.competition.aftas.DTO.CompetitionDTO;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/competitions")
public class CompetitionController {

    private final CompetitionService competitionService;

    @Autowired
    public CompetitionController(CompetitionService competitionService) {
        this.competitionService = competitionService;
    }

    @PostMapping
    public ResponseEntity<CompetitionDTO> createCompetition(@RequestBody CompetitionDTO competitionDTO) {
        CompetitionDTO createdCompetition = competitionService.saveCompetition(competitionDTO);
        return new ResponseEntity<>(createdCompetition, HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Competition> getCompetitionById(@PathVariable Integer id) {
        Competition competition = competitionService.getCompetitionById(Long.valueOf(id));
        return ResponseEntity.ok(competition);
    }

    @GetMapping
    public ResponseEntity<List<CompetitionDTO>> getAllCompetitions() {
        List<CompetitionDTO> competitions = competitionService.getAllCompetitions();
        return ResponseEntity.ok(competitions);
    }

    @PutMapping("/{id}")
    public ResponseEntity<CompetitionDTO> updateCompetition(@PathVariable Long id, @RequestBody CompetitionDTO competitionDTO) {
        CompetitionDTO updatedCompetition = competitionService.updateCompetition(id, competitionDTO);
        return ResponseEntity.ok(updatedCompetition);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteCompetition(@PathVariable Long id) {
        competitionService.deleteCompetition(id);
        return ResponseEntity.noContent().build();
    }

}
