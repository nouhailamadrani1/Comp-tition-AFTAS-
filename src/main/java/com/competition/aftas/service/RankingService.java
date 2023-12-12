package com.competition.aftas.service;

import com.competition.aftas.domain.Ranking;

import java.util.List;

public interface RankingService {
    Ranking saveRanking(Ranking ranking);
    Ranking getRankingById(Integer id);
    List<Ranking> getAllRankings();
    Ranking updateRanking(Integer id, Ranking updatedRanking);
    void deleteRanking(Integer id);
}
