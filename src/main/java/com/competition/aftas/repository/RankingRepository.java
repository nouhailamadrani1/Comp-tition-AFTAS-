package com.competition.aftas.repository;
import com.competition.aftas.domain.Ranking;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RankingRepository extends JpaRepository<Ranking, Integer> {
}
