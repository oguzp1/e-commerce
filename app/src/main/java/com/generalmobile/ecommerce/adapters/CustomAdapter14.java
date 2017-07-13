package com.generalmobile.ecommerce.adapters;

/**
 * Created by Shade on 5/9/2016.
 */

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.generalmobile.ecommerce.adapters.listeners.OnClickCategory;
import com.generalmobile.ecommerce.models.Category;
import com.generalmobile.ecommerce.models.Product;
import com.generalmobile.ecommerce.R;
import com.squareup.picasso.Picasso;

import java.util.List;

public class CustomAdapter14 extends RecyclerView.Adapter<CustomAdapter14.ViewHolder> {

    private List<Category> categories;
    private OnClickCategory onClickCategory;



    public CustomAdapter14(List<Category> categories, OnClickCategory onClickCategory) {
        this.categories = categories;
        this.onClickCategory=onClickCategory;

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
        final Category currentCategory = categories.get(position);
        holder.title.setText(currentCategory.getName());
        holder.content.setText(currentCategory.getProductCount()+"Products");
        holder.mRelativeLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onClickCategory.onClick(currentCategory);
            }
        });

        Picasso.with(holder.itemView.getContext())
                .load(currentCategory.getImageUrl())
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
        private RelativeLayout mRelativeLayout;


        public ViewHolder(View itemView) {
            super(itemView);
            this.imageView = (ImageView) itemView.findViewById(R.id.item_image);
            this.title = (TextView) itemView.findViewById(R.id.item_title);
            this.content = (TextView) itemView.findViewById(R.id.item_content);
            this.mRelativeLayout=(RelativeLayout) itemView.findViewById(R.id.relativeLayout14);
        }
    }
}