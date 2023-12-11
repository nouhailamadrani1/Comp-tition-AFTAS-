package com.competition.aftas.service.impl;

import com.competition.aftas.domain.Competition;
import com.competition.aftas.repository.CompetitionRepository;
import com.competition.aftas.service.CompetitionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CompetitionServiceImpl implements CompetitionService {

    @Autowired
    private CompetitionRepository competitionRepository;

    @Override
    public Competition saveCompetition(Competition competition) {
        return competitionRepository.save(competition);
    }


}
