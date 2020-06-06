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

public class bevAdapter extends RecyclerView.Adapter<bevAdapter.bevViewHolder> {
    Context context;
    String data1[], data2[], data3[];
    int logo[];

    public bevAdapter(Context ct, String[] s1, String[] s2, String[] s3, int[] logoResto) {
        context = ct;
        data1 = s1;
        data2 = s2;
        data3 = s3;
        logo = logoResto;
    }

    @NonNull
    @Override
    public bevAdapter.bevViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.row_beverage, parent, false);
        return new bevViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull bevAdapter.bevViewHolder holder, int position) {
        holder.myText1.setText(data1[position]);
        holder.myText2.setText(data2[position]);
        holder.myText3.setText(data3[position]);
        holder.myImage.setImageResource(logo[position]);
    }

    @Override
    public int getItemCount() {
        return logo.length;
    }

    public class bevViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        TextView myText1, myText2, myText3;
        ImageView myImage;

        public bevViewHolder(@NonNull View itemView) {
            super(itemView);
            myText1 = itemView.findViewById(R.id.bevName);
            myText2 = itemView.findViewById(R.id.bevAddress);
            myText3 = itemView.findViewById(R.id.bevRating);
            myImage = itemView.findViewById(R.id.logobev);
            itemView.setOnClickListener(this);
        }
        public void onClick (View v){
            final Intent intent;
            switch (getAdapterPosition()){
                case 0:
                    intent = new Intent(context, Excel.class);
                    break;

                case 1:
                    intent = new Intent(context, Chatime.class);
                    break;

                case 2:
                    intent = new Intent(context, Starbucks.class);
                    break;

                default:
                    intent = new Intent(context, beverageActivity.class);
                    break;
            }
            context.startActivity(intent);
        }
    }
}
