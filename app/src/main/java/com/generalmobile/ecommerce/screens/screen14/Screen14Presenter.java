package com.generalmobile.ecommerce.screens.screen14;

import com.generalmobile.ecommerce.models.Category;
import com.generalmobile.ecommerce.models.DaoSession;
import com.generalmobile.ecommerce.repo.DBObserver;
import com.generalmobile.ecommerce.screens.listeners.ApiListener;
import com.generalmobile.ecommerce.screens.ScreenInteractor;
import com.generalmobile.ecommerce.screens.listeners.DaoLoader;

import java.util.List;

import javax.inject.Inject;

/**
 * Created by btstajyer7 on 11.07.2017.
 */

public class Screen14Presenter implements DaoLoader {
    private Screen14View screen14View;
    private ScreenInteractor screenInteractor;

    @Inject
    public Screen14Presenter(final ScreenInteractor screenInteractor, Screen14View screen14View) {
        this.screen14View = screen14View;
        this.screenInteractor = screenInteractor;
        DBObserver observer = new DBObserver(new DBObserver.ChangeObserver() {
            @Override
            public void dataChanged() {
                screenInteractor.getDaoCategories();
            }
        });


        screenInteractor.setDaoLoader(this);
    }

    public void fetchData() {
        screenInteractor.getListData();
    }


    @Override
    public void loadDao() {
        screen14View.adapterHandler(screenInteractor.getDaoCategories());
    }
}
