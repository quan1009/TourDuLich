package com.example.tourdulich.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.tourdulich.DetailsActivity;
import com.example.tourdulich.R;
import com.example.tourdulich.model.GandayData;
import com.example.tourdulich.model.vitrihangdauData;

import java.util.List;

public class vitrihangdauAdapter extends RecyclerView.Adapter<vitrihangdauAdapter.vitrihangdauViewHolder> {

    Context context;
    List<vitrihangdauData> vitrihangdauDataList;

    public vitrihangdauAdapter(Context context, List<vitrihangdauData> gandayDataList) {
        this.context = context;
        this.vitrihangdauDataList = gandayDataList;
    }

    @NonNull
    @Override
    public vitrihangdauViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(context).inflate(R.layout.vitrihangdau_row_item,parent,false);
        return new vitrihangdauViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull vitrihangdauViewHolder holder, int position) {

        holder.countryName.setText(vitrihangdauDataList.get(position).getCountryName());
        holder.placeName.setText(vitrihangdauDataList.get(position).getPlaceName());
        holder.price.setText(vitrihangdauDataList.get(position).getPrice());
        holder.placeImage.setImageResource(vitrihangdauDataList.get(position).getImageUrl());


        //Thêm click top vị trí đi nhiều


    }

    @Override
    public int getItemCount() {
        return vitrihangdauDataList.size();
    }

    public static final class vitrihangdauViewHolder extends RecyclerView.ViewHolder{

        ImageView placeImage;
        TextView placeName, countryName,price;

        public vitrihangdauViewHolder(@NonNull View itemView) {
            super(itemView);

            placeImage = itemView.findViewById(R.id.place_image);
            placeName = itemView.findViewById(R.id.place_name);
            countryName = itemView.findViewById(R.id.country_name);
            price = itemView.findViewById(R.id.price);
        }
    }
}
