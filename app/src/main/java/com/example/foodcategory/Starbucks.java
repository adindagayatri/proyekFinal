package com.example.foodcategory;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Starbucks extends AppCompatActivity {

    Button menu1, menu2, menu3;
    String choices = "";
    Double price = 0.00;
    String pricetag = "";



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_starbucks);

        menu1 = (Button) findViewById(R.id.button1);
        menu2 = (Button) findViewById(R.id.button2);
        menu3 = (Button) findViewById(R.id.button3);
    }

    public void add_to_list (View view){
        if (view == findViewById(R.id.button1)){
            choices = choices+"Caramel Frappucinno"+"\n";
            price = price+67000;
            pricetag= pricetag+"Rp"+"67.000"+"\n";
        }
        else if (view == findViewById(R.id.button2)){
            choices = choices+"Chocolate Frappucinno"+"\n";
            price = price+65000;
            pricetag=pricetag+"Rp"+"65.000"+"\n";
        }
        else if (view == findViewById(R.id.button3)){
            choices = choices+"Hot Americano"+"\n";
            price = price+56000;
            pricetag=pricetag+"Rp"+"56.000"+"\n";
        }

    }

    public void placeOrder (View view){
        Intent i = new Intent(Starbucks.this,OrderDetails.class);
        Bundle bundle = new Bundle();
        bundle.putString("choices",choices);
        bundle.putDouble("price",price);
        bundle.putString("pricetag",pricetag);
        i.putExtras(bundle);
        startActivity(i);
    }
}
