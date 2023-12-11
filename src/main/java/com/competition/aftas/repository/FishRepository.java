package com.competition.aftas.repository;

import com.competition.aftas.domain.Fish;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FishRepository extends JpaRepository<Fish, Integer> {
}
