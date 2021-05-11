package com.example.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ChairAdapter extends RecyclerView.Adapter<ChairAdapter.ThingViewHolder>{

    private Context context;
    private LayoutInflater layoutInflater;
    private ArrayList<Chair> chairs;

    public ChairAdapter(Context context,
                                ArrayList<Chair> chairs) {
        layoutInflater = LayoutInflater.from(context);
        this.chairs = chairs;
    }


    @NonNull
    @Override
    public ChairAdapter.ThingViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View mItemView = layoutInflater
                .inflate(R.layout.item_recylerview, parent, false);
        return new ThingViewHolder(mItemView, this);
    }

    @Override
    public void onBindViewHolder(@NonNull ChairAdapter.ThingViewHolder holder, int position) {
        Chair chair = chairs.get(position);
        holder.tvName.setText(chair.getName());
        holder.tvPrice.setText(String.valueOf(chair.getPrice()));
        holder.imgThing.setImageResource(chair.getImage());

    }

    @Override
    public int getItemCount() {
        return chairs.size();
    }

    public class ThingViewHolder extends RecyclerView.ViewHolder{
        TextView tvName, tvPrice;
        ImageView imgThing;


        ChairAdapter chairAdapter;

        public ThingViewHolder(@NonNull View itemView,
                               ChairAdapter adapter) {
            super(itemView);
            tvName = itemView.findViewById(R.id.tvName);
            tvPrice = itemView.findViewById(R.id.tvPrice);
            imgThing = itemView.findViewById(R.id.imgThing);
            this.chairAdapter = adapter;

        }

    }
}
