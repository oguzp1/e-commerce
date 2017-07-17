package com.generalmobile.ecommerce.repo;

import com.generalmobile.ecommerce.models.DaoSession;
import com.generalmobile.ecommerce.screens.ScreenInteractor;

/**
 * Created by btstajyer7 on 14.07.2017.
 */

public class Repository {
    private ScreenInteractor screenInteractor;
    private DaoSession daoSession;

    public Repository(ScreenInteractor screenInteractor, DaoSession daoSession) {
        this.screenInteractor = screenInteractor;
        this.daoSession = daoSession;

    }

}
