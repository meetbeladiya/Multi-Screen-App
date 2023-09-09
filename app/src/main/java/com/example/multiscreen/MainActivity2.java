package com.example.multiscreen;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    TextView textView;
    EditText editText;
    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        textView = findViewById(R.id.textView);
        Intent intent = getIntent();
        String name = intent.getStringExtra("EXTRA_NAME");
        textView.setText("Name Is: " + name);
    }

    public void Active2(View v) {
        editText = findViewById(R.id.pass);
        String passo = editText.getText().toString();
        Intent intent = new Intent(this,practice1.class);
        intent.putExtra("PASS_EXTRA",passo);
        startActivity(intent);
    }

}