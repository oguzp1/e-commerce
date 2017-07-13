package com.generalmobile.ecommerce.di;

import com.generalmobile.ecommerce.DaoSession;
import com.generalmobile.ecommerce.screens.ScreenInteractor;
import com.generalmobile.ecommerce.service.UserAPIService;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by btstajyer7 on 11.07.2017.
 */

@Module
public class InteractorModule {
    @Singleton
    @Provides
    ScreenInteractor provideInteractor(DaoSession daoSession, UserAPIService userAPIService) {
        return new ScreenInteractor(daoSession, userAPIService);
    }
}
