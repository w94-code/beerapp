  package com.w94.beerapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

import com.w94.beerapp.model.BeerData;
import com.w94.beerapp.retrofit.ApiInterface;
import com.w94.beerapp.retrofit.RetrofitClient;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

  public class MainActivity extends AppCompatActivity {

    ApiInterface apiInterface;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        apiInterface = RetrofitClient.getRetrofitInstance().create(ApiInterface.class);

        Call<List<BeerData>> call = apiInterface.getAllData();
        call.enqueue(new Callback<List<BeerData>>() {
            @Override
            public void onResponse(Call<List<BeerData>> call, Response<List<BeerData>> response) {

                List<BeerData> beerDataList = response.body();


            }

            @Override
            public void onFailure(Call<List<BeerData>> call, Throwable t) {
                Toast.makeText(MainActivity.this, "Сервер не отвечает...", Toast.LENGTH_SHORT).show();
            }
        });



    }




}