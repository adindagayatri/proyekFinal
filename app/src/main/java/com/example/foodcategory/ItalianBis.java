package com.example.foodcategory;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ItalianBis extends AppCompatActivity {

    Button menu1, menu2, menu3;
    String choices = "";
    Double price = 0.00;
    String pricetag = "";



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_italian_bis);

        menu1 = (Button) findViewById(R.id.button1);
        menu2 = (Button) findViewById(R.id.button2);
        menu3 = (Button) findViewById(R.id.button3);

    }

    public void add_to_list (View view){
        if (view == findViewById(R.id.button1)){
            choices = choices+"Spaghetti Carbonara"+"\n";
            price = price+78000;
            pricetag=pricetag+"Rp"+"78.000"+"\n";
        }
        else if (view == findViewById(R.id.button2)){
            choices = choices+"Lasagna"+"\n";
            price = price+80000;
            pricetag=pricetag+"Rp"+"80.000"+"\n";
        }
        else if (view == findViewById(R.id.button3)){
            choices = choices+"Aglio Olio Pasta"+"\n";
            price = price+76000;
            pricetag=pricetag+"Rp"+"76.000"+"\n";
        }

    }

    public void placeOrder (View view){
        Intent i = new Intent(ItalianBis.this,OrderDetails.class);
        Bundle bundle = new Bundle();
        bundle.putString("choices",choices);
        bundle.putDouble("price",price);
        bundle.putString("pricetag",pricetag);
        i.putExtras(bundle);
        startActivity(i);
    }
}
