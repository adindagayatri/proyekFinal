package com.example.foodcategory;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class JCO extends AppCompatActivity {

    Button menu1, menu2, menu3;
    String choices = "";
    Double price = 0.00;
    String pricetag = "";



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jco);

        menu1 = (Button) findViewById(R.id.button1);
        menu2 = (Button) findViewById(R.id.button2);
        menu3 = (Button) findViewById(R.id.button3);
    }

    public void add_to_list (View view){
        if (view == findViewById(R.id.button1)){
            choices = choices+"Mini Donut Combo"+"\n";
            price = price+97000;
            pricetag= pricetag+"Rp"+"97.000"+"\n";
        }
        else if (view == findViewById(R.id.button2)){
            choices = choices+"JCO Donut 6pcs"+"\n";
            price = price+85000;
            pricetag=pricetag+"Rp"+"85.000"+"\n";
        }
        else if (view == findViewById(R.id.button3)){
            choices = choices+"JCO Donut 12pcs"+"\n";
            price = price+103000;
            pricetag=pricetag+"Rp"+"103.000"+"\n";
        }

    }

    public void placeOrder (View view){
        Intent i = new Intent(JCO.this,OrderDetails.class);
        Bundle bundle = new Bundle();
        bundle.putString("choices",choices);
        bundle.putDouble("price",price);
        bundle.putString("pricetag",pricetag);
        i.putExtras(bundle);
        startActivity(i);
    }
}
