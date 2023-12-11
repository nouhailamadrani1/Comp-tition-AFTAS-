package com.competition.aftas.domain;
import jakarta.persistence.*;

@Entity
public class Ranking {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private Integer rank;
    private Integer score;
    @ManyToOne
    @JoinColumn(name = "competition_code")
    private Competition competition;
    @ManyToOne
    @JoinColumn(name = "member_id")
    private Member member;

}