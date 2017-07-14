package com.generalmobile.ecommerce.screens.screen13;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.generalmobile.ecommerce.R;

/**
 * Created by MONSTER on 10.7.2017.
 */

public class CustomAdapter13 extends RecyclerView.Adapter<CustomAdapter13.ViewHolder> {

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_data13, null, false);
        ViewHolder vh = new ViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.productImage.setImageResource(R.drawable.mountains);
    }

    @Override
    public int getItemCount() {
        return 4;
    }

    static class ViewHolder extends RecyclerView.ViewHolder {

        private ImageView productImage;
        private ImageView productIncrease;
        private ImageView productDecrease;
        private TextView productName;
        private TextView productPrice;
        private TextView productAmount;

        public ViewHolder(View itemView) {
            super(itemView);
            this.productImage = (ImageView) itemView.findViewById(R.id.product_image13);
            this.productIncrease = (ImageView) itemView.findViewById(R.id.product_increase13);
            this.productDecrease = (ImageView) itemView.findViewById(R.id.product_decrease13);
            this.productName = (TextView) itemView.findViewById(R.id.product_name13);
            this.productPrice = (TextView) itemView.findViewById(R.id.product_price13);
            this.productAmount = (TextView) itemView.findViewById(R.id.product_amount13);
        }
    }
}
