package com.if3b.minitest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView xButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        xButton = findViewById(R.id.bt_pindah);
        getSupportActionBar().setTitle("Layout A");

     xButton.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View view) {
             Intent pindah = new Intent(MainActivity.this, second_activity.class);
             startActivity(pindah);
         }
     });





    }
}