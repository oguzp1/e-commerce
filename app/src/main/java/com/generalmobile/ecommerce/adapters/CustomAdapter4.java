package com.generalmobile.ecommerce.adapters;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.generalmobile.ecommerce.R;


public class CustomAdapter4 extends RecyclerView.Adapter<CustomAdapter4.CustomViewHolder> {




    @Override
    public CustomAdapter4.CustomViewHolder onCreateViewHolder(ViewGroup parent,int viewType) {
        View v =  LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_data4, parent, false);
        CustomViewHolder vh = new CustomViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(CustomViewHolder holder, int position) {

        holder.title.setText("subcategory");
        holder.content.setText("view all");
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
            this.title=(TextView)itemView.findViewById(R.id.screen4_title);
            this.content=(TextView)itemView.findViewById(R.id.screen4_content);


        }



    }


}