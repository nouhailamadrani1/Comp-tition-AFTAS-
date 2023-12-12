package com.competition.aftas.service.impl;

import com.competition.aftas.domain.Ranking;
import com.competition.aftas.repository.RankingRepository;
import com.competition.aftas.service.RankingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RankingServiceImpl implements RankingService {

    @Autowired
    private RankingRepository rankingRepository;

    @Override
    public Ranking saveRanking(Ranking ranking) {
        return rankingRepository.save(ranking);
    }

    @Override
    public Ranking getRankingById(Integer id) {
        Optional<Ranking> optionalRanking = rankingRepository.findById(id);
        return optionalRanking.orElse(null);
    }

    @Override
    public List<Ranking> getAllRankings() {
        return rankingRepository.findAll();
    }

    @Override
    public Ranking updateRanking(Integer id, Ranking updatedRanking) {
        Optional<Ranking> optionalRanking = rankingRepository.findById(id);
        if (optionalRanking.isPresent()) {
            Ranking existingRanking = optionalRanking.get();
            existingRanking.setRank(updatedRanking.getRank());
            existingRanking.setScore(updatedRanking.getScore());

            return rankingRepository.save(existingRanking);
        }
        return null;
    }

    @Override
    public void deleteRanking(Integer id) {
        rankingRepository.deleteById(id);
    }
}
