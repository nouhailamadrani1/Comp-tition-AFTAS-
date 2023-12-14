package com.competition.aftas.DTO;

import java.util.Date;
import java.time.LocalTime;

public class CompetitionDTO {
    private String code;
    private Date date;
    private LocalTime startTime;
    private LocalTime endTime;
    private Integer numberOfParticipants;
    private String location;
    private Double amount;

    // Constructors, getters, and setters

    public CompetitionDTO() {
        // Default constructor
    }

    public CompetitionDTO(String code, Date date, LocalTime startTime, LocalTime endTime,
                          Integer numberOfParticipants, String location, Double amount) {
        this.code = code;
        this.date = date;
        this.startTime = startTime;
        this.endTime = endTime;
        this.numberOfParticipants = numberOfParticipants;
        this.location = location;
        this.amount = amount;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public LocalTime getStartTime() {
        return startTime;
    }

    public void setStartTime(LocalTime startTime) {
        this.startTime = startTime;
    }

    public LocalTime getEndTime() {
        return endTime;
    }

    public void setEndTime(LocalTime endTime) {
        this.endTime = endTime;
    }

    public Integer getNumberOfParticipants() {
        return numberOfParticipants;
    }

    public void setNumberOfParticipants(Integer numberOfParticipants) {
        this.numberOfParticipants = numberOfParticipants;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }
}