package com.generalmobile.ecommerce.screens.screen14;

import com.generalmobile.ecommerce.models.Category;
import com.generalmobile.ecommerce.screens.ApiListener;
import com.generalmobile.ecommerce.screens.ScreenInteractor;

import java.util.List;

import javax.inject.Inject;

/**
 * Created by btstajyer7 on 11.07.2017.
 */

public class Screen14Presenter implements ApiListener {
    private Screen14View screen14View;
    private ScreenInteractor screenInteractor;

    @Inject
    public Screen14Presenter(ScreenInteractor screenInteractor, Screen14View screen14View) {
        this.screen14View = screen14View;
        this.screenInteractor = screenInteractor;

        screenInteractor.setApiListener(this);
    }

    public void getFeed() {
        screenInteractor.getListData();
    }


    @Override
    public void onFinish(List<Category> categories) {
        screen14View.resetAdapter(categories);
    }
}
