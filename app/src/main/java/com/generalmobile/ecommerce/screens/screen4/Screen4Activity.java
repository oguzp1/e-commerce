package com.generalmobile.ecommerce.screens.screen4;

import android.os.Bundle;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;

import com.generalmobile.ecommerce.BaseActivity;
import com.generalmobile.ecommerce.R;
import com.generalmobile.ecommerce.screens.screen4.Screen4Presenter;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;



public class Screen4Activity extends BaseActivity  {


    @Inject
    Screen4Presenter screen4Presenter;
    @BindView(R.id.toolbar9)
    Toolbar toolbar9;
    @BindView(R.id.recycler_view4)
    RecyclerView recyclerView4;
    @BindView(R.id.drawer4)
    DrawerLayout drawer4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.screen4_main);
        ButterKnife.bind(this);
        createMenu(toolbar9, drawer4);


    }


}
