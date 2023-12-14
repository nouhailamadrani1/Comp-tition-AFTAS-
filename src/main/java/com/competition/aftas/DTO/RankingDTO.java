package com.competition.aftas.DTO;

public class RankingDTO {
    private Long memberId;
    private Long competitionId;
    private Integer rank;
    private int score;

    // Constructors, getters, and setters

    public RankingDTO() {
        // Default constructor
    }

    public RankingDTO(Long memberId, Long competitionId, Integer rank, int score) {
        this.memberId = memberId;
        this.competitionId = competitionId;
        this.rank = rank;
        this.score = score;
    }

    public Long getMemberId() {
        return memberId;
    }

    public void setMemberId(Long memberId) {
        this.memberId = memberId;
    }

    public Long getCompetitionId() {
        return competitionId;
    }

    public void setCompetitionId(Long competitionId) {
        this.competitionId = competitionId;
    }

    public Integer getRank() {
        return rank;
    }

    public void setRank(Integer rank) {
        this.rank = rank;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
