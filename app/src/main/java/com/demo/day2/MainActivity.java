package com.demo.day2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tvUsername;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intent intent = getIntent();
        tvUsername = findViewById(R.id.tvUsername);
        tvUsername.setText("Xin chào " + intent.getStringExtra("username"));

        Log.d("MainActivity", "onCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();

        Log.d("MainActivity", "onStart: ");
    }

    @Override
    protected void onResume() {
        super.onResume();


        Log.d("MainActivity", "onResume: ");
    }

    @Override
    protected void onPause() {
        super.onPause();

        Log.d("MainActivity", "onPause: ");
    }

    @Override
    protected void onStop() {
        super.onStop();

        Log.d("MainActivity", "onStop: ");
    }

    @Override
    protected void onRestart() {
        super.onRestart();

        Log.d("MainActivity", "onRestart: ");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        Log.d("MainActivity", "onDestroy: ");
    }
}