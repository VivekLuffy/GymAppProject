package com.example.gymapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.widget.Button;
import android.widget.TextView;

public class back11 extends AppCompatActivity {
    String buttonvalue;
    Button startbar;
    private CountDownTimer countDownTimer;
    TextView mtextview;
    private boolean MTimeRunning;
    private long MTimeLeftinmills;
    Button b1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chest11);
        Intent intent = getIntent();
        buttonvalue = intent.getStringExtra("value");

        int intvalue = Integer.valueOf(buttonvalue);

        switch (intvalue) {
            case 1:
                setContentView(R.layout.backact1);


                break;
            case 2:
                setContentView(R.layout.backact2);
                break;
            case 3:
                setContentView(R.layout.backact3);
                break;
            case 4:
                setContentView(R.layout.backact4);
                break;
            case 5:
                setContentView(R.layout.backact5);
                break;
            case 6:
                setContentView(R.layout.backact6);
                break;



        }


    }
}
