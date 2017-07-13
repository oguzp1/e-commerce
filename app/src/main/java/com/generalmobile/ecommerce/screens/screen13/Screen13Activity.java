package com.generalmobile.ecommerce.screens.screen13;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;

import com.generalmobile.ecommerce.R;

import butterknife.BindView;
import butterknife.ButterKnife;

public class Screen13Activity extends AppCompatActivity {

    @BindView(R.id.recycler_view13)
    RecyclerView recyclerView13;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen13);
        ButterKnife.bind(this);
    }
}
