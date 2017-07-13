package com.generalmobile.ecommerce.di;

import android.content.Context;

import com.generalmobile.ecommerce.MainApplication;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by btstajyer7 on 11.07.2017.
 */

@Module
public class AppModule {
    private MainApplication mainApplication;

    public AppModule(MainApplication mainApplication) {
        this.mainApplication = mainApplication;
    }

    @Singleton
    @Provides
    Context provideAppContext() {
        return mainApplication.getApplicationContext();
    }

    @Singleton
    @Provides
    MainApplication provideApp() {
        return mainApplication;
    }
}
