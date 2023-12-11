package com.competition.aftas.domain;
import jakarta.persistence.*;


import java.util.Date;
import java.util.Set;

@Entity
public class Hunting {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private Integer numberOfFish;
    @ManyToOne
    @JoinColumn(name = "competition_code")
    private Competition competition;
    @ManyToOne
    @JoinColumn(name = "member_num")
    private Member member;
    @ManyToOne
    @JoinColumn(name = "fish_id")
    private Fish fish;
}