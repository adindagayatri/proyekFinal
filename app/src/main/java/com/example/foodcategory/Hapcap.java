package com.example.foodcategory;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Hapcap extends AppCompatActivity {

    Button menu1, menu2, menu3;
    String choices = "";
    Double price = 0.00;
    String pricetag = "";



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hapcap);

        menu1 = (Button) findViewById(R.id.button1);
        menu2 = (Button) findViewById(R.id.button2);
        menu3 = (Button) findViewById(R.id.button3);

    }

    public void add_to_list (View view){
        if (view == findViewById(R.id.button1)){
            choices = choices+"Kung Pao Chicken"+"\n";
            price = price+65000;
            pricetag=pricetag+"Rp"+"65.000"+"\n";
        }
        else if (view == findViewById(R.id.button2)){
            choices = choices+"Fried Rice"+"\n";
            price = price+57000;
            pricetag=pricetag+"Rp"+"57.000"+"\n";
        }
        else if (view == findViewById(R.id.button3)){
            choices = choices+"Chow Mein"+"\n";
            price = price+57000;
            pricetag=pricetag+"Rp"+"57.000"+"\n";
        }

    }

    public void placeOrder (View view){
        Intent i = new Intent(Hapcap.this,OrderDetails.class);
        Bundle bundle = new Bundle();
        bundle.putString("choices",choices);
        bundle.putDouble("price",price);
        bundle.putString("pricetag",pricetag);
        i.putExtras(bundle);
        startActivity(i);
    }
}
