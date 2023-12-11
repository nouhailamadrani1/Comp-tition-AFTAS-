package com.competition.aftas.controller;
import com.competition.aftas.domain.Ranking;
import com.competition.aftas.service.RankingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/rankings")
public class RankingController {

    @Autowired
    private RankingService rankingService;

    @PostMapping
    public Ranking saveRanking(@RequestBody Ranking ranking) {
        return rankingService.saveRanking(ranking);
    }


}
