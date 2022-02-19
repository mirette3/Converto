package com.example.convertoo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;

public class Temprture extends AppCompatActivity {
TextView t1,t3;
EditText e;
Button b;
RadioGroup g1,g2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_temprture);
        b=(Button) findViewById(R.id.buttons);
        e=(EditText) findViewById(R.id.edittext);
        g1 =(RadioGroup) findViewById(R.id.rg1);
        g2 =(RadioGroup) findViewById(R.id.rg2);
        t3 =(TextView) findViewById(R.id.textview3);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Double t = Double.parseDouble(e.getText().toString());
                if (g1.getCheckedRadioButtonId() == R.id.r1 && g2.getCheckedRadioButtonId() == R.id.r6) {
                    t = (9.0 / 5.0) * t + 32;

                    t3.setText(Double.toString(t) + " F");
                    t3.setBackgroundResource(R.color.blue);

                } else if(g1.getCheckedRadioButtonId() == R.id.r3 && g2.getCheckedRadioButtonId() == R.id.r4) {
                    t = (t - 32) * (5.0 / 9.0);

                    t3.setText(Double.toString(t) + " C");
                    t3.setBackgroundResource(R.color.yellow);
                }
                else if(g1.getCheckedRadioButtonId() == R.id.r1 && g2.getCheckedRadioButtonId() == R.id.r5){
                    t = t + 273.15;
                    t3.setText(Double.toString(t) + " K");
                    t3.setBackgroundResource(R.color.orange);

                }
                else if(g1.getCheckedRadioButtonId() == R.id.r3 && g2.getCheckedRadioButtonId() == R.id.r5){
                    t = (t + 459.67)* 5/9;
                    t3.setText(Double.toString(t) + " K");
                    t3.setBackgroundResource(R.color.orange);

                }
                else if(g1.getCheckedRadioButtonId() == R.id.r2 && g2.getCheckedRadioButtonId() == R.id.r6){
                    t = (t - 273.15) * 9/5 + 32;
                    t3.setText(Double.toString(t) + " F");
                    t3.setBackgroundResource(R.color.blue);

                }
                else if(g1.getCheckedRadioButtonId() == R.id.r2 && g2.getCheckedRadioButtonId() == R.id.r4){
                    t = t-  273.15;
                    t3.setText(Double.toString(t) + " C");
                    t3.setBackgroundResource(R.color.yellow);

                }
                else {
                    t3.setText("You must choose different Choices! ");
                    t3.setBackgroundResource(R.color.red);

                }

            }
        });

    }
}