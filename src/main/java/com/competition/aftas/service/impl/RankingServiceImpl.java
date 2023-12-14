package com.competition.aftas.service.impl;

import com.competition.aftas.DTO.RankingDTO;
import com.competition.aftas.domain.Ranking;
import com.competition.aftas.repository.RankingRepository;
import com.competition.aftas.service.RankingService;
import org.springframework.beans.BeanUtils;
        import org.springframework.beans.factory.annotation.Autowired;
        import org.springframework.stereotype.Service;
        import java.util.List;
        import java.util.stream.Collectors;

@Service
public class RankingServiceImpl implements RankingService {

    private final RankingRepository rankingRepository;

    @Autowired
    public RankingServiceImpl(RankingRepository rankingRepository) {
        this.rankingRepository = rankingRepository;
    }

    @Override
    public RankingDTO createRanking(RankingDTO rankingDTO) {
        Ranking ranking = new Ranking();
        BeanUtils.copyProperties(rankingDTO, ranking);
        rankingRepository.save(ranking);
        return rankingDTO;
    }

    @Override
    public List<RankingDTO> getRankingsByCompetition(Long competitionId) {
        List<Ranking> rankings = rankingRepository.findByIdCompetitionId(competitionId);
        return rankings.stream()
                .map(this::convertEntityToDTO)
                .collect(Collectors.toList());
    }

    // Other methods as needed

    private RankingDTO convertEntityToDTO(Ranking ranking) {
        RankingDTO rankingDTO = new RankingDTO();
        BeanUtils.copyProperties(ranking, rankingDTO);
        rankingDTO.setMemberId(Long.valueOf(ranking.getId().getMember().getNum()));
        rankingDTO.setCompetitionId(ranking.getId().getCompetition().getId());
        return rankingDTO;
    }
}
