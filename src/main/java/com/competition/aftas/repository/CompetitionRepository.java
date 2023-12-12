package com.competition.aftas.repository;
import com.competition.aftas.domain.Competition;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CompetitionRepository extends JpaRepository<Competition, Long> {
    void deleteByCode(Long code);

    Optional<Competition> findByCode(Long code);
}
