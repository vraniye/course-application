package com.example.course_application;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class OnBoarding3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_on_boarding3);
    }

    public void onClickNext(View view){
        Intent i = new Intent(OnBoarding3.this, Login.class);
        startActivity(i);

    }
    public void onClickSkip(View view){
        Intent i = new Intent(OnBoarding3.this, Login.class);
        startActivity(i);

    }
}