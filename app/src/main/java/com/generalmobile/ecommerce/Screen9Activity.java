package com.generalmobile.ecommerce;

import android.os.Bundle;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.Menu;

import butterknife.BindView;
import butterknife.ButterKnife;

public class Screen9Activity extends BaseActivity {

    @BindView(R.id.rw)
    RecyclerView rw;
    @BindView(R.id.toolbar9)
    Toolbar toolbar9;
    @BindView(R.id.drawer9)
    DrawerLayout drawer9;
    private LayoutInflater layoutInflater;
    RecyclerView recyclerView;
    private CustomAdapter9 adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.screen9_main);
        ButterKnife.bind(this);
        createMenu(toolbar9, drawer9);
        recyclerView = (RecyclerView) findViewById(R.id.rw);
    }

    @Override
    protected void onResume() {
        super.onResume();
        getlist();
    }

    private void getlist() {

        adapter = new CustomAdapter9();
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));


    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.toolbar9_options, menu);
        return true;
    }


}

