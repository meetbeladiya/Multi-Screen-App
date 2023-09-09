package com.example.multiscreen;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class practice1 extends AppCompatActivity {

    TextView textView;
    @SuppressLint({"MissingInflatedId", "SetTextI18n"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_practice1);
        textView = findViewById(R.id.textView2);
        Intent intent = getIntent();
        String PassIntent = intent.getStringExtra("PASS_EXTRA");
        textView.setText("Password Is: " + PassIntent);
    }
}