package com.improve10x.practiceactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;
import android.widget.ToggleButton;

public class ToggleButtonActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toggle_button);
        handleOver();
    }

    private void handleOver() {
        ToggleButton toggle1btn = findViewById(R.id.toggle1_btn);
        ToggleButton toggleButton2 = findViewById(R.id.toggle2_btn);
        Button submitBtn = findViewById(R.id.submit_btn);
        submitBtn.setOnClickListener(v -> {
            String toggle1Status = toggle1btn.getText().toString();
            String toggle2Status = toggleButton2.getText().toString();
            String result = getStatus(toggle1Status, toggle2Status);
            Toast.makeText(this, result, Toast.LENGTH_LONG).show();
        });
    }

    public String getStatus(String toggle1Status, String toggle2Status) {
        StringBuilder result = new StringBuilder();
        result.append("ToggleButton1 :");
        result.append(toggle1Status);
        result.append("\nToggleButton2 :");
        result.append(toggle2Status);
        return String.valueOf(result);


    }
}
