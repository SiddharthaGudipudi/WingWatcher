package com.example.as1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class CounterActivity extends AppCompatActivity {

    Button increaseBtn;
    Button backBtn;
    TextView numberTxt;

    Button decreaseBtn;

    Button multiplyBtn;



    int counter = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_counter);

        increaseBtn = findViewById(R.id.increaseBtn);
        backBtn = findViewById(R.id.backBtn);
        numberTxt = findViewById(R.id.number);
        decreaseBtn = findViewById(R.id.decreaseBtn);
        multiplyBtn = findViewById(R.id.multiplyBtn);

        increaseBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                numberTxt.setText(String.valueOf(++counter));
            }
        });
        decreaseBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                numberTxt.setText(String.valueOf(--counter));
            }
        });
        multiplyBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                numberTxt.setText(String.valueOf(counter*counter));
            }
        });


        backBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(CounterActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });


    }
}
