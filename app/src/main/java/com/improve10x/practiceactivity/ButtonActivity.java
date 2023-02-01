package com.improve10x.practiceactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class ButtonActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button);
        addMe();
    }
    private void addMe(){

        Button addBtn = findViewById(R.id.button_btn);
        addBtn.setOnClickListener(v -> {
                    EditText edittext = findViewById(R.id.editText_txt);
                    EditText editText = findViewById(R.id.edittext_Txt);
            String value1 = editText.getText().toString();
            String value2 = edittext.getText().toString();
           String result = add(value1,value2);
            Toast.makeText(this, "sum : " + result , Toast.LENGTH_SHORT).show();
        });
    }
    public  String add(String value1, String value2){
        int number1 = Integer.parseInt(value1);
        int number2 = Integer.parseInt(value2);
        int sum = number1 + number2 ;
        return String.valueOf(sum);

    }
        }


