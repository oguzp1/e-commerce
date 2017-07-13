package com.generalmobile.ecommerce.screens.screen15;

import com.generalmobile.ecommerce.di.ActivityScope;
import com.generalmobile.ecommerce.di.AppComponent;
import com.generalmobile.ecommerce.screens.screen14.Screen14Activity;
import com.generalmobile.ecommerce.screens.screen14.Screen14Module;

import dagger.Component;

/**
 * Created by btstajyer7 on 13.07.2017.
 */
@ActivityScope
@Component(modules = {Screen15Module.class}, dependencies = {AppComponent.class})
public interface Screen15Component {
    void inject(Screen15Activity screen15Activity);
}
