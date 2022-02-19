package com.example.convertoo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

public class Women extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
Spinner spin;
TextView t1,t2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_women);
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
                t2.setText(" ");
                break;

            case 1:
                t1.setText(" UK      : 4    "+" USA     : 1 "  +"  Europen : 32" );
                t2.setText(" UK      : 6 " + " USA     : 2 " +"    Europen : 34");
                break;
            case 2:
                t1.setText(" UK      : 8    "+" USA     : 4 "  +"  Europen : 36" );
                t2.setText(" UK      : 10 " + " USA     : 6 " +"    Europen : 38");
                break;
            case 3:
                t1.setText(" UK      : 12    "+" USA     : 8 "  +"  Europen : 40" );
                t2.setText(" UK      : 14 " + " USA     : 10 " +"    Europen : 42");
                break;
            case 4:
                t1.setText(" UK      : 16    "+" USA     : 12 "  +"  Europen : 44" );
                t2.setText(" UK      : 18 " + " USA     : 14 " +"    Europen : 46");
                break;
            case 5:
                t1.setText(" UK      : 20    "+" USA     : 16 "  +"  Europen : 48" );
                t2.setText(" UK      : 22 " + " USA     : 18 " +"    Europen : 50");
                break;
            case 6:
                t1.setText(" UK      : 24    "+" USA     : 20 "  +"  Europen : 52" );
                t2.setText(" UK      : 26 " + " USA     : 22 " +"    Europen : 54");
                break;
        }

    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}