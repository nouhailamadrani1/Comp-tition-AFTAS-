package com.competition.aftas.service.impl;

import com.competition.aftas.domain.Level;
import com.competition.aftas.repository.LevelRepository;
import com.competition.aftas.service.LevelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LevelServiceImpl implements LevelService {

    @Autowired
    private LevelRepository levelRepository;

    @Override
    public Level saveLevel(Level level) {
        return levelRepository.save(level);
    }

    @Override
    public Level getLevelById(Integer code) {
        Optional<Level> optionalLevel = levelRepository.findById(code);
        return optionalLevel.orElse(null);
    }

    @Override
    public List<Level> getAllLevels() {
        return levelRepository.findAll();
    }

    @Override
    public Level updateLevel(Integer code, Level updatedLevel) {
        Optional<Level> optionalLevel = levelRepository.findById(code);
        if (optionalLevel.isPresent()) {
            Level existingLevel = optionalLevel.get();
            existingLevel.setDescription(updatedLevel.getDescription());
            existingLevel.setPoints(updatedLevel.getPoints());
            return levelRepository.save(existingLevel);
        }
        return null;
    }

    @Override
    public void deleteLevel(Integer code) {
        levelRepository.deleteById(code);
    }
}
