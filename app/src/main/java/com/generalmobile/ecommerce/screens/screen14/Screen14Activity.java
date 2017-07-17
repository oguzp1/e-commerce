package com.generalmobile.ecommerce.screens.screen14;

import android.database.ContentObserver;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Toast;

import com.generalmobile.ecommerce.base.BaseActivity;
import com.generalmobile.ecommerce.MainApplication;
import com.generalmobile.ecommerce.di.DatabaseModule;
import com.generalmobile.ecommerce.repo.DBObserver;
import com.generalmobile.ecommerce.screens.listeners.OnClickCategory;
import com.generalmobile.ecommerce.models.Category;
import com.generalmobile.ecommerce.R;

import java.util.List;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;

public class Screen14Activity extends BaseActivity implements Screen14View, OnClickCategory {

    @BindView(R.id.recycler_view)
    RecyclerView recyclerView;
    @BindView(R.id.toolbar)
    Toolbar toolbar;
    @BindView(R.id.drawer_layout)
    DrawerLayout drawerLayout;

    CustomAdapter14 adapter;

    @Inject
    Screen14Presenter screen14Presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen14);
        ButterKnife.bind(this);
        createMenu(toolbar, drawerLayout);

        DaggerScreen14Component.builder()
                .appComponent(((MainApplication) getApplication()).getAppComponent())
                .screen14Module(new Screen14Module(this))
                .build()
                .inject(this);


        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        screen14Presenter.fetchData();
    }

    @Override
    public void adapterHandler(List<Category> categories) {
        if (adapter == null) {
            adapter = new CustomAdapter14(this, categories);
            recyclerView.setAdapter(adapter);
        } else {
            adapter.setCategories(categories);
        }
    }

    @Override
    public void setObserverForDatabase(DBObserver observerForDatabase) {
        getContentResolver().registerContentObserver(Uri.parse(String.format("content://com.generalmobile.ecommerce.models/%s", DatabaseModule.DATABASE_NAME)), true, observerForDatabase);
    }

    @Override
    public void onClick(View v, int position) {
        Toast.makeText(this, String.format("%d inci kategori...", position), Toast.LENGTH_SHORT).show();
    }
}
