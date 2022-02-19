package com.example.convertoo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

public class Men extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    Spinner spin;
    TextView t1,t2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_men);
        t1 = (TextView) findViewById(R.id.t);
        t2 = (TextView) findViewById(R.id.t2);

        //Getting the instance of Spinner and applying OnItemSelectedListener on it
        spin = (Spinner) findViewById(R.id.spinner);
        //Creating the ArrayAdapter instance having the country list
        ArrayAdapter<CharSequence> arrayAdapter = ArrayAdapter.createFromResource(this, R.array.sizes, android.R.layout.simple_spinner_item);
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        //Setting the ArrayAdapter data on the Spinner
        spin.setAdapter(arrayAdapter);
        spin.setOnItemSelectedListener(this);
    }
    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        switch (position) {
            case 0:
                t1.setText(" " );
                break;

            case 1:
                t1.setText(" UK      : 32    "+" USA     : 32 "  +"  Europen : 42" );
                break;
            case 2:
                t1.setText(" UK      : 34    "+" USA     : 34 "  +"  Europen : 44" );
                t2.setText(" UK      : 36    "+" USA     : 36 "  +"  Europen : 46" );

                break;
            case 3:
                t1.setText(" UK      : 38    "+" USA     : 38 "  +"  Europen : 48" );
                t2.setText(" UK      : 40    "+" USA     : 40 "  +"  Europen : 50" );

                break;
            case 4:
                t1.setText(" UK      : 42    "+" USA     : 42 "  +"  Europen : 52" );
                t2.setText(" UK      : 44    "+" USA     : 44 "  +"  Europen : 54" );
                break;
            case 5:
                t1.setText(" UK      : 46    "+" USA     : 46 "  +"  Europen : 56" );
                break;
            case 6:
                t1.setText(" UK      : 48    "+" USA     : 48 "  +"  Europen : 58" );
                break;
        }

    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}