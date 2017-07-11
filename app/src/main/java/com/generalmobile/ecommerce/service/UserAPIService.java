package com.generalmobile.ecommerce.service;

import com.generalmobile.ecommerce.Product;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by btstajyer7 on 11.07.2017.
 */

public interface UserAPIService {
    @GET("/feeds/flowers.json")
    Call<List<Product>> getProducts();
}
