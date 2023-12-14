package com.competition.aftas.service.impl;

import com.competition.aftas.domain.Hunting;
import com.competition.aftas.DTO.HuntingDTO;
import com.competition.aftas.repository.HuntingRepository;
import com.competition.aftas.service.HuntingService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class HuntingServiceImpl implements HuntingService {

    @Autowired
    private HuntingRepository huntingRepository;

    @Override
    public HuntingDTO saveHunting(HuntingDTO huntingDTO) {
        Hunting hunting = new Hunting();
        BeanUtils.copyProperties(huntingDTO, hunting);
        Hunting savedHunting = huntingRepository.save(hunting);
        BeanUtils.copyProperties(savedHunting, huntingDTO);
        return huntingDTO;
    }

    @Override
    public HuntingDTO getHuntingById(Integer id) {
        Optional<Hunting> optionalHunting = huntingRepository.findById(id);
        return optionalHunting.map(this::convertEntityToDTO).orElse(null);
    }

    @Override
    public List<HuntingDTO> getAllHuntings() {
        List<Hunting> huntingList = huntingRepository.findAll();
        return huntingList.stream()
                .map(this::convertEntityToDTO)
                .collect(Collectors.toList());
    }

    @Override
    public HuntingDTO updateHunting(Integer id, HuntingDTO updatedHuntingDTO) {
        Optional<Hunting> optionalHunting = huntingRepository.findById(id);
        if (optionalHunting.isPresent()) {
            Hunting existingHunting = optionalHunting.get();
            BeanUtils.copyProperties(updatedHuntingDTO, existingHunting);
            Hunting updatedHunting = huntingRepository.save(existingHunting);
            BeanUtils.copyProperties(updatedHunting, updatedHuntingDTO);
            return updatedHuntingDTO;
        }
        return null;
    }

    @Override
    public void deleteHunting(Integer id) {
        huntingRepository.deleteById(id);
    }

    private HuntingDTO convertEntityToDTO(Hunting hunting) {
        HuntingDTO huntingDTO = new HuntingDTO();
        BeanUtils.copyProperties(hunting, huntingDTO);
        return huntingDTO;
    }
}
