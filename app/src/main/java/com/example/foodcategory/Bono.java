package com.example.foodcategory;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Bono extends AppCompatActivity {

    Button menu1, menu2, menu3, menu4;
    String choices = "";
    Double price = 0.00;
    String pricetag = "";



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bono);

        menu1 = (Button) findViewById(R.id.button1);
        menu2 = (Button) findViewById(R.id.button2);
        menu3 = (Button) findViewById(R.id.button3);
        menu4 = (Button) findViewById(R.id.button4);
    }

    public void add_to_list (View view){
        if (view == findViewById(R.id.button1)){
            choices = choices+"OG Italian Pizza"+"\n";
            price = price+85000;
            pricetag= pricetag+"Rp"+"85.000"+"\n";
        }
        else if (view == findViewById(R.id.button2)){
            choices = choices+"Pepperoni Pizza"+"\n";
            price = price+90000;
            pricetag=pricetag+"Rp"+"90.000"+"\n";
        }
        else if (view == findViewById(R.id.button3)){
            choices = choices+"Olive Pizza"+"\n";
            price = price+80000;
            pricetag=pricetag+"Rp"+"80.000"+"\n";
        }
        else if (view == findViewById(R.id.button4)){
            choices = choices+"Signature Lasagna"+"\n";
            price = price+ 67000;
            pricetag=pricetag+"Rp"+"67.000"+"\n";
        }

    }

    public void placeOrder (View view){
        Intent i = new Intent(Bono.this,OrderDetails.class);
        Bundle bundle = new Bundle();
        bundle.putString("choices",choices);
        bundle.putDouble("price",price);
        bundle.putString("pricetag",pricetag);
        i.putExtras(bundle);
        startActivity(i);
    }
}

