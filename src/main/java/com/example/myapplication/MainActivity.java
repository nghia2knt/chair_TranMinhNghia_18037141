package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rcvThing;
    private ChairAdapter chairAdapter;
    private ArrayList<Chair> chairs;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_product_view);

        rcvThing = findViewById(R.id.rcvThing);

        chairs = new ArrayList<>();
        chairs.add(new Chair("Matteo Armchair","$550",R.drawable.images1));
        chairs.add(new Chair("Morden Armchair","$350",R.drawable.images2));
        chairs.add(new Chair("Nice Armchair","$250",R.drawable.images3));
        chairs.add(new Chair("Circle Armchair","$350",R.drawable.images4));
        chairAdapter =
                new ChairAdapter(this, chairs);
        rcvThing.setAdapter(chairAdapter);

        GridLayoutManager gridLayoutManager =
                new GridLayoutManager(this,2);
        rcvThing.setLayoutManager(gridLayoutManager);
    }
}