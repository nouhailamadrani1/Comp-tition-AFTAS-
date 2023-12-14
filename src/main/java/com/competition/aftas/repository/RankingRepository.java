package com.competition.aftas.repository;
import com.competition.aftas.domain.MemberCompetitionId;
import com.competition.aftas.domain.Ranking;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Date;
import java.util.List;


public interface RankingRepository extends JpaRepository<Ranking, MemberCompetitionId> {
    List<Ranking> findByIdCompetitionId(Long competitionId);

}