package com.generalmobile.ecommerce.screens.screen4;

import com.generalmobile.ecommerce.di.ActivityScope;

import dagger.Module;
import dagger.Provides;


@Module
public class Screen4Module {

    private Screen4View screen4View;
    public Screen4Module(Screen4View screen4View) {
        this.screen4View = screen4View;
    }

    @ActivityScope
    @Provides
    Screen4View provide4View() {
        return screen4View;
    }
}
