package com.opus_bd.salestracking.RetrofitService;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitClientInstance {
    private static final String BASE_URL = "http://5fa3b77a.ngrok.io/SalesTrack/public/";
    private static Retrofit retrofit;
    private static Gson gson = new GsonBuilder()
            .setLenient()
            .create();


    public static Retrofit getRetrofitInstance() {
        if (retrofit == null) {
            retrofit = new Retrofit.Builder().baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create(gson))
                    .build();
        }
        return retrofit;
    }
}
