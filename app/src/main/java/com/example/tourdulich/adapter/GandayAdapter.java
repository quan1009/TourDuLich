package com.example.tourdulich.adapter;

import android.content.Context;
import android.view.LayoutInflater;
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
    List<GandayData> GandayDataList;

    public GandayAdapter(Context context, List<GandayData> gandayDataList) {
        this.context = context;
        GandayDataList = gandayDataList;
    }

    @NonNull
    @Override
    public GandayViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(context).inflate(R.layout.ganday_row_item,parent,false);
        return new GandayViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull GandayViewHolder holder, int position) {

        holder.countryName.setText(GandayDataList.get(position).getCountryName());
        holder.placeName.setText(GandayDataList.get(position).getPlaceName());
        holder.price.setText(GandayDataList.get(position).getPrice());
        holder.placeImage.setImageResource(GandayDataList.get(position).getImageUrl());

    }

    @Override
    public int getItemCount() {
        return GandayDataList.size();
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
