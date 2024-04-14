package com.example.course_application;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class SignupConfirm extends AppCompatActivity {

    EditText edPassword, edPassword2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup_confirm);
        init();
    }

    public void init(){
        edPassword = findViewById(R.id.edPassword);
        edPassword2 = findViewById(R.id.edPassword2);
    }

    public void onClickSignUp(View view) {
        try {
            if (edPassword.getText().toString().equals(edPassword2.getText().toString())) {
                Intent i = new Intent(SignupConfirm.this, Profile.class);
                startActivity(i);
            } else {
                Toast.makeText(getApplicationContext(), "Wrong password", Toast.LENGTH_SHORT).show();
            }
        }catch (Exception exception){
            Toast.makeText(getApplicationContext(), "Wrong password", Toast.LENGTH_SHORT).show();
        }
    }
}