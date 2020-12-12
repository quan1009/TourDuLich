package com.example.tourdulich.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.content.Intent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.tourdulich.R;
import com.example.tourdulich.model.GandayData;

import java.util.List;

public class GandayAdapter extends RecyclerView.Adapter<GandayAdapter.GandayViewHolder> {

    Context context;
    List<GandayData> gandayDataList;

    public GandayAdapter(Context context, List<GandayData> gandayDataList) {
        this.context = context;
        this.gandayDataList = gandayDataList;
    }

    @NonNull
    @Override
    public GandayViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(context).inflate(R.layout.ganday_row_item,parent,false);
        return new GandayViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull GandayViewHolder holder, int position) {

        holder.countryName.setText(gandayDataList.get(position).getCountryName());
        holder.placeName.setText(gandayDataList.get(position).getPlaceName());
        holder.price.setText(gandayDataList.get(position).getPrice());
        holder.placeImage.setImageResource(gandayDataList.get(position).getImageUrl());



    }

    @Override
    public int getItemCount() {
        return gandayDataList.size();
    }

    public static final class GandayViewHolder extends RecyclerView.ViewHolder{

        ImageView placeImage;
        TextView placeName, countryName,price;

        public GandayViewHolder(@NonNull View itemView) {
            super(itemView);

            placeImage = itemView.findViewById(R.id.place_image);
            placeName = itemView.findViewById(R.id.place_name);
            countryName = itemView.findViewById(R.id.country_name);
            price = itemView.findViewById(R.id.price);
        }
    }
}
