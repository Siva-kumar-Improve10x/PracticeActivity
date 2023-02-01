package com.improve10x.practiceactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class RadioButtonActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_radio_button);
        radioButton();
    }
    private void radioButton (){
        Button selectBtn = findViewById(R.id.select_btn);
        selectBtn.setOnClickListener(v -> {
            RadioGroup gender = findViewById(R.id.gender_rg);
            int selectedGroup = gender.getCheckedRadioButtonId();
            RadioButton selectedGender = findViewById(selectedGroup);
            String genderId = selectedGender.getText().toString();
            Toast.makeText(this, genderId, Toast.LENGTH_SHORT).show();
        });


    }
}
