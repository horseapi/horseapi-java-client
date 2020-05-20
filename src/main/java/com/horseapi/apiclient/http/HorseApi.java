package com.horseapi.apiclient.http;

import com.horseapi.apiclient.model.Race;
import com.horseapi.apiclient.model.RaceTrack;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

import java.util.List;

public interface HorseApi {
    @GET("/tracks")
    Call<List<RaceTrack>> getTracks();

    @GET("/races/{track}")
    Call<List<Race>> getTrackRaces(@Path("track") String track);

    @GET("/races/{track}/{race}")
    Call<Race> getTrackRace(@Path("track") String track, @Path("race") int race);
}
