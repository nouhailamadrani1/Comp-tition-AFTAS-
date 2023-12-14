package com.competition.aftas.controller;

import com.competition.aftas.DTO.HuntingDTO;
import com.competition.aftas.service.HuntingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/huntings")
public class HuntingController {

    private final HuntingService huntingService;

    @Autowired
    public HuntingController(HuntingService huntingService) {
        this.huntingService = huntingService;
    }

    @PostMapping
    public ResponseEntity<HuntingDTO> saveHunting(@RequestBody HuntingDTO huntingDTO) {
        HuntingDTO createdHunting = huntingService.saveHunting(huntingDTO);
        return new ResponseEntity<>(createdHunting, HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<HuntingDTO> getHuntingById(@PathVariable Integer id) {
        HuntingDTO huntingDTO = huntingService.getHuntingById(id);
        return ResponseEntity.ok(huntingDTO);
    }

    @GetMapping
    public ResponseEntity<List<HuntingDTO>> getAllHuntings() {
        List<HuntingDTO> huntingList = huntingService.getAllHuntings();
        return ResponseEntity.ok(huntingList);
    }

    @PutMapping("/{id}")
    public ResponseEntity<HuntingDTO> updateHunting(@PathVariable Integer id, @RequestBody HuntingDTO updatedHuntingDTO) {
        HuntingDTO updatedHunting = huntingService.updateHunting(id, updatedHuntingDTO);
        return ResponseEntity.ok(updatedHunting);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteHunting(@PathVariable Integer id) {
        huntingService.deleteHunting(id);
        return ResponseEntity.noContent().build();
    }
}
