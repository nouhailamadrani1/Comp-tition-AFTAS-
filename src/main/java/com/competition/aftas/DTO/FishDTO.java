package com.competition.aftas.DTO;

public class FishDTO {
    private Integer id;
    private String name;
    private double averageWeight;
    private LevelDTO level;


    public FishDTO() {
    }


    public FishDTO(Integer id, String name, double averageWeight, LevelDTO level) {
        this.id = id;
        this.name = name;
        this.averageWeight = averageWeight;
        this.level = level;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAverageWeight() {
        return averageWeight;
    }

    public void setAverageWeight(double averageWeight) {
        this.averageWeight = averageWeight;
    }

    public LevelDTO getLevel() {
        return level;
    }

    public void setLevel(LevelDTO level) {
        this.level = level;
    }
}
