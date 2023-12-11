package com.competition.aftas.service.impl;


import com.competition.aftas.domain.Ranking;
import com.competition.aftas.repository.RankingRepository;
import com.competition.aftas.service.RankingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RankingServiceImpl implements RankingService {

    private final RankingRepository rankingRepository;

    @Autowired
    public RankingServiceImpl(RankingRepository rankingRepository) {
        this.rankingRepository = rankingRepository;
    }

    @Override
    public Ranking saveRanking(Ranking ranking) {
        return rankingRepository.save(ranking);
    }

}
