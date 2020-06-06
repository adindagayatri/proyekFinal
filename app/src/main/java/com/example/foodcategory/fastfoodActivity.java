package com.example.foodcategory;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class fastfoodActivity extends AppCompatActivity {

    RecyclerView fastfoodRv;
    String s1[], s2[],s3[];
    int logo[] = {R.drawable.aw, R.drawable.bk, R.drawable.joli,
    R.drawable.kfc, R.drawable.mcd};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fastfood);

        fastfoodRv = findViewById(R.id.fastfoodRecyclerview);
        s1 = getResources().getStringArray(R.array.fastfood_chain);
        s2 = getResources().getStringArray(R.array.fastfood_address);
        s3 = getResources().getStringArray(R.array.rating);

        fastfoodAdapter fastfoodAdaptor = new fastfoodAdapter(this, s1, s2, s3, logo);
        fastfoodRv.setAdapter(fastfoodAdaptor);
        fastfoodRv.setLayoutManager(new LinearLayoutManager(this));


    }

}
