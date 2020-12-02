package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btnChangeTextColor, btnChangeBackground, btnChangeStr;
    TextView tvGreet;
    EditText etChangeStr;
    View activity_main;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnChangeTextColor = findViewById(R.id.btnChangeTextColor);
        btnChangeBackground = findViewById(R.id.btnChangeBackground);
        btnChangeStr = findViewById(R.id.btnChangeStr);
        tvGreet= findViewById(R.id.tvGreet);
        etChangeStr = findViewById(R.id.etChangeStr);
        activity_main = findViewById(R.id.activity_main);

        String strDefault = "Hello from Ruimin!";
        int backgroundColorDefault = getResources().getColor(R.color.myOrange);
        int textColorDefault = getResources().getColor(R.color.white);

        btnChangeTextColor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvGreet.setTextColor(getResources().getColor(R.color.myYellow));
            }
        });

        btnChangeBackground.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                activity_main.setBackgroundColor(getResources().getColor(R.color.myPurple));
            }
        });

        btnChangeStr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String newStr = etChangeStr.getText().toString();
                if(newStr.isEmpty()) {
                    tvGreet.setText(strDefault);
                } else {
                    tvGreet.setText(newStr);
                    etChangeStr.setText("");
                }
            }
        });

        activity_main.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvGreet.setText(strDefault);
                activity_main.setBackgroundColor(backgroundColorDefault);
                tvGreet.setTextColor(textColorDefault);
            }
        });
    }

}