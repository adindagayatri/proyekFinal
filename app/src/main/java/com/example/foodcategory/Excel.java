package com.example.foodcategory;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Excel extends AppCompatActivity {

    Button menu1, menu2, menu3;
    String choices = "";
    Double price = 0.00;
    String pricetag = "";



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_excel);

        menu1 = (Button) findViewById(R.id.button1);
        menu2 = (Button) findViewById(R.id.button2);
        menu3 = (Button) findViewById(R.id.button3);
    }

    public void add_to_list (View view){
        if (view == findViewById(R.id.button1)){
            choices = choices+"Hot Espresso"+"\n";
            price = price+45000;
            pricetag= pricetag+"Rp"+"45.000"+"\n";
        }
        else if (view == findViewById(R.id.button2)){
            choices = choices+"Hot Cappucinno"+"\n";
            price = price+50000;
            pricetag=pricetag+"Rp"+"50.000"+"\n";
        }
        else if (view == findViewById(R.id.button3)){
            choices = choices+"Chocolate Frappucinno"+"\n";
            price = price+57000;
            pricetag=pricetag+"Rp"+"57.000"+"\n";
        }

    }

    public void placeOrder (View view){
        Intent i = new Intent(Excel.this,OrderDetails.class);
        Bundle bundle = new Bundle();
        bundle.putString("choices",choices);
        bundle.putDouble("price",price);
        bundle.putString("pricetag",pricetag);
        i.putExtras(bundle);
        startActivity(i);
    }
}