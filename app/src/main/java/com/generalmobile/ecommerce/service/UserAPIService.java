package com.generalmobile.ecommerce.service;

import com.generalmobile.ecommerce.models.Category;
import com.generalmobile.ecommerce.models.Product;
import com.generalmobile.ecommerce.models.Subcategory;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by btstajyer7 on 11.07.2017.
 */

public interface UserAPIService {
    @GET("/Product")
    Call<List<Product>> getProducts();

    @GET("/Category")
    Call<List<Category>> getCategories();

    @GET("/SubCategory")
    Call<List<Subcategory>> getSubcategories();
}
