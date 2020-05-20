package com.horseapi.apiclient.model;

import java.util.Objects;

public class Runner {
    private String name;
    private String number;
    private String saddleColor;
    private String odds;
    private String morningLine;
    private Double weight;
    private String trainer;
    private String jockey;
    private String gender;
    private Integer age;
    private Boolean scratched;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getSaddleColor() {
        return saddleColor;
    }

    public void setSaddleColor(String saddleColor) {
        this.saddleColor = saddleColor;
    }

    public String getOdds() {
        return odds;
    }

    public void setOdds(String odds) {
        this.odds = odds;
    }

    public Double getWeight() {
        return weight;
    }

    public String getMorningLine() {
        return morningLine;
    }

    public void setMorningLine(String morningLine) {
        this.morningLine = morningLine;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public String getTrainer() {
        return trainer;
    }

    public void setTrainer(String trainer) {
        this.trainer = trainer;
    }

    public String getJockey() {
        return jockey;
    }

    public void setJockey(String jockey) {
        this.jockey = jockey;
    }

    public Boolean getScratched() {
        return scratched;
    }

    public void setScratched(Boolean scratched) {
        this.scratched = scratched;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Runner runner = (Runner) o;
        return Objects.equals(name, runner.name) &&
                Objects.equals(number, runner.number) &&
                Objects.equals(odds, runner.odds) &&
                Objects.equals(morningLine, runner.morningLine) &&
                Objects.equals(weight, runner.weight) &&
                Objects.equals(trainer, runner.trainer) &&
                Objects.equals(jockey, runner.jockey) &&
                Objects.equals(gender, runner.gender) &&
                Objects.equals(age, runner.age) &&
                Objects.equals(scratched, runner.scratched);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, number, odds, morningLine, weight, trainer, jockey, gender, age, scratched);
    }
}
