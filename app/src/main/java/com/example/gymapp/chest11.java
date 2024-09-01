package com.example.gymapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.widget.Button;
import android.widget.TextView;

public class chest11 extends AppCompatActivity {
    String buttonvalue;
    Button startbar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chest11);
        Intent intent = getIntent();
        buttonvalue = intent.getStringExtra("value");

        int intvalue = Integer.valueOf(buttonvalue);

        switch (intvalue) {
            case 1:
                setContentView(R.layout.activity_chestactivity1);


                break;
            case 2:
                setContentView(R.layout.chestact2);
                break;
            case 3:
                setContentView(R.layout.chestact3);
                break;
            case 4:
                setContentView(R.layout.chestact4);
                break;
            case 5:
                setContentView(R.layout.chestact5);
                break;
            case 6:
                setContentView(R.layout.chestact6);
                break;
            case 7:
                setContentView(R.layout.chestact7);
                break;
            case 8:
                setContentView(R.layout.chestact8);
                break;


        }


    }
}
