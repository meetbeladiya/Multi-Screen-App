package com.example.multiscreen;

import static android.security.KeyChain.EXTRA_NAME;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void OpenActivity (View v) {
        Toast.makeText(this, "Opening Second Activity...", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this, MainActivity2.class);
        textView = findViewById(R.id.name);
        String nameText = textView.getText().toString();
        intent.putExtra("EXTRA_NAME",nameText);
        startActivity(intent);
    }


}