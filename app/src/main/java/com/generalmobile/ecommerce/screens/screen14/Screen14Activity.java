package com.generalmobile.ecommerce.screens.screen14;

import android.os.Bundle;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;

import com.generalmobile.ecommerce.BaseActivity;
import com.generalmobile.ecommerce.MainApplication;
import com.generalmobile.ecommerce.Product;
import com.generalmobile.ecommerce.R;
import com.generalmobile.ecommerce.adapters.CustomAdapter14;

import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;

public class Screen14Activity extends BaseActivity implements Screen14View{

    @BindView(R.id.recycler_view)
    RecyclerView recyclerView;
    RecyclerView.LayoutManager layoutManager;
    RecyclerView.Adapter adapter;
    @BindView(R.id.toolbar)
    Toolbar toolbar;
    @BindView(R.id.drawer_layout)
    DrawerLayout drawerLayout;

    @Inject
    Screen14Presenter screen14Presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen14);
        ButterKnife.bind(this);
        createMenu(toolbar, drawerLayout);

        DaggerScreen14Component.builder()
                .appComponent(((MainApplication)getApplication()).getAppComponent())
                .screen14Module(new Screen14Module(this))
                .build()
                .inject(this);

        screen14Presenter.getFeed();
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
    }


    @Override
    public void resetAdapter(List<String> categories, List<AtomicInteger> freqData, List<Product> products) {
        recyclerView.setAdapter(new CustomAdapter14(categories, freqData, products));
    }
}
