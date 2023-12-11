package com.competition.aftas.domain;
import jakarta.persistence.*;
import java.util.Date;
import java.util.Set;
import java.time.LocalTime;

@Entity
public class Competition {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String code;
    private Date date;
    private LocalTime startTime;
    private LocalTime endTime;
    private Integer numberOfParticipants;
    private String location;
    private Double amount;
    @OneToMany(mappedBy = "competition")
    private Set<Hunting> huntings;

}