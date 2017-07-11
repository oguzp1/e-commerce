package com.generalmobile.ecommerce.screens.screen14;

import com.generalmobile.ecommerce.di.ActivityScope;

import dagger.Module;
import dagger.Provides;

/**
 * Created by btstajyer7 on 11.07.2017.
 */

@Module
public class Screen14Module {
    private Screen14View screen14View;

    public Screen14Module(Screen14View screen14View) {
        this.screen14View = screen14View;
    }

    @ActivityScope
    @Provides
    Screen14View provide14View() {
        return screen14View;
    }
}
