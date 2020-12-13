package com.example.afinal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class SecondActivity extends AppCompatActivity {
    Button btnReset;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        btnReset = findViewById(R.id.btnReset);
        btnReset.setOnClickListener(view -> {
            Intent intent_two = new Intent(SecondActivity.this, MainActivity.class);
            startActivity(intent_two);

        });
    }
}