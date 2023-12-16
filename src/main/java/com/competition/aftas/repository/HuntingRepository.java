package com.competition.aftas.repository;

import com.competition.aftas.domain.Competition;
import com.competition.aftas.domain.Fish;
import com.competition.aftas.domain.Hunting;
import com.competition.aftas.domain.Member;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface HuntingRepository extends JpaRepository<Hunting, Integer> {
    Hunting findByMemberAndCompetitionAndFish(Member member, Competition competition, Fish fish);
    List<Hunting> findByCompetition( Competition competition);
}
