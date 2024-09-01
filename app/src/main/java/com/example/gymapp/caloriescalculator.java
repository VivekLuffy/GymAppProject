package com.example.gymapp;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class caloriescalculator extends AppCompatActivity {

    private EditText etAge, etWeight, etHeight;
    private Spinner spinnerActivityLevel;
    private Button btnCalculate;
    private TextView tvResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_caloriescalculator);

        etAge = findViewById(R.id.et_age);
        etWeight = findViewById(R.id.et_weight);
        etHeight = findViewById(R.id.et_height);
        spinnerActivityLevel = findViewById(R.id.spinner_activity_level);
        btnCalculate = findViewById(R.id.btn_calculate);
        tvResult = findViewById(R.id.tv_result);

        btnCalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculateCalories();
            }
        });
    }

    private void calculateCalories() {
        String ageStr = etAge.getText().toString();
        String weightStr = etWeight.getText().toString();
        String heightStr = etHeight.getText().toString();
        int activityLevel = spinnerActivityLevel.getSelectedItemPosition();

        if (!ageStr.isEmpty() && !weightStr.isEmpty() && !heightStr.isEmpty()) {
            int age = Integer.parseInt(ageStr);
            float weight = Float.parseFloat(weightStr);
            float height = Float.parseFloat(heightStr);

            double bmr = 10 * weight + 6.25 * height - 5 * age + 5;  // Male formula, use -161 for female
            double caloriesNeeded = bmr * getActivityMultiplier(activityLevel);
            tvResult.setText(String.format("Calories needed: %.2f", caloriesNeeded));
        } else {
            Toast.makeText(this, "Please enter all fields", Toast.LENGTH_SHORT).show();
        }
    }

    private double getActivityMultiplier(int activityLevel) {
        switch (activityLevel) {
            case 0: return 1.2;
            case 1: return 1.375;
            case 2: return 1.55;
            case 3: return 1.725;
            case 4: return 1.9;
            default: return 1.0;
        }
    }
}