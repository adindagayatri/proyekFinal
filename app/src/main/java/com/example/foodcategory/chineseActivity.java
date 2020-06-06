package com.example.foodcategory;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class chineseActivity extends AppCompatActivity {

    RecyclerView chinesefoodRv;
    String s1[],s2[],s3[];
    int logo[] = {R.drawable.bao, R.drawable.golden, R.drawable.hapcap, R.drawable.majong};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chinese);

        chinesefoodRv = findViewById(R.id.chinesefoodRecyclerview);
        s1 = getResources().getStringArray(R.array.chinesefood_resto);
        s2 = getResources().getStringArray(R.array.chinesefood_address);
        s3 = getResources().getStringArray(R.array.rating_cf);

        chinesefoodAdapter chinesefoodAdaptor = new chinesefoodAdapter (this,s1,s2,s3,logo);
        chinesefoodRv.setAdapter(chinesefoodAdaptor);
        chinesefoodRv.setLayoutManager(new LinearLayoutManager(this));
    }
}
