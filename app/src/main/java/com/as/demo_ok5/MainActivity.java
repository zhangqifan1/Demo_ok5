package com.as.demo_ok5;

import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        BannerLayout recyclerview = findViewById(R.id.recycler);
        recyclerview.setShowIndicator(false);
        List<String> list = new ArrayList<>();

        for (int i = 0; i < 30; i++) {
            list.add("我是第"+i+"条");
        }

        SampleAdapter sampleAdapter = new SampleAdapter(R.layout.item_text, list);
        recyclerview.setAdapter(sampleAdapter);

    }





}
