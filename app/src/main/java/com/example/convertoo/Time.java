package com.example.convertoo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class Time extends AppCompatActivity {
   Button button;
   EditText editText;
   RadioGroup radioGroup1 , radioGroup2;
   TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_time);
        button=(Button) findViewById(R.id.buttons);
        editText =(EditText) findViewById(R.id.edittext);
        radioGroup1=(RadioGroup) findViewById(R.id.rg1);
        radioGroup2=(RadioGroup) findViewById(R.id.rg2);
        textView=(TextView) findViewById(R.id.textview3);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Integer hour,minutes;
                Integer t = Integer.parseInt(editText.getText().toString());
               if(radioGroup1.getCheckedRadioButtonId() == R.id.r2) {
                    hour = t/60;
                    t = t % 60 ;
                    minutes = t /(60);
                    t = t % (60);
                    textView.setText(Integer.toString(hour)+" : "+Integer.toString(t)+" : "+Integer.toString(minutes));
                }
                else if(radioGroup1.getCheckedRadioButtonId() == R.id.r3 ){
                     hour= t / (60 * 60);
                     t = t % (60 * 60);
                     minutes = t /(60);
                     t = t % (60);
                    textView.setText(Integer.toString(hour)+" : "+Integer.toString(minutes)+" : "+Integer.toString(t));
                }else {
                    textView.setText("You must choose different Choices! ");
                }

            }
        });
    }
}