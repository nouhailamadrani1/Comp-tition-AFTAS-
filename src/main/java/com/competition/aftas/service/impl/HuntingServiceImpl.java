package com.competition.aftas.service.impl;

import com.competition.aftas.domain.Hunting;
import com.competition.aftas.repository.HuntingRepository;
import com.competition.aftas.service.HuntingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class HuntingServiceImpl implements HuntingService {

    @Autowired
    private HuntingRepository huntingRepository;

    @Override
    public Hunting saveHunting(Hunting hunting) {
        return huntingRepository.save(hunting);
    }

    @Override
    public Hunting getHuntingById(Integer id) {
        Optional<Hunting> optionalHunting = huntingRepository.findById(id);
        return optionalHunting.orElse(null);
    }

    @Override
    public List<Hunting> getAllHuntings() {
        return huntingRepository.findAll();
    }

    @Override
    public Hunting updateHunting(Integer id, Hunting updatedHunting) {
        Optional<Hunting> optionalHunting = huntingRepository.findById(id);
        if (optionalHunting.isPresent()) {
            Hunting existingHunting = optionalHunting.get();
            existingHunting.setNumberOfFish(updatedHunting.getNumberOfFish());
            // Set other properties as needed
            return huntingRepository.save(existingHunting);
        }
        return null;
    }

    @Override
    public void deleteHunting(Integer id) {
        huntingRepository.deleteById(id);
    }
}
