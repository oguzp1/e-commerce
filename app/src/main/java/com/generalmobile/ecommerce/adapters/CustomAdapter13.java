package com.generalmobile.ecommerce.adapters;

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

//    List<Screen13Item> itemList;
//
//    public CustomAdapter13(List<Screen13Item> itemList) {
//        this.itemList = itemList;
//    }

    public CustomAdapter13() {
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_data13, parent, false);
        ViewHolder vh = new ViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
//        final Screen13Item currentItem = itemList.get(position);
//
//        holder.productImage.setImageResource(currentItem.getImgSrc());
//        holder.productName.setText(currentItem.getProductName());
//        holder.productPrice.setText("$" + currentItem.getProductPrice());
//        holder.productAmount.setText(currentItem.getItemsOrdered());
//
//        if (holder.productAmount.getText().toString().equals("1"))
//            holder.productDecrease.setColorFilter(Color.rgb(208, 212, 217));
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
