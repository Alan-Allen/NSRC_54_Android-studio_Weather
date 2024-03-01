package com.example.weather2_54;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {
    public ArrayList<WeatherData> data;

    public MyAdapter(ArrayList<WeatherData> data) {
        this.data = data;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        TextView tvTitle,tvDepiction;
        ImageView igTank;
        public ViewHolder(View itemView) {
            super(itemView);
            tvTitle = itemView.findViewById(R.id.textView_title);
            tvDepiction = itemView.findViewById(R.id.textView_depiction);

        }
    }

    //綁定標籤點點列
    public void setIndicator(RecyclerViewIndicator indicator,RecyclerView recyclerView){
        indicator.setWithRecyclerView(recyclerView);
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        WeatherData WeatherData = data.get(position);
        holder.tvTitle.setText(WeatherData.getWeather());
        holder.tvDepiction.setText(WeatherData.getTemp());
    }

    @Override
    public int getItemCount() {
        return data.size();
    }
}
