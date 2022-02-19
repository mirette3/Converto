package com.example.convertoo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;

public class Mass extends AppCompatActivity {
    TextView t1,t3;
    EditText e;
    Button b;
    RadioGroup g1,g2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mass);
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
                    t *= 1000 ;

                    t3.setText(Double.toString(t) + " Kg");

                } else if (g1.getCheckedRadioButtonId() == R.id.r1 && g2.getCheckedRadioButtonId() == R.id.r33) {
                    t *=1000000 ;

                    t3.setText(Double.toString(t) + " g");
                }
                else if (g1.getCheckedRadioButtonId() == R.id.r1 && g2.getCheckedRadioButtonId() == R.id.r44) {
                    t *=2204.62 ;

                    t3.setText(Double.toString(t) + " Ib");

                }
                else if (g1.getCheckedRadioButtonId() == R.id.r2 && g2.getCheckedRadioButtonId() == R.id.r11) {
                    t /=1000 ;

                    t3.setText(Double.toString(t) + " Tonne");

                }
                else if (g1.getCheckedRadioButtonId() == R.id.r2 && g2.getCheckedRadioButtonId() == R.id.r33) {
                    t *=1000 ;

                    t3.setText(Double.toString(t) + " g");

                }
                else if (g1.getCheckedRadioButtonId() == R.id.r2 && g2.getCheckedRadioButtonId() == R.id.r44) {
                    t *=2.205 ;

                    t3.setText(Double.toString(t) + " Ib");

                }
                else if (g1.getCheckedRadioButtonId() == R.id.r3 && g2.getCheckedRadioButtonId() == R.id.r11) {
                    t /=1000000 ;

                    t3.setText(Double.toString(t) + " Tonne");

                }

                else if (g1.getCheckedRadioButtonId() == R.id.r3 && g2.getCheckedRadioButtonId() == R.id.r22) {
                    t /= 1000 ;

                    t3.setText(Double.toString(t) + " Kg");

                }
                else if (g1.getCheckedRadioButtonId() == R.id.r3 && g2.getCheckedRadioButtonId() == R.id.r44) {
                    t /=454 ;

                    t3.setText(Double.toString(t) + " Ib");

                }
                 else if (g1.getCheckedRadioButtonId() == R.id.r4 && g2.getCheckedRadioButtonId() == R.id.r11) {
                    t /=2205 ;

                    t3.setText(Double.toString(t) + " Tonne");

                }
                 else if (g1.getCheckedRadioButtonId() == R.id.r4 && g2.getCheckedRadioButtonId() == R.id.r22) {
                    t /=2.205 ;

                    t3.setText(Double.toString(t) + " Kg");

                }
                else if (g1.getCheckedRadioButtonId() == R.id.r4 && g2.getCheckedRadioButtonId() == R.id.r33) {
                    t *=454 ;

                    t3.setText(Double.toString(t) + " g");

                }


                else {
                    t3.setText("You must choose different Choices! ");
                    t3.setBackgroundResource(R.color.red);

                }

            }
        });
    }
}