package com.generalmobile.ecommerce.screens;


import android.util.Log;
import android.widget.Toast;

import com.generalmobile.ecommerce.models.Category;
import com.generalmobile.ecommerce.models.DaoSession;
import com.generalmobile.ecommerce.models.Product;
import com.generalmobile.ecommerce.models.Subcategory;
import com.generalmobile.ecommerce.screens.listeners.AdapterUpdater;
import com.generalmobile.ecommerce.service.UserAPIService;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by btstajyer7 on 11.07.2017.
 */

public class ScreenInteractor {
    private DaoSession daoSession;
    private UserAPIService userAPIService;

    private AdapterUpdater adapterUpdater;

    private List<Product> productList = new ArrayList<>();

    private List<Category> categoryList = new ArrayList<>();

    private List<Subcategory> subcategoryList = new ArrayList<>();

    public ScreenInteractor(DaoSession daoSession, UserAPIService userAPIService) {
        this.daoSession = daoSession;
        this.userAPIService = userAPIService;

    }

    public void getListData() {
        productList = daoSession.getProductDao().loadAll();
        categoryList = daoSession.getCategoryDao().loadAll();
        subcategoryList = daoSession.getSubcategoryDao().loadAll();

        adapterUpdater.updateAdapterForProducts(productList);
        adapterUpdater.updateAdapterForCategories(categoryList);
        adapterUpdater.updateAdapterForSubcategories(subcategoryList);

        Call<List<Product>> productListCall = userAPIService.getProducts();
        Call<List<Category>> categoryListCall = userAPIService.getCategories();
        Call<List<Subcategory>> subcategoryListCall = userAPIService.getSubcategories();

        productListCall.enqueue(new Callback<List<Product>>() {
            @Override
            public void onResponse(Call<List<Product>> call, Response<List<Product>> response) {
                List<Product> tempProcutList = response.body();

                if (tempProcutList != null) {
                    productList = tempProcutList;
                    daoSession.getProductDao().insertOrReplaceInTx(productList);
                }
            }

            @Override
            public void onFailure(Call<List<Product>> call, Throwable t) {
                Log.e("TAG", "Product Network Error.");
            }
        });

        categoryListCall.enqueue(new Callback<List<Category>>() {
            @Override
            public void onResponse(Call<List<Category>> call, Response<List<Category>> response) {
                if (response.isSuccessful()) {
                    List<Category> tempCategoryList = response.body();

                    if (tempCategoryList != null && !tempCategoryList.equals(categoryList)) {
                        categoryList = tempCategoryList;
                        daoSession.getCategoryDao().insertOrReplaceInTx(categoryList);

                        adapterUpdater.updateAdapterForCategories(categoryList);
                    }
                }
            }

            @Override
            public void onFailure(Call<List<Category>> call, Throwable t) {
                Log.e("TAG", "Category Network Error.");
            }
        });

        subcategoryListCall.enqueue(new Callback<List<Subcategory>>() {
            @Override
            public void onResponse(Call<List<Subcategory>> call, Response<List<Subcategory>> response) {
                List<Subcategory> tempSubcategoryList = response.body();

                if (tempSubcategoryList != null) {
                    subcategoryList = tempSubcategoryList;
                    daoSession.getSubcategoryDao().insertOrReplaceInTx(subcategoryList);
                }
            }

            @Override
            public void onFailure(Call<List<Subcategory>> call, Throwable t) {
                Log.e("TAG", "Subcategory Network Error.");
            }
        });
    }

    public void setAdapterUpdater(AdapterUpdater adapterUpdater) {
        this.adapterUpdater = adapterUpdater;
    }

    public List<Product> getProductList() {
        return productList;
    }

    public List<Category> getCategoryList() {
        return categoryList;
    }

    public List<Subcategory> getSubcategoryList() {
        return subcategoryList;
    }
}
