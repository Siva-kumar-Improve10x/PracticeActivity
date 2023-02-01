package com.improve10x.practiceactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.widget.TimePicker;

public class Time_PickerActivity extends AppCompatActivity {
    TimePicker timePickerTp;
    TextView currentTimeTxt;
    Button changeTimeBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_time_picker);
         timePickerTp = findViewById(R.id.timepicker_tp);
         currentTimeTxt = findViewById(R.id.currenttime_txt);
         changeTimeBtn = findViewById(R.id.changetime_btn);
         displayCurrentTime();
         handleChangeTimeBtn();

    }

    private void displayCurrentTime() {
        String selectedTime = getSelectedTime();
        currentTimeTxt.setText("Current Time :" + selectedTime);

    }

    private void handleChangeTimeBtn() {
        changeTimeBtn.setOnClickListener(v -> {
            String selectedTime = getSelectedTime();
            currentTimeTxt.setText("Change Time :" + selectedTime);
        }  );


    }
    public String getSelectedTime(){
        int minute = timePickerTp.getCurrentMinute();
        int hour = timePickerTp.getCurrentHour();
        String selectedTime = createTime(minute,hour);
        return selectedTime;
    }

    private String createTime(int minute, int hour) {
        return hour + " : " + minute ;
    }
}