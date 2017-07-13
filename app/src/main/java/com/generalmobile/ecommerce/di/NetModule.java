package com.generalmobile.ecommerce.di;

import com.generalmobile.ecommerce.service.UserAPIService;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by btstajyer7 on 11.07.2017.
 */

@Module
public class NetModule {
    public final static String BASE_URL = "http://10.17.0.131:3000";

    @Singleton
    @Provides
    Retrofit provideRetrofit() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        return retrofit;
    }

    @Singleton
    @Provides
    UserAPIService provideAPI(Retrofit retrofit) {
        return retrofit.create(UserAPIService.class);
    }
}
