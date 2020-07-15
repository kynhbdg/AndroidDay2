package com.demo.day2;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    EditText edUsername, edPassword;
    Button btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        initView();
    }

    private void initView() {
        edUsername = findViewById(R.id.edUser);
        edPassword = findViewById(R.id.edPasword);
        btnLogin = findViewById(R.id.btnLogin);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (edUsername.getText().toString().equals("VNPT") && edPassword.getText().toString().equals("123")) {
                    Intent intent = new Intent(LoginActivity.this, MainActivity.class);
                    intent.putExtra("username", edUsername.getText().toString());
                    startActivity(intent);
                } else {
//                    Toast t = Toast.makeText(LoginActivity.this, "Sai username/password", Toast.LENGTH_SHORT);
//                    t.setGravity(Gravity.CENTER, 0, 0);
//                    t.show();

                    open();
                }
            }
        });
    }

    public void open() {
        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(this);
        alertDialogBuilder.setTitle("Thông báo");
        alertDialogBuilder.setMessage("Bạn có muốn đăng nhập không?");
        alertDialogBuilder.setPositiveButton(
                "yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Toast.makeText(LoginActivity.this, "Bạn chọn Yes", Toast.LENGTH_SHORT).show();
                    }
                }
        );

        alertDialogBuilder.setNegativeButton("no", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(LoginActivity.this, "Bạn chọn No", Toast.LENGTH_SHORT).show();
            }
        });

        AlertDialog alertDialog = alertDialogBuilder.create();
        alertDialog.show();

    }

}