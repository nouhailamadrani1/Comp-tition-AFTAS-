package com.competition.aftas.service.impl;

import com.competition.aftas.domain.Level;
import com.competition.aftas.repository.LevelRepository;
import com.competition.aftas.service.LevelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LevelServiceImpl implements LevelService {

    @Autowired
    private LevelRepository levelRepository;

    @Override
    public Level saveLevel(Level level) {
        return levelRepository.save(level);
    }


}
