package com.competition.aftas.DTO;



public class HuntingDTO {
    private Integer id;
    private Integer numberOfFish;
    private Integer competitionId;
    private Integer memberNum;
    private Integer fishId;




    public HuntingDTO() {
    }


    public HuntingDTO(Integer id, Integer numberOfFish, Integer competitionId, Integer memberNum, Integer fishId) {
        this.id = id;
        this.numberOfFish = numberOfFish;
        this.competitionId = competitionId;
        this.memberNum = memberNum;
        this.fishId = fishId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getNumberOfFish() {
        return numberOfFish;
    }

    public void setNumberOfFish(Integer numberOfFish) {
        this.numberOfFish = numberOfFish;
    }

    public Integer getCompetitionId() {
        return competitionId;
    }

    public void setCompetitionId(Integer competitionId) {
        this.competitionId = competitionId;
    }

    public Integer getMemberNum() {
        return memberNum;
    }

    public void setMemberNum(Integer memberNum) {
        this.memberNum = memberNum;
    }

    public Integer getFishId() {
        return fishId;
    }

    public void setFishId(Integer fishId) {
        this.fishId = fishId;
    }
}
