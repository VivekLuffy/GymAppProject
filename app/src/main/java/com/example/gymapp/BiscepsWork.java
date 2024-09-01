package com.example.gymapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class BiscepsWork extends AppCompatActivity {
    int[] newArray;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bisceps_work);

        newArray=new int[]{
                R.id.biscep1,R.id.biscep2,R.id.biscep3,R.id.biscep4,R.id.biscep5,R.id.biscep6
        };
    }

    public void ImageButtonClick(View view) {
        for(int i=0;i< newArray.length;i++){
            if(view.getId()==newArray[i]){
                int value=i+1;
                Log.i("FIRST",String.valueOf(value));
                Intent intent=new Intent(BiscepsWork.this, biscep11.class);
                intent.putExtra("value",String.valueOf(value));
                startActivity(intent);
            }
        }
    }
}