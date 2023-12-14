package com.competition.aftas.service.impl;

import com.competition.aftas.DTO.FishDTO;
import com.competition.aftas.DTO.LevelDTO;
import com.competition.aftas.domain.Fish;
import com.competition.aftas.domain.Level;
import com.competition.aftas.repository.FishRepository;
import com.competition.aftas.service.FishService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class FishServiceImpl implements FishService {

    private final FishRepository fishRepository;

    @Autowired
    public FishServiceImpl(FishRepository fishRepository) {
        this.fishRepository = fishRepository;
    }

    @Override
    public FishDTO createFish(FishDTO fishDTO) {
        Fish fish = new Fish();
        BeanUtils.copyProperties(fishDTO, fish);
        fishRepository.save(fish);
        return fishDTO;
    }

    @Override
    public FishDTO getFishById(Integer id) {
        Fish fish = fishRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Fish not found with id: " + id));

        FishDTO fishDTO = new FishDTO();
        BeanUtils.copyProperties(fish, fishDTO);
        fishDTO.setLevel(convertEntityToDTO(fish.getLevel()));
        return fishDTO;
    }

    @Override
    public List<FishDTO> getAllFish() {
        List<Fish> fishList = fishRepository.findAll();
        return fishList.stream()
                .map(this::convertEntityToDTO)
                .collect(Collectors.toList());
    }

    @Override
    public FishDTO updateFish(Integer id, FishDTO fishDTO) {
        Fish existingFish = fishRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Fish not found with id: " + id));

        BeanUtils.copyProperties(fishDTO, existingFish);
        existingFish = fishRepository.save(existingFish);

        BeanUtils.copyProperties(existingFish, fishDTO);
        fishDTO.setLevel(convertEntityToDTO(existingFish.getLevel()));
        return fishDTO;
    }

    @Override
    public void deleteFish(Integer id) {
        fishRepository.deleteById(id);
    }

    private FishDTO convertEntityToDTO(Fish fish) {
        FishDTO fishDTO = new FishDTO();
        BeanUtils.copyProperties(fish, fishDTO);
        fishDTO.setLevel(convertEntityToDTO(fish.getLevel()));
        return fishDTO;
    }

    private LevelDTO convertEntityToDTO(Level level) {
        LevelDTO levelDTO = new LevelDTO();
        BeanUtils.copyProperties(level, levelDTO);
        return levelDTO;
    }
}
