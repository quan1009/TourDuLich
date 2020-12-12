package com.example.tourdulich;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.tourdulich.adapter.GandayAdapter;
import com.example.tourdulich.adapter.vitrihangdauAdapter;
import com.example.tourdulich.model.GandayData;
import com.example.tourdulich.model.vitrihangdauData;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView GandayRecycler,vitrihangdauRecycler;
    GandayAdapter GandayAdapter;
    vitrihangdauAdapter vitrihangdauAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        List<GandayData> GandayDataList = new ArrayList<>();
        GandayDataList.add(new GandayData("Vịnh hạ long","Việt Nam","Từ $300",R.drawable.recentimage1));
        GandayDataList.add(new GandayData("Phong nha kẻ bàng","Việt Nam","Từ $200",R.drawable.recentimage2));
        GandayDataList.add(new GandayData("Vịnh hạ long","Việt Nam","Từ $300",R.drawable.recentimage1));
        GandayDataList.add(new GandayData("Phong nha kẻ bàng","Việt Nam","Từ $200",R.drawable.recentimage2));
        GandayDataList.add(new GandayData("Vịnh hạ long","Việt Nam","Từ $300",R.drawable.recentimage1));
        GandayDataList.add(new GandayData("Phong nha kẻ bàng","Việt Nam","Từ $200",R.drawable.recentimage2));


        setGandayRecycler(GandayDataList);

        List<vitrihangdauData> vitrihangdauDataList = new ArrayList<>();
        vitrihangdauDataList.add(new vitrihangdauData("Hội an","Việt Nam","$150",R.drawable.topplaces));
        vitrihangdauDataList.add(new vitrihangdauData("Chùa một cột","Việt Nam","$120",R.drawable.topplaces));
        vitrihangdauDataList.add(new vitrihangdauData("Hội an","Việt Nam","$150",R.drawable.topplaces));
        vitrihangdauDataList.add(new vitrihangdauData("Chùa một cột","Việt Nam","$120",R.drawable.topplaces));vitrihangdauDataList.add(new vitrihangdauData("Hội an","Việt Nam","$150",R.drawable.topplaces));
        vitrihangdauDataList.add(new vitrihangdauData("Chùa một cột","Việt Nam","$120",R.drawable.topplaces));

        setVitrihangdauRecycler(vitrihangdauDataList);
    }

    private void setGandayRecycler(List<GandayData> GandayDataList){

        GandayRecycler = findViewById(R.id.ganday_recycler);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this,RecyclerView.HORIZONTAL,false);
        GandayRecycler.setLayoutManager(layoutManager);
        GandayAdapter = new GandayAdapter(this,GandayDataList);
        GandayRecycler.setAdapter(GandayAdapter);
    }
    private void setVitrihangdauRecycler(List<vitrihangdauData> vitrihangdauDataList){

        vitrihangdauRecycler = findViewById(R.id.vitrihangdau_recycler);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this,RecyclerView.VERTICAL,false);
        vitrihangdauRecycler.setLayoutManager(layoutManager);
        vitrihangdauAdapter = new vitrihangdauAdapter(this,vitrihangdauDataList);
        vitrihangdauRecycler.setAdapter(vitrihangdauAdapter);
    }
}