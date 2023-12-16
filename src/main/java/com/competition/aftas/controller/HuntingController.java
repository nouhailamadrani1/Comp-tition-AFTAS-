package com.competition.aftas.controller;

import com.competition.aftas.DTO.HuntingDTO;
import com.competition.aftas.domain.Hunting;
import com.competition.aftas.service.HuntingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/huntings")
public class HuntingController {

    private final HuntingService huntingService;

    @Autowired
    public HuntingController(HuntingService huntingService) {
        this.huntingService = huntingService;
    }

    @GetMapping("/{id}")
    public HuntingDTO getHunting(@PathVariable Integer id) {
        return huntingService.getHuntingById(id);
    }

    @GetMapping
    public List<HuntingDTO> getAllHuntings() {
        return huntingService.getAllHuntings();
    }

    @PostMapping
    public HuntingDTO createHunting(@RequestBody HuntingDTO huntingDTO) {
        return huntingService.createHunting(huntingDTO);
    }

    @PutMapping("/{id}")
    public HuntingDTO updateHunting(@PathVariable Integer id, @RequestBody HuntingDTO huntingDTO) {
        return huntingService.updateHunting(id, huntingDTO);
    }

    @DeleteMapping("/{id}")
    public void deleteHunting(@PathVariable Integer id) {
        huntingService.deleteHunting(id);
    }


}
