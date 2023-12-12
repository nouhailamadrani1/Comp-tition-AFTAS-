package com.competition.aftas.controller;

import com.competition.aftas.domain.Ranking;
import com.competition.aftas.service.RankingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/rankings")
public class RankingController {

    @Autowired
    private RankingService rankingService;

    @PostMapping
    public Ranking saveRanking(@RequestBody Ranking ranking) {
        return rankingService.saveRanking(ranking);
    }

    @GetMapping("/{id}")
    public Ranking getRankingById(@PathVariable Integer id) {
        return rankingService.getRankingById(id);
    }

    @GetMapping
    public List<Ranking> getAllRankings() {
        return rankingService.getAllRankings();
    }

    @PutMapping("/{id}")
    public Ranking updateRanking(@PathVariable Integer id, @RequestBody Ranking updatedRanking) {
        return rankingService.updateRanking(id, updatedRanking);
    }

    @DeleteMapping("/{id}")
    public void deleteRanking(@PathVariable Integer id) {
        rankingService.deleteRanking(id);
    }
}
