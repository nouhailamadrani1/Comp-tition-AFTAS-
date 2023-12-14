package com.competition.aftas.DTO;

public class LevelDTO {
    private Integer id;
    private Integer code;
    private String description;
    private Integer points;


    public LevelDTO() {
    }

    public LevelDTO(Integer id, Integer code, String description, Integer points) {
        this.id = id;
        this.code = code;
        this.description = description;
        this.points = points;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getPoints() {
        return points;
    }

    public void setPoints(Integer points) {
        this.points = points;
    }
}
