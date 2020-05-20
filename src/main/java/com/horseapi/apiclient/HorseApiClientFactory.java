package com.horseapi.apiclient;

import com.horseapi.apiclient.http.HorseApi;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.jackson.JacksonConverterFactory;

public class HorseApiClientFactory {
    public static HorseApi getHorseApiClient(final String apiKey) {
        return new Retrofit.Builder()
                .addConverterFactory(JacksonConverterFactory.create())
                .baseUrl("https://api.horseapi.com")
                .client(new OkHttpClient.Builder()
                        .addInterceptor(chain -> chain.proceed(chain.request().newBuilder().header("Authorization", apiKey).build()))
                        .build())
                .build().create(HorseApi.class);
    }
}
