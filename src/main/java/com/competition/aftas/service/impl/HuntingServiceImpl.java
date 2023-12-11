package com.competition.aftas.service.impl;

import com.competition.aftas.domain.Hunting;
import com.competition.aftas.repository.HuntingRepository;
import com.competition.aftas.service.HuntingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HuntingServiceImpl implements HuntingService {

    @Autowired
    private HuntingRepository huntingRepository;

    @Override
    public Hunting saveHunting(Hunting hunting) {
        return huntingRepository.save(hunting);
    }


}
