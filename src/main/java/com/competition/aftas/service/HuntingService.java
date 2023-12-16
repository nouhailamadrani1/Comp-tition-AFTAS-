package com.competition.aftas.service;

import com.competition.aftas.DTO.HuntingDTO;
import com.competition.aftas.domain.Hunting;

import java.util.List;
import java.util.Optional;

public interface HuntingService {
    HuntingDTO getHuntingById(Integer id);
    List<HuntingDTO> getAllHuntings();
    HuntingDTO createHunting(HuntingDTO huntingDTO);
    HuntingDTO updateHunting(Integer id, HuntingDTO updatedHuntingDTO);
    void deleteHunting(Integer id);

}
