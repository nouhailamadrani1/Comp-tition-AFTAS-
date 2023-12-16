package com.competition.aftas.service;

import com.competition.aftas.DTO.CompetitionDTO;
import com.competition.aftas.domain.Competition;

import java.util.List;

public interface CompetitionService {
    CompetitionDTO saveCompetition(CompetitionDTO competitionDTO);
    Competition getCompetitionById(Long id);
    List<CompetitionDTO> getAllCompetitions();
    CompetitionDTO updateCompetition(Long id, CompetitionDTO updatedCompetitionDTO);
    void deleteCompetition(Long id);
}
