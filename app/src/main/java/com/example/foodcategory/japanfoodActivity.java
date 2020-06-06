package com.example.foodcategory;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class japanfoodActivity extends AppCompatActivity {
    RecyclerView japanfoodRv;
    String s1[],s2[],s3[];
    int logo[] = {R.drawable.ichiban,R.drawable.marugame,R.drawable.nippon};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_japanfood);

        japanfoodRv = findViewById(R.id.japanfoodRecyclerview);
        s1 = getResources().getStringArray(R.array.japanesefood_name);
        s2 = getResources().getStringArray(R.array.japanesefood_address);
        s3 = getResources().getStringArray(R.array.rating_jf);

        japanAdapter japanAdaptor = new japanAdapter(this,s1,s2,s3,logo);
        japanfoodRv.setAdapter(japanAdaptor);
        japanfoodRv.setLayoutManager(new LinearLayoutManager(this));
    }
}
