package com.example.course_application;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class Signup extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
    }

    public void onClickContinue(View view) {
        Intent i = new Intent(Signup.this, SignupConfirm.class);
        startActivity(i);
    }

    public void onClickBack(View view){
        Intent i = new Intent(Signup.this, Login.class);
        startActivity(i);
    }
}