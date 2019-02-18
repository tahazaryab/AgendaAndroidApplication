package com.example.android.agenda;

import android.app.ActionBar;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

import com.example.android.agenda.R;

import java.text.NumberFormat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }
    public void mainactivity2(View view){
        Intent intent=new Intent(MainActivity.this, mainactivity2.class);
        startActivity(intent);
    }



         public void events(View view){
                Intent i = new Intent(this, events.class);
                startActivity(i);





            }
}



