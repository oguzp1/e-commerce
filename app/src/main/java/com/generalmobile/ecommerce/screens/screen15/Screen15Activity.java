package com.generalmobile.ecommerce.screens.screen15;

import android.os.Bundle;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.widget.Toolbar;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import com.generalmobile.ecommerce.BaseActivity;
import com.generalmobile.ecommerce.MainApplication;
import com.generalmobile.ecommerce.R;
import com.generalmobile.ecommerce.screens.screen14.DaggerScreen14Component;
import com.generalmobile.ecommerce.screens.screen14.Screen14Presenter;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;

public class Screen15Activity extends BaseActivity implements Screen15View {

    @BindView(R.id.toolbar)
    Toolbar toolbar;
    @BindView(R.id.textView15_1)
    TextView textView151;
    @BindView(R.id.editText15_1)
    EditText editText151;
    @BindView(R.id.textView15_2)
    TextView textView152;
    @BindView(R.id.editText15_2)
    EditText editText152;
    @BindView(R.id.textView15_3)
    TextView textView153;
    @BindView(R.id.spinnerState1)
    Spinner spinnerState1;
    @BindView(R.id.drawer_layout)
    DrawerLayout drawerLayout;

    @Inject
    Screen15Presenter screen15Presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen15);
        ButterKnife.bind(this);
        createMenu(toolbar,drawerLayout);
        DaggerScreen15Component.builder()
                .appComponent(((MainApplication) getApplication()).getAppComponent())
                .screen15Module(new Screen15Module(this))
                .build()
                .inject(this);
        screen15Presenter.resetAdapter(this);
    }

    @Override
    public void setAdapter(ArrayAdapter<CharSequence> arrayAdapter) {
        spinnerState1.setAdapter(arrayAdapter);

    }
}
