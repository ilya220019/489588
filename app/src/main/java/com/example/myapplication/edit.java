package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class edit extends AppCompatActivity {
        TextView textView;
        Button button;
        Button button1;
        TextView tv;
        String generateCod = "";
        EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit);
        textView = findViewById(R.id.tv_phone);
        Intent intent = getIntent();
        tv = findViewById(R.id.tv_code);
        editText = findViewById(R.id.et_code);
        button = findViewById(R.id.btn_log_edit);
        button1 = findViewById(R.id.btn_generate_edit);
        String number = intent.getStringExtra("name");
        textView.setText(textView.getText() + number);
        Random random = new Random();
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv.setText(String.valueOf(random.nextInt(99999)));
            }

        });
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (editText.getText().toString().equals(tv.getText())){
                    Intent intent1 = new Intent(edit.this, end.class);
                    intent1.putExtra("name1", editText.getText().toString());
                    startActivity(intent1);
                }else{
                    Toast.makeText(getApplicationContext(), "wrong", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}