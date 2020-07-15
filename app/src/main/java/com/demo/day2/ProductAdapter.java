package com.demo.day2;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class ProductAdapter extends RecyclerView.Adapter {

    Activity activity;
    List<Product> lstProduct;

    public ProductAdapter(Activity activity, List<Product> lstProduct) {
        this.activity = activity;
        this.lstProduct = lstProduct;
    }


    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = activity.getLayoutInflater().inflate(R.layout.product_item, parent, false);
        ProductHolder holder = new ProductHolder(itemView);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        ProductHolder productHolder = (ProductHolder) holder;
        Product model = lstProduct.get(position);
        productHolder.ivCover.setImageResource(model.getImage());
        productHolder.tvName.setText(model.getName());
        productHolder.tvPrice.setText(model.getPrice());
    }

    @Override
    public int getItemCount() {
        return lstProduct.size();
    }
}
