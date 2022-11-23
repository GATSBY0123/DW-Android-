package com.gatsby.android_study;

import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Ex22RecyclerViewEx extends AppCompatActivity implements com.gatsby.android_study.Ex22RecyclerAdapter.MyRecyclerViewClickListener {

    ArrayList<com.gatsby.android_study.Ex22ItemData> dataList = new ArrayList<>();
    int[] cat = {R.drawable.nugu, R.drawable.sinse, R.drawable.suzy,
            R.drawable.song};

    final com.gatsby.android_study.Ex22RecyclerAdapter adapter = new com.gatsby.android_study.Ex22RecyclerAdapter(dataList);
    static int i=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ex22_recyclerview_layout);

        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        for (int i=0; i<4; i++) {
            dataList.add(new com.gatsby.android_study.Ex22ItemData(cat[i], "한국 여성 동양화"+i,
                    String.format("리사이클러뷰 %03d", i)));
        }

        recyclerView.setAdapter(adapter);
        adapter.setOnClickListener(this);

    }

    @Override
    public void onItemClicked(int position) {
        Toast.makeText(getApplicationContext(), "Item : "+position, Toast.LENGTH_SHORT).show();
    }

    public void onTitleClicked(int position) {
        Toast.makeText(getApplicationContext(), "Title : "+position, Toast.LENGTH_SHORT).show();
    }

    public void onContentClicked(int position) {
        Toast.makeText(getApplicationContext(), "Content : "+position, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onImageViewClicked(int position) {
        Toast.makeText(getApplicationContext(), "Image : "+position, Toast.LENGTH_SHORT).show();
    }

    public void onItemLongClicked(int position) {
        adapter.remove(position);
        Toast.makeText(getApplicationContext(),
                dataList.get(position).getTitle()+" is removed",Toast.LENGTH_SHORT).show();
    }


}