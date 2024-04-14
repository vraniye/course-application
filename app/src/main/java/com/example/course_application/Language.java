package com.example.course_application;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Language extends AppCompatActivity {

    private String choosingLanguage;

    Button btnRus, btnEng, btnCh, btnKz, btnBr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_language);
        init();
    }

    public void init(){
        btnRus = findViewById(R.id.btnRus);
        btnEng = findViewById(R.id.btnEng);
        btnCh = findViewById(R.id.btnCh);
        btnKz = findViewById(R.id.btnKz);
        btnBr = findViewById(R.id.btnBr);

    }

    public void onClickRussian(View view) {
        choosingLanguage = btnRus.getText().toString();
        btnBr.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor("#FFF6EB")));
        btnEng.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor("#FFF6EB")));
        btnCh.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor("#FFF6EB")));
        btnKz.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor("#FFF6EB")));
        btnRus.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor("#F76400")));
    }
    public void onClickEnglish(View view) {
        choosingLanguage = btnEng.getText().toString();
        btnRus.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor("#FFF6EB")));
        btnBr.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor("#FFF6EB")));
        btnCh.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor("#FFF6EB")));
        btnKz.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor("#FFF6EB")));
        btnEng.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor("#F76400")));
    }
    public void onClickChinese(View view) {
        choosingLanguage = btnCh.getText().toString();
        btnRus.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor("#FFF6EB")));
        btnEng.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor("#FFF6EB")));
        btnBr.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor("#FFF6EB")));
        btnKz.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor("#FFF6EB")));
        btnCh.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor("#F76400")));
    }
    public void onClickKazakh(View view) {
        choosingLanguage = btnKz.getText().toString();
        btnRus.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor("#FFF6EB")));
        btnEng.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor("#FFF6EB")));
        btnCh.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor("#FFF6EB")));
        btnBr.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor("#FFF6EB")));
        btnKz.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor("#F76400")));
    }
    public void onClickBelarus(View view) {
        choosingLanguage = btnBr.getText().toString();
        btnRus.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor("#FFF6EB")));
        btnEng.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor("#FFF6EB")));
        btnCh.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor("#FFF6EB")));
        btnKz.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor("#FFF6EB")));
        btnBr.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor("#F76400")));
    }

    public void onClickChoose(View view) {
        Intent i = new Intent(Language.this, Profile.class);
        startActivity(i);
    }

}