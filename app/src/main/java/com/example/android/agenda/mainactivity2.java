package com.example.android.agenda;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import com.example.android.agenda.R;

import java.text.NumberFormat;

public class mainactivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mainactivity2);
    }

    public void activityMonday(View view){
        Intent i = new Intent(this, activityMonday.class);
        startActivity(i);
    }
    public void activityTuesday(View view){
        Intent i = new Intent(this, activityTuesday.class);
        startActivity(i);
    }
    public void activityWednesday(View view){
        Intent i = new Intent(this, activityWednesday.class);
        startActivity(i);
    }
    public void activityThursday(View view){
        Intent i = new Intent(this, activityThursday.class);
        startActivity(i);
    }
    public void activityFriday(View view){
        Intent i = new Intent(this, activityFriday.class);
        startActivity(i);
    }
    public void events(View view) {
        Intent i = new Intent(this, events.class);
        startActivity(i);
    }
}
