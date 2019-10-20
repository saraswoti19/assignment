package com.example.assignment;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RadioButton;

import androidx.appcompat.app.AppCompatActivity;

public class linearlayout extends AppCompatActivity implements View.OnClickListener{

    RadioButton radioButton1, radioButton2, radioButton3;
    ImageView imageView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_linearlayout);

        radioButton1 = findViewById(R.id.rbSita);
        radioButton2 = findViewById(R.id.rbGita);
        radioButton3 = findViewById(R.id.rbRita);
        imageView = findViewById(R.id.ivShow);
        imageView = findViewById(R.id.iv1);
        imageView = findViewById(R.id.iv2);

        radioButton1.setOnClickListener(this);
        radioButton2.setOnClickListener (this);
        radioButton3.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch(view.getId())
        {
            case R.id.rbSita:
                imageView.setImageResource(R.drawable.sita);
                break;
            case R.id.rbGita:
                imageView.setImageResource(R.drawable.gita);
                break;
            case R.id.rbRita:
                imageView.setImageResource(R.drawable.rita);
                break;

        }
    }
}
