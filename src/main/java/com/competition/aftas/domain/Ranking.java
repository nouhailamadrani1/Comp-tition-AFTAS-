package com.competition.aftas.domain;
import jakarta.persistence.*;
import lombok.*;


@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
public class Ranking {
    @EmbeddedId
    private MemberCompetitionId id;

    private Integer rank;
    private int score;
}
