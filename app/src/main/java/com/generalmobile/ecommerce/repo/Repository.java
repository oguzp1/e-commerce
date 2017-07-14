package com.generalmobile.ecommerce.repo;

import com.generalmobile.ecommerce.models.Category;
import com.generalmobile.ecommerce.models.CategoryDao;
import com.generalmobile.ecommerce.models.DaoSession;
import com.generalmobile.ecommerce.screens.ScreenInteractor;
import com.generalmobile.ecommerce.screens.listeners.ApiListener;
import com.generalmobile.ecommerce.service.UserAPIService;

import java.util.List;

import javax.inject.Inject;

/**
 * Created by btstajyer7 on 14.07.2017.
 */

public class Repository implements ApiListener {
    private ScreenInteractor screenInteractor;
    private DaoSession daoSession;

    public Repository(ScreenInteractor screenInteractor, DaoSession daoSession) {
        this.screenInteractor = screenInteractor;
        this.daoSession = daoSession;

        screenInteractor.setApiListener(this);
    }


    @Override
    public boolean onFinish(List<Category> categories) {
        daoSession.getCategoryDao().insertOrReplaceInTx(categories);
        return true;
    }
}
