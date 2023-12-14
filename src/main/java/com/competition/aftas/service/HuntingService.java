package com.competition.aftas.service;

import com.competition.aftas.DTO.HuntingDTO;
import com.competition.aftas.domain.Hunting;

import java.util.List;

public interface HuntingService {
    HuntingDTO saveHunting(HuntingDTO huntingDTO);
    HuntingDTO getHuntingById(Integer id);
    List<HuntingDTO> getAllHuntings();
    HuntingDTO updateHunting(Integer id, HuntingDTO updatedHuntingDTO);
    void deleteHunting(Integer id);
}