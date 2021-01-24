package com.w94.beerapp.retrofit;

import com.w94.beerapp.model.BeerData;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiInterface {

    @GET("beerapp.json")
    Call<List<BeerData>> getAllData();




}
