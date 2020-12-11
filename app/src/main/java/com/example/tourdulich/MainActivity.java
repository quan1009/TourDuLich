package com.example.tourdulich;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.tourdulich.adapter.GandayAdapter;
import com.example.tourdulich.model.GandayData;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView gandayRecycler;
    GandayAdapter gandayAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        List<GandayData> gandayDataList = new ArrayList<>();
        gandayDataList.add(new GandayData("Vịnh hạ long","Việt Nam","Từ $300",R.drawable.recentimage1));
        gandayDataList.add(new GandayData("Phong nha kẻ bàng","Việt Nam","Từ $200",R.drawable.recentimage2));

    }

    private void setGandayRecycler(List<GandayData> gandayDataList){

        gandayRecycler = findViewById(R.id.ganday_recycler);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this,RecyclerView.HORIZONTAL,false);
        gandayRecycler.setLayoutManager(layoutManager);
        gandayAdapter = new GandayAdapter(this,gandayDataList);
        gandayRecycler.setAdapter(gandayAdapter);
    }
}