package com.example.gymapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class TriscepWork extends AppCompatActivity {
    int[] newArray;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_triscep_work);

        newArray=new int[]{
                R.id.triscep1,R.id.triscep2,R.id.triscep3,R.id.triscep4,R.id.triscep5,R.id.triscep6
        };
    }

    public void ImageButtonClick(View view) {
        for(int i=0;i< newArray.length;i++){
            if(view.getId()==newArray[i]){
                int value=i+1;
                Log.i("FIRST",String.valueOf(value));
                Intent intent=new Intent(TriscepWork.this, triscep11.class);
                intent.putExtra("value",String.valueOf(value));
                startActivity(intent);
            }
        }
    }
}