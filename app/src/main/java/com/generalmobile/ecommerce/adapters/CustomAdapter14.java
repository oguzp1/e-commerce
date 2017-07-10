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

import com.generalmobile.ecommerce.R;

public class CustomAdapter14 extends RecyclerView.Adapter<CustomAdapter14.ViewHolder> {
    private ImageView imageView;

    public CustomAdapter14(ImageView imageView) {
        this.imageView = imageView;
    }
    public CustomAdapter14() {

    }

    @Override


    public CustomAdapter14.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
       View v= LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_data14, parent, false);
        ViewHolder vh = new ViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(CustomAdapter14.ViewHolder holder, int position) {
    holder.imageView.setImageResource(R.mipmap.ic_launcher);

    }

    @Override
    public int getItemCount() {
        return 5;
    }
    class ViewHolder extends RecyclerView.ViewHolder{

        private ImageView imageView;

        public ViewHolder(View itemView) {
            super(itemView);
            this.imageView=(ImageView) itemView.findViewById(R.id.item_image);
        }
    }
}