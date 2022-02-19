package com.example.convertoo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;

public class Length extends AppCompatActivity {
    TextView t1,t3;
    EditText e;
    Button b;
    RadioGroup g1,g2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_length);
        b=(Button) findViewById(R.id.buttons);
        e=(EditText) findViewById(R.id.edittext);
        g1 =(RadioGroup) findViewById(R.id.rg1);
        g2 =(RadioGroup) findViewById(R.id.rg2);
        t3 =(TextView) findViewById(R.id.textview3);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Double t = Double.parseDouble(e.getText().toString());
                if (g1.getCheckedRadioButtonId() == R.id.r1 && g2.getCheckedRadioButtonId() == R.id.r22) {
                    t *= 1000;

                    t3.setText(Double.toString(t) + " m");
                } else if(g1.getCheckedRadioButtonId() == R.id.r1 && g2.getCheckedRadioButtonId() == R.id.r33) {
                    t *=  100000;

                    t3.setText(Double.toString(t) + " cm");
                }
                else if(g1.getCheckedRadioButtonId() == R.id.r1 && g2.getCheckedRadioButtonId() == R.id.r44){
                    t = t *1093.61;
                    t3.setText(Double.toString(t) + " yard");
                }
                else if(g1.getCheckedRadioButtonId() == R.id.r1 && g2.getCheckedRadioButtonId() == R.id.r55){
                    t *= 39370.1;
                    t3.setText(Double.toString(t) + " inch");
                }
                else if(g1.getCheckedRadioButtonId() == R.id.r2 && g2.getCheckedRadioButtonId() == R.id.r11){
                    t /=1000;
                    t3.setText(Double.toString(t) + " km");
                }
                else if(g1.getCheckedRadioButtonId() == R.id.r2 && g2.getCheckedRadioButtonId() == R.id.r33){
                    t *= 100;
                    t3.setText(Double.toString(t) + " cm");
                }
                else if(g1.getCheckedRadioButtonId() == R.id.r2 && g2.getCheckedRadioButtonId() == R.id.r44){
                    t *= 1.094;
                    t3.setText(Double.toString(t) + " yard");
                }
                else if(g1.getCheckedRadioButtonId() == R.id.r2 && g2.getCheckedRadioButtonId() == R.id.r55){
                    t *= 39.37;
                    t3.setText(Double.toString(t) + " inch");
                }
                else if(g1.getCheckedRadioButtonId() == R.id.r3 && g2.getCheckedRadioButtonId() == R.id.r11){
                    t /= 100000;
                    t3.setText(Double.toString(t) + " km");
                }
                else if(g1.getCheckedRadioButtonId() == R.id.r3 && g2.getCheckedRadioButtonId() == R.id.r22){
                    t /= 100;
                    t3.setText(Double.toString(t) + " m");
                }
                else if(g1.getCheckedRadioButtonId() == R.id.r3 && g2.getCheckedRadioButtonId() == R.id.r44){
                    t /= 91.44;
                    t3.setText(Double.toString(t) + " yard");
                }
                  else if(g1.getCheckedRadioButtonId() == R.id.r3 && g2.getCheckedRadioButtonId() == R.id.r55){
                    t /= 2.54;
                    t3.setText(Double.toString(t) + " inch");
                }
                  else if(g1.getCheckedRadioButtonId() == R.id.r4 && g2.getCheckedRadioButtonId() == R.id.r11){
                    t /= 1094;
                    t3.setText(Double.toString(t) + " km");
                }else if(g1.getCheckedRadioButtonId() == R.id.r4&& g2.getCheckedRadioButtonId() == R.id.r22){
                    t /= 1.094;
                    t3.setText(Double.toString(t) + " m");
                }else if(g1.getCheckedRadioButtonId() == R.id.r4 && g2.getCheckedRadioButtonId() == R.id.r33){
                    t *= 91.44;
                    t3.setText(Double.toString(t) + " cm");
                }else if(g1.getCheckedRadioButtonId() == R.id.r4 && g2.getCheckedRadioButtonId() == R.id.r55){
                    t *= 36;
                    t3.setText(Double.toString(t) + " inch");
                }

                  else if(g1.getCheckedRadioButtonId() == R.id.r5 && g2.getCheckedRadioButtonId() == R.id.r11){
                    t /= 39370;
                    t3.setText(Double.toString(t) + " km");
                }else if(g1.getCheckedRadioButtonId() == R.id.r5&& g2.getCheckedRadioButtonId() == R.id.r22){
                    t /= 39.37;
                    t3.setText(Double.toString(t) + " m");
                }else if(g1.getCheckedRadioButtonId() == R.id.r5 && g2.getCheckedRadioButtonId() == R.id.r33){
                    t *= 2.54;
                    t3.setText(Double.toString(t) + " cm");
                }else if(g1.getCheckedRadioButtonId() == R.id.r5 && g2.getCheckedRadioButtonId() == R.id.r44){
                    t /= 36;
                    t3.setText(Double.toString(t) + " yard");
                }

                else {
                    t3.setText("You must choose different Choices! ");
                    t3.setBackgroundResource(R.color.red);

                }

            }
        });
    }
}