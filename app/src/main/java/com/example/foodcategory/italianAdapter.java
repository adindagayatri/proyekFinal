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

public class italianAdapter extends RecyclerView.Adapter<italianAdapter.italianViewHolder> {
    String data1[], data2[], data3[];
    int logo[];
    Context context;

    public italianAdapter(Context ct, String[] s1, String[] s2, String[] s3, int[] logoResto) {
        context = ct;
        data1 = s1;
        data2 = s2;
        data3 = s3;
        logo = logoResto;
    }

    @NonNull
    @Override
    public italianViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.row_italian, parent, false);
        return new italianViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull italianViewHolder holder, int position) {
        holder.myText1.setText(data1[position]);
        holder.myText2.setText(data2[position]);
        holder.myText3.setText(data3[position]);
        holder.myImage.setImageResource(logo[position]);

    }

    @Override
    public int getItemCount() {
        return logo.length;
    }

    public class italianViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        TextView myText1, myText2, myText3;
        ImageView myImage;
        public italianViewHolder(@NonNull View itemView) {
            super(itemView);
            myText1 = itemView.findViewById(R.id.ifName);
            myText2 = itemView.findViewById(R.id.ifAddress);
            myText3 = itemView.findViewById(R.id.ifRating);
            myImage = itemView.findViewById(R.id.logoif);

            itemView.setOnClickListener(this);
        }
        public void onClick (View v){
            final Intent intent;
            switch (getAdapterPosition()){
                case 0:
                    intent = new Intent(context, Bono.class);
                    break;

                case 1:
                    intent = new Intent(context, Lorenzo.class);
                    break;

                case 2:
                    intent = new Intent(context, ItalianBis.class);
                    break;

                case 3:
                    intent = new Intent(context, Eat.class);
                    break;

                default:
                    intent = new Intent(context, italianActivity.class);
                    break;
            }
            context.startActivity(intent);
        }
    }
}
