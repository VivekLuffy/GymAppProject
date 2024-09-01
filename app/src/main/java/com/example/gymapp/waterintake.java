package com.example.gymapp;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class waterintake extends AppCompatActivity {

    private EditText weightInput;
    private Spinner activityLevelSpinner;
    private TextView resultTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_waterintake);

        weightInput = findViewById(R.id.weightInput);
        activityLevelSpinner = findViewById(R.id.activityLevelSpinner);
        Button calculateButton = findViewById(R.id.calculateButton);
        resultTextView = findViewById(R.id.resultTextView);

        calculateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculateWaterIntake();
            }
        });
    }

    private void calculateWaterIntake() {
        String weightStr = weightInput.getText().toString();
        if (!weightStr.isEmpty()) {
            float weight = Float.parseFloat(weightStr);
            String activityLevel = activityLevelSpinner.getSelectedItem().toString();

            float activityMultiplier = getActivityMultiplier(activityLevel);
            float waterIntake = weight * 35 * activityMultiplier; // Adjusted formula

            resultTextView.setText("You should drink " + waterIntake + " ml of water per day.");
        } else {
            resultTextView.setText("Please enter your weight.");
        }
    }

    private float getActivityMultiplier(String activityLevel) {
        switch (activityLevel) {
            case "Sedentary":
                return 1.0f;
            case "Lightly Active":
                return 1.2f;
            case "Moderately Active":
                return 1.4f;
            case "Very Active":
                return 1.6f;
            default:
                return 1.0f;
        }
    }
}
