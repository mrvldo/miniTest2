package com.if3b.minitest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class second_activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        getSupportActionBar().setTitle("Layout B");
    }
}