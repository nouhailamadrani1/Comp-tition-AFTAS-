package com.competition.aftas.service;

import com.competition.aftas.DTO.CompetitionDTO;
import com.competition.aftas.domain.Competition;

import java.util.Date;
import java.util.List;

public interface CompetitionService {
    CompetitionDTO createCompetition(CompetitionDTO competitionDTO);
    CompetitionDTO getCompetitionById(Long id);
    List<CompetitionDTO> getAllCompetitions();
    CompetitionDTO updateCompetition(Long id, CompetitionDTO competitionDTO);
    void deleteCompetition(Long id);
    CompetitionDTO getCompetitionByDate(Date date);
}
