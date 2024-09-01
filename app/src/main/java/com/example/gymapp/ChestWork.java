package com.example.gymapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class ChestWork extends AppCompatActivity {
 int[] newArray;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chest_work);

        newArray=new int[]{
                R.id.chest1,R.id.chest2,R.id.chest3,R.id.chest4,R.id.chest5,R.id.chest6,R.id.chest7,R.id.chest8
        };
    }

    public void ImageButtonClick(View view) {
        for(int i=0;i< newArray.length;i++){
            if(view.getId()==newArray[i]){
                int value=i+1;
                Log.i("FIRST",String.valueOf(value));
                Intent intent=new Intent(ChestWork.this, chest11.class);
                intent.putExtra("value",String.valueOf(value));
                startActivity(intent);
            }
        }
    }
}