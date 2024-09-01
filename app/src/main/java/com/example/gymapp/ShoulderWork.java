package com.example.gymapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class ShoulderWork extends AppCompatActivity {
    int[] newArray;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shoulder_work);

        newArray=new int[]{
                R.id.shoulder1,R.id.shoulder2,R.id.shoulder3,R.id.shoulder4,R.id.shoulder5,R.id.shoulder6
        };
    }

    public void ImageButtonClick(View view) {
        for(int i=0;i< newArray.length;i++){
            if(view.getId()==newArray[i]){
                int value=i+1;
                Log.i("FIRST",String.valueOf(value));
                Intent intent=new Intent(ShoulderWork.this, shoulder11.class);
                intent.putExtra("value",String.valueOf(value));
                startActivity(intent);
            }
        }
    }
}