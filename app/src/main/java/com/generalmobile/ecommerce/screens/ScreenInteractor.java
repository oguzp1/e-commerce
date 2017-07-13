package com.generalmobile.ecommerce.screens;

import com.generalmobile.ecommerce.DaoSession;
import com.generalmobile.ecommerce.models.Category;
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

    private ApiListener apiListener;


    private List<Category> categoryList = new ArrayList<>();

    public ScreenInteractor(DaoSession daoSession, UserAPIService userAPIService) {
        this.daoSession = daoSession;
        this.userAPIService = userAPIService;
    }


    public void getListData() {
        Call<List<Category>> listCall = userAPIService.getCategories();
        listCall.enqueue(new Callback<List<Category>>() {
            @Override
            public void onResponse(Call<List<Category>> call, Response<List<Category>> response) {
                if (response.isSuccessful()) {
                    categoryList = response.body();

                    daoSession.getCategoryDao().insertOrReplaceInTx(categoryList);
                } else {
                    categoryList = daoSession.getCategoryDao().loadAll();
                }
                apiListener.onFinish(categoryList);
            }

            @Override
            public void onFailure(Call<List<Category>> call, Throwable t) {
                categoryList = daoSession.getCategoryDao().loadAll();
                apiListener.onFinish(categoryList);
            }
        });



    }


    public void setApiListener(ApiListener apiListener) {
        this.apiListener = apiListener;
    }
}
