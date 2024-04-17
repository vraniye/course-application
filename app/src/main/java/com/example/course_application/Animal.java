package com.example.course_application;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class Animal extends AppCompatActivity {


    private AppCompatButton btnCheck;
    private EditText userText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animal);
        final ImageView btnBack1 = findViewById(R.id.btnBack1);
        btnCheck = findViewById(R.id.btnCheck1);
        userText = findViewById(R.id.userText1);

        btnCheck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (userText.getText().toString().isEmpty()){
                    Toast.makeText(getApplicationContext(), "Нашите ответ", Toast.LENGTH_SHORT).show();
                } else { if (userText.getText().toString().toLowerCase().equals("hamster")){
                    startActivity(new Intent(Animal.this, Complete.class));
                }else{
                    startActivity(new Intent(Animal.this, Unsucsess.class));
                }

                }
            }
        });


        btnBack1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Animal.this, Profile.class));
                finish();
            }
        });
    }
}