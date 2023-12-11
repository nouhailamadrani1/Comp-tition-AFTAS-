package com.competition.aftas.domain;
import jakarta.persistence.*;

@Entity
public class Level {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer code;
    private String description;
    private Integer points;
    @ManyToOne
    @JoinColumn(name = "fish_id")
    private Fish fish;

}