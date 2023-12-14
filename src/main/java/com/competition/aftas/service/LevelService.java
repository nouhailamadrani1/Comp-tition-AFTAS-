package com.competition.aftas.service;

import com.competition.aftas.DTO.LevelDTO;
import com.competition.aftas.domain.Level;

import java.util.List;

public interface LevelService {
    LevelDTO createLevel(LevelDTO levelDTO);
    LevelDTO getLevelById(Integer id);
    List<LevelDTO> getAllLevels();
    LevelDTO updateLevel(Integer id, LevelDTO levelDTO);
    void deleteLevel(Integer id);
}
