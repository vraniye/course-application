package com.example.course_application;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class ListeningResult extends AppCompatActivity {

    private EditText userText;
    private AppCompatButton btnNext3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listening_result);
        btnNext3 = findViewById(R.id.btnNext3);
        userText = findViewById(R.id.userText3);

        final String answer = getIntent().getStringExtra("answer");
        System.out.println(answer);

        if (answer.equals("hamster")){
            userText.setText(answer);
            userText.setTextColor(Color.parseColor("#5ba890"));
        }else{
            userText.setText(answer);
            userText.setTextColor(Color.parseColor("#d6185d"));
        }
        btnNext3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ListeningResult.this, Profile.class));
            }
        });
    }
}