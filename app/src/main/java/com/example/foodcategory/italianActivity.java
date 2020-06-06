package com.example.foodcategory;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class italianActivity extends AppCompatActivity {
    RecyclerView italianfoodRv;
    String s1[],s2[],s3[];
    int logo[] = {R.drawable.bono, R.drawable.lorenzo, R.drawable.italianbis, R.drawable.eat};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_italian);

        italianfoodRv = findViewById(R.id.italianfoodRecyclerview);
        s1 = getResources().getStringArray(R.array.italianfood_resto);
        s2 = getResources().getStringArray(R.array.italianfood_address);
        s3 = getResources().getStringArray(R.array.rating_if);

        italianAdapter italianAdaptor = new italianAdapter(this,s1,s2,s3,logo);
        italianfoodRv.setAdapter(italianAdaptor);
        italianfoodRv.setLayoutManager(new LinearLayoutManager(this));
    }
}
