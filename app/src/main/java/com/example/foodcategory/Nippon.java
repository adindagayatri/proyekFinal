package com.example.foodcategory;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Nippon extends AppCompatActivity {

    Button menu1, menu2, menu3, menu4;
    String choices = "";
    Double price = 0.00;
    String pricetag = "";



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nippon);

        menu1 = (Button) findViewById(R.id.button1);
        menu2 = (Button) findViewById(R.id.button2);
        menu3 = (Button) findViewById(R.id.button3);
        menu4 = (Button) findViewById(R.id.button4);
    }

    public void add_to_list (View view){
        if (view == findViewById(R.id.button1)){
            choices = choices+"OG Beef Udon"+"\n";
            price = price+78000;
            pricetag= pricetag+"Rp"+"78.000"+"\n";
        }
        else if (view == findViewById(R.id.button2)){
            choices = choices+"Sushi Set"+"\n";
            price = price+125000;
            pricetag=pricetag+"Rp"+"125.000"+"\n";
        }
        else if (view == findViewById(R.id.button3)){
            choices = choices+"Sashimi Set"+"\n";
            price = price+157000;
            pricetag=pricetag+"Rp"+"157.000"+"\n";
        }
        else if (view == findViewById(R.id.button4)){
            choices = choices+"OG Beef Teriyaki"+"\n";
            price = price+ 89000;
            pricetag=pricetag+"Rp"+"89.000"+"\n";
        }

    }

    public void placeOrder (View view){
        Intent i = new Intent(Nippon.this,OrderDetails.class);
        Bundle bundle = new Bundle();
        bundle.putString("choices",choices);
        bundle.putDouble("price",price);
        bundle.putString("pricetag",pricetag);
        i.putExtras(bundle);
        startActivity(i);
    }
}

