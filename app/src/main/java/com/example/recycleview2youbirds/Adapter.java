package com.example.recycleview2youbirds;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Adapter extends RecyclerView.Adapter<viewHolder> {
    private ArrayList<view>arrayList;
    private itemClickListner itemClickListner;

    public Adapter(ArrayList<view> arrayList,itemClickListner itemClickListner) {
        this.arrayList=arrayList;
        this.itemClickListner=itemClickListner;
    }

    @NonNull

    @Override
    public viewHolder onCreateViewHolder(@NonNull  ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.animalview,parent,false);
        return new  viewHolder(view,itemClickListner);

    }

    @Override
    public void onBindViewHolder(@NonNull viewHolder holder, int position) {
view view=arrayList.get(position);
holder.setData(view);
    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }
}
