package com.competition.aftas.DTO;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.http.ResponseEntity;

import java.util.Optional;

@NoArgsConstructor
@AllArgsConstructor
@Builder
public class HuntingDTO {
    private Integer id;
    private Integer numberOfFish;
    private Integer competitionId; // Change to Integer
    private Integer memberNum; // Change to Integer
    private Integer fishId;

    private MemberDTO member;
    private CompetitionDTO competition;
    private FishDTO fish;

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

    public MemberDTO getMember() {
        return member;
    }

    public void setMember(MemberDTO member) {
        this.member = member;
    }

    public CompetitionDTO getCompetition() {
        return competition;
    }

    public void setCompetition(CompetitionDTO competition) {
        this.competition = competition;
    }

    public FishDTO getFish() {
        return fish;
    }

    public void setFish(FishDTO fish) {
        this.fish = fish;
    }


}
