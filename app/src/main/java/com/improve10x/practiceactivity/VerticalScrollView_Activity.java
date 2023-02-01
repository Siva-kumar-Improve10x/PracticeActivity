package com.improve10x.practiceactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class VerticalScrollView_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_verctial_scroll_view);
        Toast.makeText(this, "Paduko Paduko le", Toast.LENGTH_SHORT).show();
    }
}