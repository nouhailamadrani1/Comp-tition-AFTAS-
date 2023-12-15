package com.competition.aftas.service.impl;

import com.competition.aftas.DTO.CompetitionDTO;
import com.competition.aftas.domain.Competition;
import com.competition.aftas.repository.CompetitionRepository;
import com.competition.aftas.service.CompetitionService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class CompetitionServiceImpl implements CompetitionService {

    private final CompetitionRepository competitionRepository;

    @Autowired
    public CompetitionServiceImpl(CompetitionRepository competitionRepository) {
        this.competitionRepository = competitionRepository;
    }

    @Override
    public CompetitionDTO createCompetition(CompetitionDTO competitionDTO) {

        Date date = competitionDTO.getDate();
        if (competitionRepository.existsByDate(date)) {
            throw new IllegalArgumentException(" already exists date");
        }


        Competition competition = new Competition();
        BeanUtils.copyProperties(competitionDTO, competition);
        competition = competitionRepository.save(competition);
        BeanUtils.copyProperties(competition, competitionDTO);
        return competitionDTO;
    }


    @Override
    public CompetitionDTO getCompetitionById(Long id) {
        Competition competition = competitionRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Competition not found with id: " + id));

        CompetitionDTO competitionDTO = new CompetitionDTO();
        BeanUtils.copyProperties(competition, competitionDTO);
        return competitionDTO;
    }

    @Override
    public List<CompetitionDTO> getAllCompetitions() {
        List<Competition> competitions = competitionRepository.findAll();
        return competitions.stream()
                .map(this::convertEntityToDTO)
                .collect(Collectors.toList());
    }

    @Override
    public CompetitionDTO updateCompetition(Long id, CompetitionDTO competitionDTO) {
        Competition existingCompetition = competitionRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Competition not found with id: " + id));

        BeanUtils.copyProperties(competitionDTO, existingCompetition);
        existingCompetition = competitionRepository.save(existingCompetition);

        BeanUtils.copyProperties(existingCompetition, competitionDTO);
        return competitionDTO;
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

    @Override
    public CompetitionDTO getCompetitionByDate(Date date) {
        Competition competition = competitionRepository.findByDate(date);
        if (competition == null) {
            return null;
        }
        CompetitionDTO competitionDTO = new CompetitionDTO();
        BeanUtils.copyProperties(competition, competitionDTO);
        return competitionDTO;
    }

}
