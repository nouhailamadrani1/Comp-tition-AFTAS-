package com.competition.aftas.domain;
import jakarta.persistence.*;

@Entity
public class Fish {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private double averageWeight;
    @ManyToOne
    @JoinColumn(name = "level_code")
    private Level level;



}