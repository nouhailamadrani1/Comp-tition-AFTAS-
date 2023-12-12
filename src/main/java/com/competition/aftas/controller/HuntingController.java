package com.competition.aftas.controller;

import com.competition.aftas.domain.Hunting;
import com.competition.aftas.service.HuntingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/huntings")
public class HuntingController {

    @Autowired
    private HuntingService huntingService;

    @PostMapping
    public ResponseEntity<Hunting> saveHunting(@RequestBody Hunting hunting) {
        Hunting savedHunting = huntingService.saveHunting(hunting);
        return new ResponseEntity<>(savedHunting, HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Hunting> getHuntingById(@PathVariable Integer id) {
        Hunting hunting = huntingService.getHuntingById(id);
        if (hunting != null) {
            return new ResponseEntity<>(hunting, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping
    public List<Hunting> getAllHuntings() {
        return huntingService.getAllHuntings();
    }

    @PutMapping("/{id}")
    public ResponseEntity<Hunting> updateHunting(@PathVariable Integer id, @RequestBody Hunting updatedHunting) {
        Hunting hunting = huntingService.updateHunting(id, updatedHunting);
        if (hunting != null) {
            return new ResponseEntity<>(hunting, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteHunting(@PathVariable Integer id) {
        huntingService.deleteHunting(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}