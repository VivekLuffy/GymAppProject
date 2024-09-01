package com.example.gymapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class workoutplan extends AppCompatActivity {
    Button b1,b2,b3,b4,b5,b6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_workoutplan);
        b1=findViewById(R.id.chestbutton);
        b2=findViewById(R.id.backbutton);
        b3=findViewById(R.id.legsbutton);
        b4=findViewById(R.id.biscepsbutton);
        b5=findViewById(R.id.triscepbutton);
        b6=findViewById(R.id.shoulderbutton);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(workoutplan.this, ChestWork.class);
                startActivity(intent);
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(workoutplan.this, BackWork.class);
                startActivity(intent);
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(workoutplan.this, LegsWork.class);
                startActivity(intent);
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(workoutplan.this, BiscepsWork.class);
                startActivity(intent);
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(workoutplan.this, TriscepWork.class);
                startActivity(intent);
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(workoutplan.this, ShoulderWork.class);
                startActivity(intent);
            }
        });
    }




    public void chest(View view) {
        Intent intent=new Intent(workoutplan.this, ChestWork.class);
        startActivity(intent);
    }

    public void back(View view) {
        Intent intent=new Intent(workoutplan.this, BackWork.class);
        startActivity(intent);
    }
    public void biceps(View view) {
        Intent intent=new Intent(workoutplan.this, BiscepsWork.class);
        startActivity(intent);
    }
    public void legs(View view) {
        Intent intent=new Intent(workoutplan.this, LegsWork.class);
        startActivity(intent);
    }
    public void shoulder(View view) {
        Intent intent=new Intent(workoutplan.this, ShoulderWork.class);
        startActivity(intent);
    }
    public void triscep(View view) {
        Intent intent=new Intent(workoutplan.this, TriscepWork.class);
        startActivity(intent);
    }
}