package com.example.foodcategory;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class beverageActivity extends AppCompatActivity {
    RecyclerView bevRecyclerview;
    String s1[],s2[],s3[];
    int logo[] = {R.drawable.excel,R.drawable.chatime,R.drawable.sbux};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_beverage);
        bevRecyclerview = findViewById(R.id.beverageRecyclerview);
        s1 = getResources().getStringArray(R.array.beverageName);
        s2 = getResources().getStringArray(R.array.beverageAddress);
        s3 = getResources().getStringArray(R.array.rating_bv);

        bevAdapter bevAdaptor = new bevAdapter(this,s1,s2,s3,logo);
        bevRecyclerview.setAdapter(bevAdaptor);
        bevRecyclerview.setLayoutManager(new LinearLayoutManager(this));
    }
}
