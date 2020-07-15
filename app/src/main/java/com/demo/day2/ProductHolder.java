package com.demo.day2;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ProductHolder extends RecyclerView.ViewHolder {
    ImageView ivCover;
    TextView tvName, tvPrice;

    public ProductHolder(@NonNull View itemView) {
        super(itemView);
        ivCover = itemView.findViewById(R.id.imgCover);
        tvName = itemView.findViewById(R.id.tvName);
        tvPrice = itemView.findViewById(R.id.tvPrice);
    }
}
