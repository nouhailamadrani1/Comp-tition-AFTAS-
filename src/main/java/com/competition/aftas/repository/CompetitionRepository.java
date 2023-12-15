package com.competition.aftas.repository;
import com.competition.aftas.domain.Competition;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Date;


public interface CompetitionRepository extends JpaRepository<Competition, Long> {
    Competition findByDate(Date date);

    boolean existsByDate(Date date);
}
