package com.generalmobile.ecommerce;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;



public class CustomAdapter9 extends RecyclerView.Adapter<CustomAdapter9.CustomViewHolder> {




    @Override
    public CustomAdapter9.CustomViewHolder onCreateViewHolder(ViewGroup parent,int viewType) {
        View v =  LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_data9, parent, false);
        CustomViewHolder vh = new CustomViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(CustomViewHolder holder, int position) {
        holder.title.setText("Product");
        holder.content.setText("hjkshjkshd  ldhldhl");
    }




    @Override
    public int getItemCount() {
        return 20;
    }

    class CustomViewHolder extends RecyclerView.ViewHolder{
        private TextView title;
        private TextView content ;



        public CustomViewHolder(View itemView) {
            super(itemView);
            this.title=(TextView)itemView.findViewById(R.id.screen9_title);
            this.content=(TextView)itemView.findViewById(R.id.screen9_content);


        }



    }


}