package com.example.course_application;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Unsucsess extends AppCompatActivity {

    private AppCompatButton btnTry;
    private AppCompatButton btnNext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_unsucsess);
        final ImageView btnBack1 = findViewById(R.id.btnBack1);
        btnTry = findViewById(R.id.btnTryagain);
        btnNext = findViewById(R.id.btnNext);

        btnTry.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Unsucsess.this, Animal.class));
            }
        });

        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Unsucsess.this, Profile.class));
            }
        });

        btnBack1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Unsucsess.this, Animal.class));
                finish();
            }
        });
    }
}