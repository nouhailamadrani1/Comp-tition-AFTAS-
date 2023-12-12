package com.competition.aftas.service;

import com.competition.aftas.domain.Level;

import java.util.List;

public interface LevelService {
    Level saveLevel(Level level);
    Level getLevelById(Integer code);
    List<Level> getAllLevels();
    Level updateLevel(Integer code, Level updatedLevel);
    void deleteLevel(Integer code);
}
