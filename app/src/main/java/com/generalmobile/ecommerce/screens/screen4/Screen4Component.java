package com.generalmobile.ecommerce.screens.screen4;

import com.generalmobile.ecommerce.di.ActivityScope;
import com.generalmobile.ecommerce.di.AppComponent;


import dagger.Component;

/**
 * Created by zeynepsaracbasi on 13/07/2017.
 */

@ActivityScope
@Component(modules = {Screen4Module.class}, dependencies = {AppComponent.class})
public interface Screen4Component {
    void inject(Screen4Activity screen4Activity);
}