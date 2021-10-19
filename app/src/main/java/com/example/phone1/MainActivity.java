package com.example.phone1;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
                ActionBar actionBar;
        setContentView(R.layout.activity_main);
        actionBar = getSupportActionBar();
        getSupportActionBar().setTitle("⬅                      REGISTER");
        ColorDrawable colorDrawable = new ColorDrawable(Color.parseColor("#92C547"));
        actionBar.setBackgroundDrawable(colorDrawable);
    }
}