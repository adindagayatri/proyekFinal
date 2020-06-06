package com.example.foodcategory;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class OrderDetails extends AppCompatActivity {

    TextView order, tag, price;
    String list_choice, list_pricetag;
    Double all_price;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order_details);
        order = (TextView) findViewById(R.id.orderList);
        tag = (TextView) findViewById(R.id.tagList);
        price = (TextView) findViewById(R.id.priceList);

        Bundle bundle = getIntent().getExtras();
        list_choice = bundle.getString("choices");
        list_pricetag = bundle.getString("pricetag");
        all_price = bundle.getDouble("price");

        order.setText(list_choice);
        tag.setText(list_pricetag);
        price.setText("Rp"+ all_price.toString());
    }

    public void successPage (View view){
        Intent j = new Intent(OrderDetails.this,successActivity.class);
        startActivity(j);
    }
}
