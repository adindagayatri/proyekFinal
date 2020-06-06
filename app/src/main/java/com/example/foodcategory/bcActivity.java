package com.example.foodcategory;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class bcActivity extends AppCompatActivity {
    RecyclerView bcRv;
    String s1[],s2[],s3[];
    int logo[] = {R.drawable.jco, R.drawable.breadtalk};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bc);
        bcRv = findViewById(R.id.bcRecyclerview);
        s1 = getResources().getStringArray(R.array.bcName);
        s2 = getResources().getStringArray(R.array.bcAddress);
        s3 = getResources().getStringArray(R.array.rating_bc);

        bcAdapter bcAdaptor = new bcAdapter(this,s1,s2,s3,logo);
        bcRv.setAdapter(bcAdaptor);
        bcRv.setLayoutManager(new LinearLayoutManager(this));
    }
}
