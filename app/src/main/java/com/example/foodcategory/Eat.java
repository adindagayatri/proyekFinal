package com.example.foodcategory;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Eat extends AppCompatActivity {

    Button menu1, menu2, menu3, menu4;
    String choices = "";
    Double price = 0.00;
    String pricetag = "";



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eat);

        menu1 = (Button) findViewById(R.id.button1);
        menu2 = (Button) findViewById(R.id.button2);
        menu3 = (Button) findViewById(R.id.button3);
        menu4 = (Button) findViewById(R.id.button4);
    }

    public void add_to_list (View view){
        if (view == findViewById(R.id.button1)){
            choices = choices+"Spaghetti Carbonara"+"\n";
            price = price+68000;
            pricetag=pricetag+"Rp"+"68.000"+"\n";
        }
        else if (view == findViewById(R.id.button2)){
            choices = choices+"Lasagna"+"\n";
            price = price+72000;
            pricetag=pricetag+"Rp"+"72.000"+"\n";
        }
        else if (view == findViewById(R.id.button3)){
            choices = choices+"Aglio Olio Pasta"+"\n";
            price = price+65000;
            pricetag=pricetag+"Rp"+"65.000"+"\n";
        }
        else if (view == findViewById(R.id.button4)){
            choices = choices+"Pepperoni Pizza"+"\n";
            price = price+ 95000;
            pricetag=pricetag+"Rp"+"95.000"+"\n";
        }

    }

    public void placeOrder (View view){
        Intent i = new Intent(Eat.this,OrderDetails.class);
        Bundle bundle = new Bundle();
        bundle.putString("choices",choices);
        bundle.putDouble("price",price);
        bundle.putString("pricetag",pricetag);
        i.putExtras(bundle);
        startActivity(i);
    }
}
