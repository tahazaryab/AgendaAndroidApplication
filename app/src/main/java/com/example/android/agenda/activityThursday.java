package com.example.android.agenda;


import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;


public class activityThursday extends AppCompatActivity {




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thursday);


        // Get the widgets reference from XML layout
        final EditText editText = (EditText) findViewById(R.id.editText);
        final EditText editText2 = (EditText) findViewById(R.id.editText2);
        final EditText editText3 = (EditText) findViewById(R.id.editText3);
        final EditText editText4 = (EditText) findViewById(R.id.editText4);
        final EditText editText5 = (EditText) findViewById(R.id.editText5);
        final EditText editText7 = (EditText) findViewById(R.id.editText7);
        final EditText edittext10 = (EditText) findViewById(R.id.editText10);
        final CheckBox checkBox2 = (CheckBox) findViewById(R.id.checkBox2);
        final CheckBox checkBox3 = (CheckBox) findViewById(R.id.checkBox3);
        final CheckBox checkBox5 = (CheckBox) findViewById(R.id.checkBox5);
        final CheckBox checkBox6 = (CheckBox) findViewById(R.id.checkBox6);
        final CheckBox checkBox = (CheckBox) findViewById(R.id.checkBox);
        final CheckBox checkBox9 = (CheckBox) findViewById(R.id.checkBox9);
        final CheckBox checkbox10 = (CheckBox) findViewById(R.id.checkBox10);
        Button btn = (Button) findViewById(R.id.btn);

        btn.setOnClickListener(new View.OnClickListener() {
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

                if (checkBox2.isChecked()) {
                    checkBox2.setChecked(false);
                }
                if (checkBox.isChecked()) {
                    checkBox.setChecked(false);
                }
                if (checkBox3.isChecked()) {
                    checkBox3.setChecked(false);
                }
                if (checkBox5.isChecked()) {
                    checkBox5.setChecked(false);
                }
                if (checkBox6.isChecked()) {
                    checkBox6.setChecked(false);
                }
                if (checkBox9.isChecked()) {
                    checkBox9.setChecked(false);
                }
                if (checkbox10.isChecked()) {
                    checkbox10.setChecked(false);
                }


            }


        });


    };
}
