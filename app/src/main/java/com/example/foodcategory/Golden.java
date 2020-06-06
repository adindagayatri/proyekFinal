package com.example.foodcategory;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Golden extends AppCompatActivity {

    Button menu1, menu2, menu3, menu4;
    String choices = "";
    Double price = 0.00;
    String pricetag = "";



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_golden);

        menu1 = (Button) findViewById(R.id.button1);
        menu2 = (Button) findViewById(R.id.button2);
        menu3 = (Button) findViewById(R.id.button3);
        menu4 = (Button) findViewById(R.id.button4);
    }

    public void add_to_list (View view){
        if (view == findViewById(R.id.button1)){
            choices = choices+"Pork Bao"+"\n";
            price = price+56000;
            pricetag= pricetag+"Rp"+"56.000"+"\n";
        }
        else if (view == findViewById(R.id.button2)){
            choices = choices+"Shrimp Dimsum"+"\n";
            price = price+60000;
            pricetag=pricetag+"Rp"+"60.000"+"\n";
        }
        else if (view == findViewById(R.id.button3)){
            choices = choices+"Pork Dumpling"+"\n";
            price = price+60000;
            pricetag=pricetag+"Rp"+"60.000"+"\n";
        }
        else if (view == findViewById(R.id.button4)){
            choices = choices+"Chow Mein"+"\n";
            price = price+ 67000;
            pricetag=pricetag+"Rp"+"67.000"+"\n";
        }

    }

    public void placeOrder (View view){
        Intent i = new Intent(Golden.this,OrderDetails.class);
        Bundle bundle = new Bundle();
        bundle.putString("choices",choices);
        bundle.putDouble("price",price);
        bundle.putString("pricetag",pricetag);
        i.putExtras(bundle);
        startActivity(i);
    }
}
