package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class end extends AppCompatActivity {
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_end);
        Intent intent3 = getIntent();
        textView = findViewById(R.id.tv_end);
        String number = intent3.getStringExtra("name");
        textView.setText(textView.getText() + number);

    }
}