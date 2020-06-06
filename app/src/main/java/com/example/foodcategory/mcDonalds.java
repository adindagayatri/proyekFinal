package com.example.foodcategory;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class mcDonalds extends AppCompatActivity {

    Button cheeseburger, mcspicy, spicy, krispy, mcflurry;
    String choices = "";
    Double price = 0.00;
    String pricetag = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mcd_layout);

        cheeseburger = (Button) findViewById(R.id.cheeseburgerButton);
        mcspicy = (Button) findViewById(R.id.mcspicyButton);
        spicy = (Button) findViewById(R.id.spicyButton);
        krispy = (Button) findViewById(R.id.krispyButton);
        mcflurry = (Button) findViewById(R.id.mcflurryButton);
    }

    public void add_to_list (View view){
        if (view == findViewById(R.id.cheeseburgerButton)){
            choices = choices+"Cheeseburger"+"\n";
            price = price+34000;
            pricetag= pricetag+"Rp 34000"+"\n";
        }
        else if (view == findViewById(R.id.mcspicyButton)){
            choices = choices+"McSpicy"+"\n";
            price = price+40000;
            pricetag=pricetag+"Rp 40000"+"\n";
        }
        else if (view == findViewById(R.id.spicyButton)){
            choices = choices+"Spicy Chicken"+"\n";
            price = price+32000;
            pricetag=pricetag+"Rp 32000"+"\n";
        }
        else if (view == findViewById(R.id.krispyButton)){
            choices = choices+"Krispy Chicken"+"\n";
            price = price+32000;
            pricetag=pricetag+"Rp 32000"+"\n";
        }
        else if (view == findViewById(R.id.mcflurryButton)){
            choices = choices+"McFlurry Oreo"+"\n";
            price = price+12000;
            pricetag=pricetag+"Rp 12000"+"\n";
        }
    }

    public void placeOrder (View view){
        Intent i = new Intent(mcDonalds.this,OrderDetails.class);
        Bundle bundle = new Bundle();
        bundle.putString("choices",choices);
        bundle.putDouble("price",price);
        bundle.putString("pricetag",pricetag);
        i.putExtras(bundle);
        startActivity(i);
    }
}
