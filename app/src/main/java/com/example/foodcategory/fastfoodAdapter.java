package com.example.foodcategory;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class fastfoodAdapter extends RecyclerView.Adapter<fastfoodAdapter.fastfoodViewHolder> {
    String data1[],data2[],data3[];
    int logo[];
    Context context;

    public fastfoodAdapter (Context ct,String s1[], String s2[], String s3[], int logoFastfood[]){
        context = ct;
        data1 = s1;
        data2 = s2;
        data3 = s3;
        logo = logoFastfood;
    }
    @NonNull
    @Override
    public fastfoodViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.row_fastfood,parent,false);
        return new fastfoodViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull fastfoodViewHolder holder, int position) {
        holder.myText1.setText(data1[position]);
        holder.myText2.setText(data2[position]);
        holder.myText3.setText(data3[position]);
        holder.myImage.setImageResource(logo[position]);

    }

    @Override
    public int getItemCount() {
        return logo.length;
    }

    public class fastfoodViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        TextView myText1, myText2, myText3;
        ImageView myImage;
        public fastfoodViewHolder(@NonNull View itemView) {
            super(itemView);
            myText1 = itemView.findViewById(R.id.ffName);
            myText2 = itemView.findViewById(R.id.ffAddress);
            myText3 = itemView.findViewById(R.id.ffRating);
            myImage = itemView.findViewById(R.id.logoff);

            itemView.setOnClickListener(this);
        }
        public void onClick (View v){
            final Intent intent;
            switch (getAdapterPosition()){
                case 0:
                    intent = new Intent(context, AW.class);
                    break;

                case 1:
                    intent = new Intent(context, BK.class);
                    break;

                case 2:
                    intent = new Intent(context, JOLI.class);
                    break;

                case 3:
                    intent = new Intent(context, KFC.class);
                    break;

                case 4:
                    intent = new Intent(context, mcDonalds.class);
                    break;

                default:
                    intent = new Intent(context, fastfoodActivity.class);
                    break;
            }
            context.startActivity(intent);
        }
    }
}
