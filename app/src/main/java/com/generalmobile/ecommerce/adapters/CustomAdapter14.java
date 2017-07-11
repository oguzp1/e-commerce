package com.generalmobile.ecommerce.adapters;

/**
 * Created by Shade on 5/9/2016.
 */

import android.support.design.widget.Snackbar;
import android.support.v7.view.menu.MenuView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.generalmobile.ecommerce.Product;
import com.generalmobile.ecommerce.R;
import com.generalmobile.ecommerce.di.NetModule;
import com.squareup.picasso.Picasso;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class CustomAdapter14 extends RecyclerView.Adapter<CustomAdapter14.ViewHolder> {
    private List<String> categories;
    private List<AtomicInteger> categoryFreq;
    private List<Product> products;



    public CustomAdapter14(List<String> categories, List<AtomicInteger> categoryFreq, List<Product> products) {
        this.categories = categories;
        this.categoryFreq = categoryFreq;

        this.products = products;
    }

    public CustomAdapter14() { }

    @Override


    public CustomAdapter14.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_data14, parent, false);
        ViewHolder vh = new ViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(CustomAdapter14.ViewHolder holder, int position) {
        final Product product = products.get(position);
        final String category = categories.get(position);
        final AtomicInteger categoryFrequency = categoryFreq.get(position);

        holder.title.setText(category);
        holder.content.setText(categoryFrequency + " items");

        Picasso.with(holder.itemView.getContext())
                .load(NetModule.BASE_URL + "/photos/" + product.getPhotoDir())
                .fit()
                .centerCrop()
                .into(holder.imageView);
    }

    @Override
    public int getItemCount() {
        return categories.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder {

        private ImageView imageView;
        private TextView title, content;


        public ViewHolder(View itemView) {
            super(itemView);
            this.imageView = (ImageView) itemView.findViewById(R.id.item_image);
            this.title = (TextView) itemView.findViewById(R.id.item_title);
            this.content = (TextView) itemView.findViewById(R.id.item_content);
        }
    }
}