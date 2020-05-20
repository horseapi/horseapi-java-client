package com.horseapi.apiclient.model;

import java.util.Date;
import java.util.List;
import java.util.Objects;

public class Race {
    private Integer raceNumber;
    private List<Runner> runners;
    private List<RaceResult> results;
    private Date estimatedStartTime;
    private Race.Status status;
    private String distance;
    private Race.Breed breed;
    private String raceClass;
    private String surface;
    private String purse;
    private List<String> betTypes;

    public Integer getRaceNumber() {
        return raceNumber;
    }

    public void setRaceNumber(Integer raceNumber) {
        this.raceNumber = raceNumber;
    }

    public List<Runner> getRunners() {
        return runners;
    }

    public void setRunners(List<Runner> runners) {
        this.runners = runners;
    }

    public List<RaceResult> getResults() {
        return results;
    }

    public void setResults(List<RaceResult> results) {
        this.results = results;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Date getEstimatedStartTime() {
        return estimatedStartTime;
    }

    public void setEstimatedStartTime(Date estimatedStartTime) {
        this.estimatedStartTime = estimatedStartTime;
    }

    public String getDistance() {
        return distance;
    }

    public void setDistance(String distance) {
        this.distance = distance;
    }

    public Breed getBreed() {
        return breed;
    }

    public void setBreed(Breed breed) {
        this.breed = breed;
    }

    public String getRaceClass() {
        return raceClass;
    }

    public void setRaceClass(String raceClass) {
        this.raceClass = raceClass;
    }

    public String getSurface() {
        return surface;
    }

    public void setSurface(String surface) {
        this.surface = surface;
    }

    public String getPurse() {
        return purse;
    }

    public void setPurse(String purse) {
        this.purse = purse;
    }

    public List<String> getBetTypes() {
        return betTypes;
    }

    public void setBetTypes(List<String> betTypes) {
        this.betTypes = betTypes;
    }

    public enum Status {
        OPEN, RACE_OFF, FINAL, CANCELED
    }

    public enum Breed {
        THOROUGHBRED, THOROUGHBRED_LARC, HARNESS, QUARTERHORSE
    }

    @Override
    public String toString() {
        return "Race{" +
                "raceNumber='" + raceNumber + '\'' +
                ", runners=" + runners +
                ", estimatedStartTime=" + estimatedStartTime +
                ", status=" + status +
                ", distance='" + distance + '\'' +
                ", breed=" + breed +
                ", raceClass='" + raceClass + '\'' +
                ", surface='" + surface + '\'' +
                ", purse='" + purse + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Race race = (Race) o;
        return Objects.equals(raceNumber, race.raceNumber) &&
                Objects.equals(runners, race.runners) &&
                Objects.equals(results, race.results) &&
                Objects.equals(estimatedStartTime, race.estimatedStartTime) &&
                status == race.status &&
                Objects.equals(distance, race.distance) &&
                breed == race.breed &&
                Objects.equals(raceClass, race.raceClass) &&
                Objects.equals(surface, race.surface) &&
                Objects.equals(purse, race.purse) &&
                Objects.equals(betTypes, race.betTypes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(raceNumber, runners, results, estimatedStartTime, status, distance, breed, raceClass, surface, purse, betTypes);
    }
}
