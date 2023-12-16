package com.competition.aftas.repository;
import com.competition.aftas.domain.Member;
import com.competition.aftas.domain.MemberCompetitionId;
import com.competition.aftas.domain.Ranking;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;


public interface RankingRepository extends JpaRepository<Ranking, MemberCompetitionId> {
    List<Ranking> findByIdCompetitionId(Long competitionId);
    @Query("SELECT DISTINCT r.id.member FROM Ranking r WHERE r.id.competition.id = :competitionId")
    List<Member> findMembersByCompetitionId(@Param("competitionId") Long competitionId);
    List<Ranking> findById_Competition_IdAndId_Competition_DateOrderByScoreDescRankAsc(
            Long competitionId, LocalDate date);
}