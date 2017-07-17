package com.generalmobile.ecommerce.screens.screen14;

import android.util.Log;

import com.generalmobile.ecommerce.models.Category;
import com.generalmobile.ecommerce.models.DaoSession;
import com.generalmobile.ecommerce.models.Product;
import com.generalmobile.ecommerce.models.Subcategory;
import com.generalmobile.ecommerce.repo.DBObserver;
import com.generalmobile.ecommerce.screens.listeners.AdapterUpdater;
import com.generalmobile.ecommerce.screens.ScreenInteractor;

import java.util.List;

import javax.inject.Inject;

/**
 * Created by btstajyer7 on 11.07.2017.
 */

public class Screen14Presenter implements AdapterUpdater {
    private Screen14View screen14View;
    private ScreenInteractor screenInteractor;

    @Inject
    public Screen14Presenter(final ScreenInteractor screenInteractor, final Screen14View screen14View) {
        this.screen14View = screen14View;
        this.screenInteractor = screenInteractor;
        DBObserver observer = new DBObserver(new DBObserver.ChangeObserver() {
            @Override
            public void dataChanged() {
                screen14View.adapterHandler(screenInteractor.getCategoryList());
            }
        });

        //screen14View.setObserverForDatabase(observer);

        screenInteractor.setAdapterUpdater(this);



    }

    public void fetchData() {
        screenInteractor.getListData();
    }


    @Override
    public void updateAdapterForCategories(List<Category> categories) {
        screen14View.adapterHandler(categories);
    }

    @Override
    public void updateAdapterForProducts(List<Product> products) {
    }

    @Override
    public void updateAdapterForSubcategories(List<Subcategory> subcategories) {
    }
}
