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

public class bcAdapter extends RecyclerView.Adapter<bcAdapter.bcViewHolder> {
    Context context;
    String data1[], data2[], data3[];
    int logo[];

    public bcAdapter(Context ct, String[] s1, String[] s2, String[] s3, int[] logoResto) {
        context = ct;
        data1 = s1;
        data2 = s2;
        data3 = s3;
        logo = logoResto;
    }

    @NonNull
    @Override
    public bcViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.row_bc, parent, false);
        return new bcViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull bcViewHolder holder, int position) {
        holder.myText1.setText(data1[position]);
        holder.myText2.setText(data2[position]);
        holder.myText3.setText(data3[position]);
        holder.myImage.setImageResource(logo[position]);

    }

    @Override
    public int getItemCount() {
        return logo.length;
    }

    public class bcViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        TextView myText1, myText2, myText3;
        ImageView myImage;

        public bcViewHolder(@NonNull View itemView) {
            super(itemView);
            myText1 = itemView.findViewById(R.id.bcName);
            myText2 = itemView.findViewById(R.id.bcAddress);
            myText3 = itemView.findViewById(R.id.bcRating);
            myImage = itemView.findViewById(R.id.logobc);
            itemView.setOnClickListener(this);
        }
        public void onClick (View v){
            final Intent intent;
            switch (getAdapterPosition()){
                case 0:
                    intent = new Intent(context, JCO.class);
                    break;

                case 1:
                    intent = new Intent(context, Breadtalk.class);
                    break;

                default:
                    intent = new Intent(context, bcActivity.class);
                    break;
            }
            context.startActivity(intent);
        }
    }
}
