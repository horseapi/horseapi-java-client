package com.horseapi.apiclient.model;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class RaceTrack {
    public String id;
    public String name;
    public Boolean racingToday;
}
