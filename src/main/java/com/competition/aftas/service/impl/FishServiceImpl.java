package com.competition.aftas.service.impl;

import com.competition.aftas.domain.Fish;
import com.competition.aftas.DTO.FishDTO;
import com.competition.aftas.repository.FishRepository;
import com.competition.aftas.service.FishService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class FishServiceImpl implements FishService {

    @Autowired
    private FishRepository fishRepository;

    @Override
    public FishDTO saveFish(FishDTO fishDTO) {
        Fish fish = new Fish();
        BeanUtils.copyProperties(fishDTO, fish);
        Fish savedFish = fishRepository.save(fish);
        BeanUtils.copyProperties(savedFish, fishDTO);
        return fishDTO;
    }

    @Override
    public FishDTO getFishById(Integer id) {
        Optional<Fish> optionalFish = fishRepository.findById(id);
        return optionalFish.map(this::convertEntityToDTO).orElse(null);
    }

    @Override
    public List<FishDTO> getAllFish() {
        List<Fish> fishList = fishRepository.findAll();
        return fishList.stream()
                .map(this::convertEntityToDTO)
                .collect(Collectors.toList());
    }

    @Override
    public FishDTO updateFish(Integer id, FishDTO updatedFishDTO) {
        Optional<Fish> optionalFish = fishRepository.findById(id);
        if (optionalFish.isPresent()) {
            Fish existingFish = optionalFish.get();
            BeanUtils.copyProperties(updatedFishDTO, existingFish);
            Fish updatedFish = fishRepository.save(existingFish);
            BeanUtils.copyProperties(updatedFish, updatedFishDTO);
            return updatedFishDTO;
        }
        return null;
    }

    @Override
    public void deleteFish(Integer id) {
        fishRepository.deleteById(id);
    }

    private FishDTO convertEntityToDTO(Fish fish) {
        FishDTO fishDTO = new FishDTO();
        BeanUtils.copyProperties(fish, fishDTO);
        return fishDTO;
    }
}
