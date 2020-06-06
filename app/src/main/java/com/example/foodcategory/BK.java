package com.example.foodcategory;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class BK extends AppCompatActivity {

    Button menu1, menu2, menu3, menu4;
    String choices = "";
    Double price = 0.00;
    String pricetag = "";



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bk);

        menu1 = (Button) findViewById(R.id.button1);
        menu2 = (Button) findViewById(R.id.button2);
        menu3 = (Button) findViewById(R.id.button3);
        menu4 = (Button) findViewById(R.id.button4);
    }

    public void add_to_list (View view){
        if (view == findViewById(R.id.button1)){
            choices = choices+"Chicken Burger"+"\n";
            price = price+55000;
            pricetag= pricetag+"Rp"+"55.000"+"\n";
        }
        else if (view == findViewById(R.id.button2)){
            choices = choices+"Chicken 5pcs"+"\n";
            price = price+105000;
            pricetag=pricetag+"Rp"+"105.000"+"\n";
        }
        else if (view == findViewById(R.id.button3)){
            choices = choices+"Rasher Burger"+"\n";
            price = price+60000;
            pricetag=pricetag+"Rp"+"60.000"+"\n";
        }
        else if (view == findViewById(R.id.button4)){
            choices = choices+"French Fries"+"\n";
            price = price+ 35000;
            pricetag=pricetag+"Rp"+"35.000"+"\n";
        }

    }

    public void placeOrder (View view){
        Intent i = new Intent(BK.this,OrderDetails.class);
        Bundle bundle = new Bundle();
        bundle.putString("choices",choices);
        bundle.putDouble("price",price);
        bundle.putString("pricetag",pricetag);
        i.putExtras(bundle);
        startActivity(i);
    }
}
