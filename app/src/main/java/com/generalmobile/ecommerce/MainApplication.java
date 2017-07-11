package com.generalmobile.ecommerce;

import android.app.Application;

import com.generalmobile.ecommerce.di.AppComponent;
import com.generalmobile.ecommerce.di.AppModule;
import com.generalmobile.ecommerce.di.DaggerAppComponent;
import com.generalmobile.ecommerce.di.DatabaseModule;
import com.generalmobile.ecommerce.di.InteractorModule;
import com.generalmobile.ecommerce.di.NetModule;

/**
 * Created by btstajyer7 on 11.07.2017.
 */

public class MainApplication extends Application {
    private AppComponent appComponent;

    @Override
    public void onCreate() {
        super.onCreate();

        appComponent = DaggerAppComponent.builder()
                .appModule(new AppModule(this))
                .databaseModule(new DatabaseModule())
                .netModule(new NetModule())
                .interactorModule(new InteractorModule())
                .build();
    }

    public AppComponent getAppComponent() {
        return appComponent;
    }
}
