package com.improve10x.practiceactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.Toast;

public class RatingbarActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ratingbar);
        RatingBar ratingBar = findViewById(R.id.rating_bar);
        Button submitBar = findViewById(R.id.submit_btn);

       submitBar .setOnClickListener(v -> {
           String rating = String.valueOf(ratingBar.getRating());
           Toast.makeText(RatingbarActivity.this, rating, Toast.LENGTH_LONG).show();


       });

            }



    }


