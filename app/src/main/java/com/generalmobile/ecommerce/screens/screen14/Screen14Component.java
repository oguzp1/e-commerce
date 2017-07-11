package com.generalmobile.ecommerce.screens.screen14;

import com.generalmobile.ecommerce.di.ActivityScope;
import com.generalmobile.ecommerce.di.AppComponent;

import dagger.Component;

/**
 * Created by btstajyer7 on 11.07.2017.
 */


@ActivityScope
@Component(modules = {Screen14Module.class}, dependencies = {AppComponent.class})
public interface Screen14Component {
    void inject(Screen14Activity screen14Activity);
}
