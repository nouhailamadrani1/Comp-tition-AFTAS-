package com.competition.aftas.domain;
import jakarta.persistence.*;
import lombok.*;
import java.util.Date;
import java.util.Set;
import java.time.LocalTime;
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class Competition {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private double code;

    private Date date;
    private LocalTime startTime;
    private LocalTime endTime;
    private Integer numberOfParticipants;
    private String location;
    private Double amount;

    @OneToMany(mappedBy = "competition")
    private Set<Hunting> huntings;

    public double getCode() {
        return code;
    }

    public void setCode(double code) {
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

    public Set<Hunting> getHuntings() {
        return huntings;
    }

    public void setHuntings(Set<Hunting> huntings) {
        this.huntings = huntings;
    }
}
