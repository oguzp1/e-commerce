package com.generalmobile.ecommerce.screens.screen13;

import android.os.Bundle;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;

import com.generalmobile.ecommerce.BaseActivity;
import com.generalmobile.ecommerce.R;
import com.generalmobile.ecommerce.adapters.CustomAdapter13;

import butterknife.BindView;
import butterknife.ButterKnife;

public class Screen13Activity extends BaseActivity {

    @BindView(R.id.toolbar)
    Toolbar toolbar;
    @BindView(R.id.layout13)
    DrawerLayout layout13;
    @BindView(R.id.recycler_view13)
    RecyclerView recyclerView13;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen13);
        ButterKnife.bind(this);
        createMenu(toolbar, layout13);

        recyclerView13.setAdapter(new CustomAdapter13());
        recyclerView13.setLayoutManager(new LinearLayoutManager(this));
    }
}
