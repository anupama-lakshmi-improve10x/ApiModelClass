package com.example.apimodelclass.networks;

import com.example.apimodelclass.modelclass.Shop;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiService {
    @GET("479dd07f8c1d482e9219f7dcb48e25f4/renukaTemplates")
    Call<List<Shop>> fetchShopDetails();
}
