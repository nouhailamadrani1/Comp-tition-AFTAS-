package com.competition.aftas.service.impl;

import com.competition.aftas.domain.Fish;
import com.competition.aftas.repository.FishRepository;
import com.competition.aftas.service.FishService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FishServiceImpl implements FishService {

    @Autowired
    private FishRepository fishRepository;

    @Override
    public Fish saveFish(Fish fish) {
        return fishRepository.save(fish);
    }

    @Override
    public Fish getFishById(Integer id) {
        Optional<Fish> optionalFish = fishRepository.findById(id);
        return optionalFish.orElse(null);
    }

    @Override
    public List<Fish> getAllFish() {
        return fishRepository.findAll();
    }

    @Override
    public Fish updateFish(Integer id, Fish updatedFish) {
        Optional<Fish> optionalFish = fishRepository.findById(id);
        if (optionalFish.isPresent()) {
            Fish existingFish = optionalFish.get();
            existingFish.setName(updatedFish.getName());
            existingFish.setAverageWeight(updatedFish.getAverageWeight());
            existingFish.setLevel(updatedFish.getLevel());
            return fishRepository.save(existingFish);
        }
        return null;
    }

    @Override
    public void deleteFish(Integer id) {
        fishRepository.deleteById(id);
    }
}
