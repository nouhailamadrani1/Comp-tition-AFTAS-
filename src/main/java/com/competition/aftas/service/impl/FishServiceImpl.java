package com.competition.aftas.service.impl;

import com.competition.aftas.domain.Fish;
import com.competition.aftas.repository.FishRepository;
import com.competition.aftas.service.FishService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FishServiceImpl implements FishService {

    @Autowired
    private FishRepository fishRepository;

    @Override
    public Fish saveFish(Fish fish) {
        return fishRepository.save(fish);
    }


}
