package com.example.android.agenda;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.Calendar;

public class events extends AppCompatActivity {

    private static final String TAG  = "events";


    private TextView mDisplayDate;
    private DatePickerDialog.OnDateSetListener mDateSetListener;

    private TextView mDisplayDate2;
    private DatePickerDialog.OnDateSetListener mDateSetListener2;

    private TextView mDisplayDate3;
    private DatePickerDialog.OnDateSetListener mDateSetListener3;

    private TextView mDisplayDate4;
    private DatePickerDialog.OnDateSetListener mDateSetListener4;

    private TextView mDisplayDate5;
    private DatePickerDialog.OnDateSetListener mDateSetListener5;

    private TextView mDisplayDate6;
    private DatePickerDialog.OnDateSetListener mDateSetListener6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_events);

        mDisplayDate = (TextView)findViewById(R.id.tvDate);
        mDisplayDate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Calendar cal = Calendar.getInstance();
                int year = cal.get(Calendar.YEAR);
                int month = cal.get(Calendar.MONTH);
                int day = cal.get(Calendar.DAY_OF_MONTH);

                DatePickerDialog dialog = new DatePickerDialog(events.this, android.R.style.Theme_Black, mDateSetListener, year, month, day
                );
                dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                dialog.show();

            }
        });

        mDateSetListener = new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker view, int year, int month, int day) {
                month = month+1;
                Log.d(TAG, "mm/dd/yyyy: "+month+"/"+day+"/"+year);

                String date = month+"/"+day+"/"+year;
                mDisplayDate.setText(date);

            }
        };

        //==============================================================================================

        mDisplayDate2 = (TextView)findViewById(R.id.tvDate2);
        mDisplayDate2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Calendar cal = Calendar.getInstance();
                int year2 = cal.get(Calendar.YEAR);
                int month2 = cal.get(Calendar.MONTH);
                int day2 = cal.get(Calendar.DAY_OF_MONTH);

                DatePickerDialog dialog = new DatePickerDialog(events.this, android.R.style.Theme_Black, mDateSetListener2, year2, month2, day2
                );
                dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                dialog.show();

            }
        });

        mDateSetListener2= new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker view, int year2, int month2, int day2) {
                month2 = month2+1;
                Log.d(TAG, "mm/dd/yyyy: "+month2+"/"+day2+"/"+year2);

                String date = month2+"/"+day2+"/"+year2;
                mDisplayDate2.setText(date);

            }
        };

        //==============================================================================================

        mDisplayDate3 = (TextView)findViewById(R.id.tvDate3);
        mDisplayDate3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Calendar cal = Calendar.getInstance();
                int year3 = cal.get(Calendar.YEAR);
                int month3 = cal.get(Calendar.MONTH);
                int day3 = cal.get(Calendar.DAY_OF_MONTH);

                DatePickerDialog dialog = new DatePickerDialog(events.this, android.R.style.Theme_Black, mDateSetListener3, year3, month3, day3
                );
                dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                dialog.show();

            }
        });

        mDateSetListener3= new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker view, int year3, int month3, int day3) {
                month3 = month3+1;
                Log.d(TAG, "mm/dd/yyyy: "+month3+"/"+day3+"/"+year3);

                String date = month3+"/"+day3+"/"+year3;
                mDisplayDate3.setText(date);

            }
        };

        //==============================================================================================

        mDisplayDate4 = (TextView)findViewById(R.id.tvDate4);
        mDisplayDate4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Calendar cal4 = Calendar.getInstance();
                int year4 = cal4.get(Calendar.YEAR);
                int month4 = cal4.get(Calendar.MONTH);
                int day4 = cal4.get(Calendar.DAY_OF_MONTH);

                DatePickerDialog dialog = new DatePickerDialog(events.this, android.R.style.Theme_Black, mDateSetListener4, year4, month4, day4
                );
                dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                dialog.show();

            }
        });

        mDateSetListener4= new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker view, int year4, int month4, int day4) {
                month4 = month4+1;
                Log.d(TAG, "mm/dd/yyyy: "+month4+"/"+day4+"/"+year4);

                String date = month4+"/"+day4+"/"+year4;
                mDisplayDate4.setText(date);

            }
        };

        //==============================================================================================

        mDisplayDate5 = (TextView)findViewById(R.id.tvDate5);
        mDisplayDate5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Calendar cal = Calendar.getInstance();
                int year5 = cal.get(Calendar.YEAR);
                int month5 = cal.get(Calendar.MONTH);
                int day5 = cal.get(Calendar.DAY_OF_MONTH);

                DatePickerDialog dialog = new DatePickerDialog(events.this, android.R.style.Theme_Black, mDateSetListener5, year5, month5, day5
                );
                dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                dialog.show();

            }
        });

        mDateSetListener5= new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker view, int year5, int month5, int day5) {
                month5 = month5+1;
                Log.d(TAG, "mm/dd/yyyy: "+month5+"/"+day5+"/"+year5);

                String date = month5+"/"+day5+"/"+year5;
                mDisplayDate5.setText(date);

            }
        };

        mDisplayDate6 = (TextView)findViewById(R.id.tvDate6);
        mDisplayDate6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Calendar cal = Calendar.getInstance();
                int year6 = cal.get(Calendar.YEAR);
                int month6 = cal.get(Calendar.MONTH);
                int day6 = cal.get(Calendar.DAY_OF_MONTH);

                DatePickerDialog dialog = new DatePickerDialog(events.this, android.R.style.Theme_Black, mDateSetListener6, year6, month6, day6
                );
                dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                dialog.show();

            }
        });

        mDateSetListener6= new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker view, int year6, int month6, int day6) {
                month6 = month6+1;
                Log.d(TAG, "mm/dd/yyyy: "+month6+"/"+day6+"/"+year6);

                String date = month6+"/"+day6+"/"+year6;
                mDisplayDate6.setText(date);

            }
        };

        final EditText editText = (EditText) findViewById(R.id.editText);
        final EditText editText2 = (EditText) findViewById(R.id.editText2);
        final EditText editText3 = (EditText) findViewById(R.id.editText3);
        final EditText editText4 = (EditText) findViewById(R.id.editText4);
        final EditText editText5 = (EditText) findViewById(R.id.editText5);
        final EditText editText7 = (EditText) findViewById(R.id.editText7);
        final EditText edittext10 = (EditText) findViewById(R.id.editText10);
        final TextView tvdate = (TextView)findViewById(R.id.tvDate) ;
        final TextView tvdate2 = (TextView)findViewById(R.id.tvDate2) ;
        final TextView tvdate3 = (TextView)findViewById(R.id.tvDate3) ;
        final TextView tvdate4 = (TextView)findViewById(R.id.tvDate4) ;
        final TextView tvdate5 = (TextView)findViewById(R.id.tvDate5) ;
        final TextView tvdate6 = (TextView)findViewById(R.id.tvDate6) ;
        Button clearbutton = (Button) findViewById(R.id.clearbutton);

        clearbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Set the first EditText empty
                editText.setText("");

                // Clear the second EditText
                editText2.getText().clear();
                editText3.getText().clear();
                editText4.getText().clear();
                editText5.getText().clear();
                editText7.getText().clear();
                edittext10.getText().clear();
                tvdate.setText("");
                tvdate2.setText("");
                tvdate3.setText("");
                tvdate4.setText("");
                tvdate5.setText("");
                tvdate6.setText("");




            }


        });






    }
}
