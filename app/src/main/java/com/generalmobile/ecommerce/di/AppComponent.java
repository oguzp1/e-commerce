package com.generalmobile.ecommerce.di;

import android.content.Context;

import com.generalmobile.ecommerce.DaoSession;
import com.generalmobile.ecommerce.screens.screen14.ScreenInteractor;
import com.generalmobile.ecommerce.service.UserAPIService;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by btstajyer7 on 11.07.2017.
 */

@Singleton
@Component(modules = {AppModule.class, DatabaseModule.class, NetModule.class, InteractorModule.class})
public interface AppComponent {
    Context context();

    DaoSession daoSession();

    UserAPIService userApiService();

    ScreenInteractor screenInteractor();
}
