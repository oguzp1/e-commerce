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
    @Singleton
    @Provides
    DaoSession provideDaoSession(Context context) {
        DaoMaster.DevOpenHelper helper = new DaoMaster.DevOpenHelper(context, "products-db");
        Database db = helper.getWritableDb();
        return new DaoMaster(db).newSession();
    }
}
