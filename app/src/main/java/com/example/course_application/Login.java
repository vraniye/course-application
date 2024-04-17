package com.example.course_application;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class Login extends AppCompatActivity {

    EditText edLogin, edPassword;

    private final String USER_EMAIL = "test@test.ru";
    private final String USER_PASSWORD = "1234";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        init();
    }

    public void init(){
        edLogin = findViewById(R.id.edLogin);
        edPassword = findViewById(R.id.edPassword);
    }


    public void onClickLogin(View view) {
        try {
            if (edLogin.getText().toString().equals(USER_EMAIL) && edPassword.getText().toString().equals(USER_PASSWORD)) {
                Intent i = new Intent(Login.this, Language.class);
                startActivity(i);
            } else {
                Toast.makeText(getApplicationContext(), "Wrong email or password", Toast.LENGTH_SHORT).show();
            }
        } catch (Exception exception) {
            Toast.makeText(getApplicationContext(), "Some error", Toast.LENGTH_SHORT).show();
        }
    }


    public void onClickSignUp(View view) {
        Intent i = new Intent(Login.this, Signup.class);
        startActivity(i);
    }


    public void onClickBack(View view){
        Intent i = new Intent(Login.this, OnBoarding3.class);
        startActivity(i);
    }
}