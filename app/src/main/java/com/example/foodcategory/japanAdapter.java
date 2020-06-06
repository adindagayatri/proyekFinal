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

public class japanAdapter extends RecyclerView.Adapter<japanAdapter.japanViewHolder> {
    Context context;
    String data1[], data2[], data3[];
    int logo[];
    public japanAdapter(Context ct, String[] s1, String[] s2, String[] s3, int logoResto[]) {
        context = ct;
        data1 = s1;
        data2 = s2;
        data3 = s3;
        logo = logoResto;
    }

    @NonNull
    @Override
    public japanViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.row_japan, parent, false);
        return new japanViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull japanViewHolder holder, int position) {
        holder.myText1.setText(data1[position]);
        holder.myText2.setText(data2[position]);
        holder.myText3.setText(data3[position]);
        holder.myImage.setImageResource(logo[position]);

    }

    @Override
    public int getItemCount() {
        return logo.length;
    }

    public class japanViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        TextView myText1, myText2, myText3;
        ImageView myImage;
        public japanViewHolder(@NonNull View itemView) {
            super(itemView);
            myText1 = itemView.findViewById(R.id.jfName);
            myText2 = itemView.findViewById(R.id.jfAddress);
            myText3 = itemView.findViewById(R.id.jfRating);
            myImage = itemView.findViewById(R.id.logojf);
            itemView.setOnClickListener(this);
        }
        public void onClick (View v){
            final Intent intent;
            switch (getAdapterPosition()){
                case 0:
                    intent = new Intent(context, Ichiban.class);
                    break;

                case 1:
                    intent = new Intent(context, Marugame.class);
                    break;

                case 2:
                    intent = new Intent(context, Nippon.class);
                    break;

                default:
                    intent = new Intent(context, japanfoodActivity.class);
                    break;
            }
            context.startActivity(intent);
        }
    }
}
