package com.competition.aftas.service;

import com.competition.aftas.DTO.FishDTO;

import java.util.List;

public interface FishService {
    FishDTO saveFish(FishDTO fishDTO);
    FishDTO getFishById(Integer id);
    List<FishDTO> getAllFish();
    FishDTO updateFish(Integer id, FishDTO updatedFishDTO);
    void deleteFish(Integer id);
}
