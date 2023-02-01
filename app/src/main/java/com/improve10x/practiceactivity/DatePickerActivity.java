package com.improve10x.practiceactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;

public class DatePickerActivity extends AppCompatActivity {
    DatePicker datePikerDp;
    TextView currentDateTxt;
    Button updateBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_date_picker);
         datePikerDp = findViewById(R.id.datepiker_dp);
         currentDateTxt = findViewById(R.id.currentdate_txt);
         updateBtn = findViewById(R.id.update_btn);
        handleShowCurrentDate();
        handleChangeDateBtn();
    }

    private void handleChangeDateBtn() {
        String selectedDate = getSelectedDate();
        currentDateTxt.setText("Current Date : " + selectedDate);
    }
    private void handleShowCurrentDate() {
        updateBtn.setOnClickListener(v -> {
            String selectedDate = getSelectedDate();
            currentDateTxt.setText("Changed Date"+selectedDate);
        });
    }
    public String getSelectedDate(){
        int day = datePikerDp.getDayOfMonth();
        int month = datePikerDp.getMonth() + 1;
        int year = datePikerDp.getYear();
        String selectedDate = createDate(day, month, year);
        return selectedDate;

    }

    private String createDate(int day, int month, int year) {
        return day + "/" + month + "/" + year;

    }
}

