package com.competition.aftas.service;

import com.competition.aftas.domain.Competition;

import java.util.List;

public interface CompetitionService {
    Competition saveCompetition(Competition competition);
    Competition getCompetitionByCode(Long code);
    List<Competition> getAllCompetitions();
    Competition updateCompetition(Long code, Competition updatedCompetition);
    void deleteCompetition(Long code);
}
