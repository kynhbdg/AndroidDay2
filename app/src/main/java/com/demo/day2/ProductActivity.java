package com.demo.day2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class ProductActivity extends AppCompatActivity {

    List<Product> lst = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product);

        // B1: Datasource
        initData();

        // B2: Adapter
        ProductAdapter adapter = new ProductAdapter(this, lst);

        // B3: Layout Manager
        RecyclerView.LayoutManager layoutManager = new GridLayoutManager(this, 2);

        // B4:
        RecyclerView rvProduct = findViewById(R.id.rvProduct);
        rvProduct.setLayoutManager(layoutManager);
        rvProduct.setAdapter(adapter);
    }

    private void initData() {
        lst.add(new Product("Product 1", "500.000", R.drawable.p1));
        lst.add(new Product("Product 2", "500.000", R.drawable.p2));
        lst.add(new Product("Product 3", "500.000", R.drawable.p3));
        lst.add(new Product("Product 4", "500.000", R.drawable.p4));
        lst.add(new Product("Product 5", "500.000", R.drawable.p5));
        lst.add(new Product("Product 6", "500.000", R.drawable.p6));
    }
}