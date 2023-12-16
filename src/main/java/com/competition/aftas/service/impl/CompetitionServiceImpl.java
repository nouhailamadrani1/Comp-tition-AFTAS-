package com.competition.aftas.service.impl;

import com.competition.aftas.DTO.CompetitionDTO;
import com.competition.aftas.domain.Competition;
import com.competition.aftas.repository.CompetitionRepository;
import com.competition.aftas.service.CompetitionService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class CompetitionServiceImpl implements CompetitionService {

    @Autowired
    private CompetitionRepository competitionRepository;

    @Override
    public CompetitionDTO saveCompetition(CompetitionDTO competitionDTO) {
        Competition competition = new Competition();
        BeanUtils.copyProperties(competitionDTO, competition);

        Competition savedCompetition = competitionRepository.save(competition);
        BeanUtils.copyProperties(savedCompetition, competitionDTO);
        return competitionDTO;
    }

    @Override
    public Competition getCompetitionById(Long id) {
        Optional<Competition> optionalCompetition = competitionRepository.findById(id);
        return optionalCompetition.orElse(null);
    }

    @Override
    public List<CompetitionDTO> getAllCompetitions() {
        List<Competition> competitionList = competitionRepository.findAll();
        return competitionList.stream()
                .map(this::convertEntityToDTO)
                .collect(Collectors.toList());
    }

    @Override
    public CompetitionDTO updateCompetition(Long id, CompetitionDTO updatedCompetitionDTO) {
        Optional<Competition> optionalCompetition = competitionRepository.findById(id);
        if (optionalCompetition.isPresent()) {
            Competition existingCompetition = optionalCompetition.get();
            BeanUtils.copyProperties(updatedCompetitionDTO, existingCompetition);
            Competition updatedCompetition = competitionRepository.save(existingCompetition);
            BeanUtils.copyProperties(updatedCompetition, updatedCompetitionDTO);
            return updatedCompetitionDTO;
        }
        return null;
    }

    @Override
    public void deleteCompetition(Long id) {
        competitionRepository.deleteById(id);
    }

    private CompetitionDTO convertEntityToDTO(Competition competition) {
        CompetitionDTO competitionDTO = new CompetitionDTO();
        BeanUtils.copyProperties(competition, competitionDTO);
        return competitionDTO;
    }
}
