package com.generalmobile.ecommerce.screens.screen15;


import android.content.Context;
import android.widget.ArrayAdapter;

import com.generalmobile.ecommerce.R;
import com.generalmobile.ecommerce.main.MainActivity;

import javax.inject.Inject;

/**
 * Created by btstajyer7 on 13.07.2017.
 */

public class Screen15Presenter {
    private Screen15View screen15View;

    @Inject
    public Screen15Presenter(Screen15View screen15View) {
        this.screen15View = screen15View;
    }

    public void resetAdapter(Context context) {
        ArrayAdapter<CharSequence> adapter= ArrayAdapter.createFromResource(context, R.array.options_array,android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        screen15View.setAdapter(adapter);
    }
}
