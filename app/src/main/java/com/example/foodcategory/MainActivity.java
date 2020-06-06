package com.example.foodcategory;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.Toolbar;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerViewCategory;

    List<Integer> logoKategori = new ArrayList<>();
    List<String> namaKategori = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initialized();
    }

    private void initialized() {

        recyclerViewCategory=(RecyclerView)findViewById(R.id.recyclerview_category);

        GridLayoutManager gridLayoutManager = new GridLayoutManager(this,2);
        recyclerViewCategory.setLayoutManager(gridLayoutManager);

        logoKategori.add(R.drawable.fastfood);
        logoKategori.add(R.drawable.chinesefood);
        logoKategori.add(R.drawable.pizza);
        logoKategori.add(R.drawable.sushi);
        logoKategori.add(R.drawable.bread);
        logoKategori.add(R.drawable.beverage);

        namaKategori.add("Fast Food");
        namaKategori.add("Chinese Food");
        namaKategori.add("Italian Food");
        namaKategori.add("Japanese Food");
        namaKategori.add("Bread and Cake");
        namaKategori.add("Beverage");



        recyclerViewCategory.setAdapter(new CategoryAdapter(this,logoKategori,namaKategori));


    }
}
