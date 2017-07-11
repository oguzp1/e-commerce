package com.generalmobile.ecommerce.main;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.widget.Toolbar;

import com.generalmobile.ecommerce.BaseActivity;
import com.generalmobile.ecommerce.R;
import com.generalmobile.ecommerce.screens.screen14.Screen14Activity;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends BaseActivity {
    @BindView(R.id.toolbar)
    Toolbar toolbar;
    @BindView(R.id.drawer_layout)
    DrawerLayout drawerLayout;
    @BindView(R.id.navigation)
    NavigationView navigationView;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        createMenu(toolbar, drawerLayout);
        Intent i = new Intent(this, Screen14Activity.class);
        startActivity(i);
    }
}
