package com.generalmobile.ecommerce.screens.screen14;

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

import com.generalmobile.ecommerce.R;
import com.generalmobile.ecommerce.screens.listeners.OnClickCategory;
import com.generalmobile.ecommerce.models.Category;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

public class CustomAdapter14 extends RecyclerView.Adapter<CustomAdapter14.ViewHolder> {

    private List<Category> categories;
    private OnClickCategory onClickCategory;


    public CustomAdapter14(OnClickCategory onClickCategory, List<Category> categories) {
        this.onClickCategory = onClickCategory;
        this.categories = categories;
    }

    public CustomAdapter14() {
    }

    public void setCategories(List<Category> categories) {
        this.categories = categories;
        notifyDataSetChanged();
    }

    @Override
    public CustomAdapter14.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_data14, parent, false);
        ViewHolder vh = new ViewHolder(v, onClickCategory);
        return vh;
    }

    @Override
    public void onBindViewHolder(CustomAdapter14.ViewHolder holder, int position) {
        final Category currentCategory = categories.get(position);
        holder.title.setText(currentCategory.getCategoryName());
        holder.content.setText(String.format("%d Products", currentCategory.getProductCount()));

        Picasso.with(holder.itemView.getContext())
                .load(currentCategory.getCatgoryImageUrl())
                .fit()
                .centerCrop()
                .into(holder.imageView);
    }

    @Override
    public int getItemCount() {
        return categories.size();
    }

    static class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        private ImageView imageView;
        private TextView title, content;
        private RelativeLayout mRelativeLayout;
        private OnClickCategory onClickCategory;



        public ViewHolder(View itemView, OnClickCategory onClickCategory) {
            super(itemView);
            this.imageView = (ImageView) itemView.findViewById(R.id.item_image);
            this.title = (TextView) itemView.findViewById(R.id.item_title);
            this.content = (TextView) itemView.findViewById(R.id.item_content);
            this.mRelativeLayout = (RelativeLayout) itemView.findViewById(R.id.relativeLayout14);
            this.onClickCategory = onClickCategory;
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            onClickCategory.onClick(v, getAdapterPosition());
        }
    }
}