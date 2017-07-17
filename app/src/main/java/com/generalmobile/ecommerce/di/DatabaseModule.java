package com.generalmobile.ecommerce.di;

import android.content.Context;


import com.generalmobile.ecommerce.models.DaoMaster;
import com.generalmobile.ecommerce.models.DaoSession;

import org.greenrobot.greendao.database.Database;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by btstajyer7 on 11.07.2017.
 */

@Module
public class DatabaseModule {
    public static final String DATABASE_NAME = "products-db";

    @Singleton
    @Provides
    DaoSession provideDaoSession(Context context) {
        DaoMaster.DevOpenHelper helper = new DaoMaster.DevOpenHelper(context, DATABASE_NAME);
        Database db = helper.getWritableDb();
        return new DaoMaster(db).newSession();
    }
}
