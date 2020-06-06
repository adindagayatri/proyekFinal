package com.example.foodcategory;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class CategoryAdapter extends RecyclerView.Adapter<CategoryAdapter.CategoryView> {
    List<Integer> logoKategori = new ArrayList<>();
    List<String> namaKategori = new ArrayList<>();
    Context context;

    public CategoryAdapter(Context ct, List<Integer> logoKategori, List<String> namaKategori) {
        this.logoKategori = logoKategori;
        this.namaKategori = namaKategori;
        this.context = ct;
    }

    @NonNull
    @Override
    public CategoryView onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.row_category,viewGroup,false);
        return new CategoryView(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final CategoryView categoryView, final int position) {

        categoryView.logoCat.setImageResource(logoKategori.get(position));
        categoryView.namaCat.setText(namaKategori.get(position));

    }

    @Override
    public int getItemCount() {
        return logoKategori.size();
    }

    public class CategoryView extends RecyclerView.ViewHolder implements View.OnClickListener {
        ImageView logoCat;
        TextView namaCat;
        LinearLayout linear;

        public CategoryView(@NonNull View itemView) {
            super(itemView);

            logoCat = (ImageView)itemView.findViewById(R.id.logo_category);
            namaCat = (TextView)itemView.findViewById(R.id.nama_category);
            linear = (LinearLayout)itemView.findViewById(R.id.linear);

            itemView.setOnClickListener(this);

        }

        public void onClick (View v){
            final Intent intent;
            switch (getAdapterPosition()){
                case 0:
                    intent = new Intent(context, fastfoodActivity.class);
                    break;

                case 1:
                    intent = new Intent(context,chineseActivity.class);
                    break;

                case 2:
                    intent = new Intent(context,italianActivity.class);
                    break;

                case 3:
                    intent = new Intent(context,japanfoodActivity.class);
                    break;

                case 4:
                    intent = new Intent(context,bcActivity.class);
                    break;

                case 5:
                    intent = new Intent(context,beverageActivity.class);
                    break;

                default:
                    intent = new Intent(context, detailCategory.class);
                    break;
            }
            context.startActivity(intent);
        }
    }

}
