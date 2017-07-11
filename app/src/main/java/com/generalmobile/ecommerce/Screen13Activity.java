package com.generalmobile.ecommerce;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.TextView;

import com.generalmobile.ecommerce.adapters.CustomAdapter13;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class Screen13Activity extends AppCompatActivity {

    @BindView(R.id.recycler_view13)
    RecyclerView recyclerView13;
    @BindView(R.id.total_price13)
    TextView totalPrice13;
    @BindView(R.id.total_items13)
    TextView totalItems13;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen13);
        ButterKnife.bind(this);

        List<Screen13Item> itemList = new ArrayList<>();
        itemList.add(new Screen13Item());
        itemList.add(new Screen13Item());
        itemList.add(new Screen13Item());
        itemList.add(new Screen13Item());
        int price_total = 0, items_total = 0;

        for (Screen13Item i : itemList) {
            price_total += i.getProductPrice();
            items_total++;
        }

        totalPrice13.setText("$ " + String.valueOf(price_total));
        totalItems13.setText(String.valueOf(items_total) + " items");
        recyclerView13.setAdapter(new CustomAdapter13(itemList));
        recyclerView13.setLayoutManager(new LinearLayoutManager(this));
    }
}
