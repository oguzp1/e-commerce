package com.generalmobile.ecommerce.screens.screen14;

import com.generalmobile.ecommerce.DaoSession;
import com.generalmobile.ecommerce.Product;
import com.generalmobile.ecommerce.screens.screen14.Screen14View;
import com.generalmobile.ecommerce.service.UserAPIService;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

import javax.inject.Inject;
import javax.inject.Singleton;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by btstajyer7 on 11.07.2017.
 */

public class ScreenInteractor {
    private DaoSession daoSession;
    private UserAPIService userAPIService;

    private ApiListener apiListener;

    private List<String> categoryList = new ArrayList<>();

    private List<AtomicInteger> categoryFreqs = new ArrayList<>();

    private List<Product> productList = new ArrayList<>();

    public ScreenInteractor(DaoSession daoSession, UserAPIService userAPIService) {
        this.daoSession = daoSession;
        this.userAPIService = userAPIService;
    }


    public void getListData() {
        Call<List<Product>> listCall = userAPIService.getProducts();
        listCall.enqueue(new Callback<List<Product>>() {
            @Override
            public void onResponse(Call<List<Product>> call, Response<List<Product>> response) {
                if (response.isSuccessful()) {
                    productList = response.body();

                    daoSession.getProductDao().insertOrReplaceInTx(productList);
                } else {
                    productList = daoSession.getProductDao().loadAll();
                }
                apiListener.onFinish(productList);
            }

            @Override
            public void onFailure(Call<List<Product>> call, Throwable t) {
                productList = daoSession.getProductDao().loadAll();
                apiListener.onFinish(productList);
            }
        });

    }


    public void setApiListener(ApiListener apiListener) {
        this.apiListener = apiListener;
    }
}
