package com.example.weather2_54;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.LinearSnapHelper;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerViewIndicator indicator = findViewById(R.id.indicator);
        RecyclerView recyclerView = findViewById(R.id.recyclerView_display);
        recyclerView.setLayoutManager(new LinearLayoutManager(this
                , LinearLayoutManager.HORIZONTAL, false));
        //令RecyclerView的Item在滑動時可自動置中的方法
        LinearSnapHelper snapHelper = new LinearSnapHelper();
        snapHelper.attachToRecyclerView(recyclerView);

        ArrayList<WeatherData> data = new ArrayList<>();
        data.add(new WeatherData("good", "20"));
        data.add(new WeatherData("bad", "10"));
        MyAdapter adapter = new MyAdapter(data);
        recyclerView.setAdapter(adapter);
        //設置「點」進入綁定RecyclerView
        adapter.setIndicator(indicator,recyclerView);
    }
}