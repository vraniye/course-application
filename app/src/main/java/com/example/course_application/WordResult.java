package com.example.course_application;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class WordResult extends AppCompatActivity {

    private AppCompatButton btnAnswer1;
    private AppCompatButton btnAnswer2;
    private AppCompatButton btnAnswer3;
    private AppCompatButton btnAnswer4;
    private AppCompatButton btnNext;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_word_result);


        final String getselectedAnsw = getIntent().getStringExtra("selectedAnsw");
        final ImageView btnBack2 = findViewById(R.id.btnBack2);
        btnAnswer1 = findViewById(R.id.btnAnsw1);
        btnAnswer2 = findViewById(R.id.btnAnsw2);
        btnAnswer3 = findViewById(R.id.btnAnsw3);
        btnAnswer4 = findViewById(R.id.btnAnsw4);
        btnNext = findViewById(R.id.btnNext2);

        if (getselectedAnsw.equals("муха")){
            btnAnswer1.setBackgroundResource(R.drawable.round_back_orange);
            btnAnswer1.setTextColor(Color.parseColor("#FFFFFF"));
            btnAnswer2.setBackgroundResource(R.drawable.round_back_green);
            btnAnswer2.setTextColor(Color.parseColor("#000000"));
            btnAnswer3.setBackgroundResource(R.drawable.round_back_gray);
            btnAnswer3.setTextColor(Color.parseColor("#000000"));
            btnAnswer4.setBackgroundResource(R.drawable.round_back_gray);
            btnAnswer4.setTextColor(Color.parseColor("#000000"));
        } else if (getselectedAnsw.equals("садовник")) {
            btnAnswer1.setBackgroundResource(R.drawable.round_back_gray);
            btnAnswer1.setTextColor(Color.parseColor("#000000"));
            btnAnswer2.setBackgroundResource(R.drawable.round_back_green);
            btnAnswer2.setTextColor(Color.parseColor("#FFFFFF"));
            btnAnswer3.setBackgroundResource(R.drawable.round_back_gray);
            btnAnswer3.setTextColor(Color.parseColor("#000000"));
            btnAnswer4.setBackgroundResource(R.drawable.round_back_gray);
            btnAnswer4.setTextColor(Color.parseColor("#000000"));
        } else if (getselectedAnsw.equals("гладиолус")) {
            btnAnswer1.setBackgroundResource(R.drawable.round_back_gray);
            btnAnswer1.setTextColor(Color.parseColor("#000000"));
            btnAnswer2.setBackgroundResource(R.drawable.round_back_green);
            btnAnswer2.setTextColor(Color.parseColor("#000000"));
            btnAnswer3.setBackgroundResource(R.drawable.round_back_orange);
            btnAnswer3.setTextColor(Color.parseColor("#FFFFFF"));
            btnAnswer4.setBackgroundResource(R.drawable.round_back_gray);
            btnAnswer4.setTextColor(Color.parseColor("#000000"));
        } else if (getselectedAnsw.equals("собака")){
            btnAnswer1.setBackgroundResource(R.drawable.round_back_gray);
            btnAnswer1.setTextColor(Color.parseColor("#000000"));
            btnAnswer2.setBackgroundResource(R.drawable.round_back_green);
            btnAnswer2.setTextColor(Color.parseColor("#000000"));
            btnAnswer3.setBackgroundResource(R.drawable.round_back_gray);
            btnAnswer3.setTextColor(Color.parseColor("#000000"));
            btnAnswer4.setBackgroundResource(R.drawable.round_back_orange);
            btnAnswer4.setTextColor(Color.parseColor("#FFFFFF"));
        }
        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(WordResult.this, Profile.class));
            }
        });
        btnBack2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(WordResult.this, WordPractice.class));
                finish();
            }
        });
    }
}