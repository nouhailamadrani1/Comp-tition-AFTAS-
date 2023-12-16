package com.competition.aftas.service;

import com.competition.aftas.DTO.MemberDTO;
import com.competition.aftas.DTO.RankingDTO;
import com.competition.aftas.domain.Competition;
import com.competition.aftas.domain.Ranking;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

public interface RankingService {
    RankingDTO createRanking(RankingDTO rankingDTO);
    List<RankingDTO> getRankingsByCompetition(Long competitionId);
    // Other methods as needed
    List<MemberDTO> getAllMembersByCompetition(Long competitionId);

    void updateScore(RankingDTO rankingDTO);


}
