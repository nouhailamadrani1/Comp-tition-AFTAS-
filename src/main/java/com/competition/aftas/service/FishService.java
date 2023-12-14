package com.competition.aftas.service;

import com.competition.aftas.DTO.FishDTO;
import com.competition.aftas.domain.Fish;

import java.util.List;

public interface FishService {
    FishDTO createFish(FishDTO fishDTO);
    FishDTO getFishById(Integer id);
    List<FishDTO> getAllFish();
    FishDTO updateFish(Integer id, FishDTO fishDTO);
    void deleteFish(Integer id);
}