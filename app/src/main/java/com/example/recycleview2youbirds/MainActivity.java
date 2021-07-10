package com.example.recycleview2youbirds;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements itemClickListner {
    private RecyclerView recyclerView;
    private ArrayList<view>arrayList=new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        buildSetData();
        setRecyclerView();
    }

    private void buildSetData() {
for(int i =0;i<100;i++){
    if( i%4 ==0 )
    {
        arrayList.add(new view(R.drawable.egale,"Egale"));
    } else if(i% 4 ==1 ) {
        arrayList.add(new view(R.drawable.backparrot,"parrot"));
    }

}

    }

    private void initView() {
        recyclerView=findViewById(R.id.recycleview);
    }
    private void setRecyclerView(){
        Adapter view =new Adapter(arrayList,this);
        LinearLayoutManager linearLayoutManager =new LinearLayoutManager(this);
    recyclerView.setLayoutManager(linearLayoutManager);
    recyclerView.setAdapter(view);
    }

    @Override
    public void onItemClicked(view view) {
        Toast.makeText(MainActivity.this,view.getText(),Toast.LENGTH_SHORT).show();

    }
}