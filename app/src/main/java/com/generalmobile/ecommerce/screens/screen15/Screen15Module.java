package com.generalmobile.ecommerce.screens.screen15;

import com.generalmobile.ecommerce.di.ActivityScope;
import com.generalmobile.ecommerce.screens.screen14.Screen14View;

import dagger.Module;
import dagger.Provides;

/**
 * Created by btstajyer7 on 13.07.2017.
 */
@Module
public class Screen15Module {
    private Screen15View screen15View;

    public Screen15Module(Screen15View screen15View) {
        this.screen15View = screen15View;
    }

    @ActivityScope
    @Provides
    Screen15View provide15View() {
        return screen15View;
    }
}
