package com.competition.aftas.service.impl;

import com.competition.aftas.domain.Competition;
import com.competition.aftas.repository.CompetitionRepository;
import com.competition.aftas.service.CompetitionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CompetitionServiceImpl implements CompetitionService {

    @Autowired
    private CompetitionRepository competitionRepository;

    @Override
    public Competition saveCompetition(Competition competition) {
        return competitionRepository.save(competition);
    }

    @Override
    public Competition getCompetitionByCode(Long code) {
        Optional<Competition> optionalCompetition = competitionRepository.findByCode(code);
        return optionalCompetition.orElse(null);
    }

    @Override
    public List<Competition> getAllCompetitions() {
        return competitionRepository.findAll();
    }

    @Override
    public Competition updateCompetition(Long code, Competition updatedCompetition) {
        Optional<Competition> optionalCompetition = competitionRepository.findByCode(code);
        if (optionalCompetition.isPresent()) {
            Competition existingCompetition = optionalCompetition.get();
            existingCompetition.setDate(updatedCompetition.getDate());
            existingCompetition.setStartTime(updatedCompetition.getStartTime());
            existingCompetition.setEndTime(updatedCompetition.getEndTime());
            existingCompetition.setNumberOfParticipants(updatedCompetition.getNumberOfParticipants());
            existingCompetition.setLocation(updatedCompetition.getLocation());
            existingCompetition.setAmount(updatedCompetition.getAmount());
            return competitionRepository.save(existingCompetition);
        }
        return null;
    }

    @Override
    public void deleteCompetition(Long code) {
        competitionRepository.deleteByCode(code);
    }
}
