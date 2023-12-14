package com.competition.aftas.Mapper;

import com.competition.aftas.DTO.CompetitionDTO;
import com.competition.aftas.domain.Competition;
import org.mapstruct.*;

import org.mapstruct.factory.Mappers;
import org.springframework.stereotype.Component;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;


@Mapper
@Component
public interface CompetitionMapper {
    CompetitionMapper INSTANCE = Mappers.getMapper(CompetitionMapper.class);

    @Mapping(target = "id", ignore = true)
    @Mapping(target = "rankings", ignore = true)
    Competition toEntity(CompetitionDTO competitionDTO);

    CompetitionDTO toDTO(Competition competition);
}