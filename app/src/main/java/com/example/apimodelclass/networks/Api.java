package com.example.apimodelclass.networks;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class Api {

    public ApiService createApiService() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://crudcrud.com/api/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        ApiService apiService = retrofit.create(ApiService.class);
        return apiService;
    }
}
