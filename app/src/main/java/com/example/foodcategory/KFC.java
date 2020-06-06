package com.example.foodcategory;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class KFC extends AppCompatActivity {
    Button menu1, menu2, menu3;
    String choices = "";
    Double price = 0.00;
    String pricetag = "";



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kfc);

        menu1 = (Button) findViewById(R.id.button1);
        menu2 = (Button) findViewById(R.id.button2);
        menu3 = (Button) findViewById(R.id.button3);
    }

    public void add_to_list (View view){
        if (view == findViewById(R.id.button1)){
            choices = choices+"Chicken 5pcs"+"\n";
            price = price+105000;
            pricetag= pricetag+ "Rp"+"105.000"+"\n";
        }
        else if (view == findViewById(R.id.button2)){
            choices = choices+"French Fries"+"\n";
            price = price+25000;
            pricetag=pricetag+"Rp"+"25.000"+"\n";
        }
        else if (view == findViewById(R.id.button3)){
            choices = choices+"Burger Combo"+"\n";
            price = price+42000;
            pricetag=pricetag+"Rp"+"42.000"+"\n";
        }

    }

    public void placeOrder (View view){
        Intent i = new Intent(KFC.this,OrderDetails.class);
        Bundle bundle = new Bundle();
        bundle.putString("choices",choices);
        bundle.putDouble("price",price);
        bundle.putString("pricetag",pricetag);
        i.putExtras(bundle);
        startActivity(i);
    }
}