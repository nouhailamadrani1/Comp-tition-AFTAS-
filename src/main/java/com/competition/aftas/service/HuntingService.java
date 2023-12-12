package com.competition.aftas.service;

import com.competition.aftas.domain.Hunting;

import java.util.List;

public interface HuntingService {
    Hunting saveHunting(Hunting hunting);
    Hunting getHuntingById(Integer id);
    List<Hunting> getAllHuntings();
    Hunting updateHunting(Integer id, Hunting updatedHunting);
    void deleteHunting(Integer id);
}
