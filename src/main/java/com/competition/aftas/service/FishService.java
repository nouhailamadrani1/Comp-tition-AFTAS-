package com.competition.aftas.service;

import com.competition.aftas.domain.Fish;

import java.util.List;

public interface FishService {
    Fish saveFish(Fish fish);
    Fish getFishById(Integer id);
    List<Fish> getAllFish();
    Fish updateFish(Integer id, Fish updatedFish);
    void deleteFish(Integer id);
}
