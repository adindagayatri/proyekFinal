package com.example.foodcategory;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AW extends AppCompatActivity {

    Button menu1, menu2, menu3, menu4;
    String choices = "";
    Double price = 0.00;
    String pricetag = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aw);

        menu1 = (Button) findViewById(R.id.button1);
        menu2 = (Button) findViewById(R.id.button2);
        menu3 = (Button) findViewById(R.id.button3);
        menu4 = (Button) findViewById(R.id.button4);
    }

    public void add_to_list (View view){
        if (view == findViewById(R.id.button1)){
            choices = choices+"Chicken Burger"+"\n";
            price = price+35000;
            pricetag=pricetag+"Rp 35000"+"\n";
        }
        else if (view == findViewById(R.id.button2)){
            choices = choices+"Chicken Bucket"+"\n";
            price = price+85000;
            pricetag=pricetag+"Rp 85000"+"\n";
        }
        else if (view == findViewById(R.id.button3)){
            choices = choices+"Root Beer"+"\n";
            price = price+32000;
            pricetag=pricetag+"Rp 32000"+"\n";
        }
        else if (view == findViewById(R.id.button4)){
            choices = choices+"French Fries"+"\n";
            price = price+25000;
            pricetag=pricetag+"Rp 25000"+"\n";
        }

    }

    public void placeOrder (View view){
        Intent i = new Intent(AW.this,OrderDetails.class);
        Bundle bundle = new Bundle();
        bundle.putString("choices",choices);
        bundle.putDouble("price",price);
        bundle.putString("pricetag",pricetag);
        i.putExtras(bundle);
        startActivity(i);
    }
}

