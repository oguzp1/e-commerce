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

    private List<String> categoryList;

    private List<AtomicInteger> categoryFreqs;

    private List<Product> productList;

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

                    for (Product p: productList)
                        p.fillProduct();

                    daoSession.getProductDao().insertOrReplaceInTx(productList);
                } else {
                    productList = daoSession.getProductDao().loadAll();
                }
                setInfo(productList);
                apiListener.onFinish(categoryList, categoryFreqs, productList);
            }

            @Override
            public void onFailure(Call<List<Product>> call, Throwable t) {
                productList = daoSession.getProductDao().loadAll();
                apiListener.onFinish(categoryList, categoryFreqs, productList);
            }
        });

    }

    private void setInfo(List<Product> productList) {
        HashMap<String, AtomicInteger> categoryMap = new HashMap<>();
        for (Product p : productList) {
            if (!categoryMap.containsKey(p.getProductCategory()))
                categoryMap.put(p.getProductCategory(), new AtomicInteger(1));
            else
                categoryMap.get(p.getProductCategory()).incrementAndGet();
        }

        this.categoryList = new ArrayList<>();
        this.categoryList.addAll(categoryMap.keySet());
        this.categoryFreqs = new ArrayList<>();
        this.categoryFreqs.addAll(categoryMap.values());
    }

    public void setApiListener(ApiListener apiListener) {
        this.apiListener = apiListener;
    }
}
