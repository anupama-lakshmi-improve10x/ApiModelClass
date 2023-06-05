package com.example.apimodelclass;

import org.junit.Test;

import static org.junit.Assert.*;

import com.example.apimodelclass.modelclass.Shop;
import com.example.apimodelclass.networks.Api;
import com.example.apimodelclass.networks.ApiService;
import com.google.gson.Gson;

import java.io.IOException;
import java.util.List;

import retrofit2.Call;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() {
        assertEquals(4, 2 + 2);
    }

    @Test

    public void getShop() throws IOException {
        Api api = new Api();
        ApiService apiService = api.createApiService();
        Call<List<Shop>> call = apiService.fetchShopDetails();
        List<Shop> shops = call.execute().body();
        assertNotNull(shops);
        assertFalse(shops.isEmpty());
        System.out.println(new Gson().toJson(shops));
    }
}