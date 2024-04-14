package com.example.course_application;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class OnBoarding2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_on_boarding2);
    }

    public void onClickNext(View view){
        Intent i = new Intent(OnBoarding2.this, OnBoarding3.class);
        startActivity(i);

    }
    public void onClickSkip(View view){
        Intent i = new Intent(OnBoarding2.this, Login.class);
        startActivity(i);

    }
}