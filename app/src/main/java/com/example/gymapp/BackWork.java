package com.example.gymapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class BackWork extends AppCompatActivity {
    int[] newArray;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_back_work);

        newArray=new int[]{
                R.id.back1,R.id.back2,R.id.back3,R.id.back4,R.id.back5,R.id.back6
        };
    }

    public void ImageButtonClick(View view) {
        for(int i=0;i< newArray.length;i++){
            if(view.getId()==newArray[i]){
                int value=i+1;
                Log.i("FIRST",String.valueOf(value));
                Intent intent=new Intent(BackWork.this, back11.class);
                intent.putExtra("value",String.valueOf(value));
                startActivity(intent);
            }
        }
    }
}