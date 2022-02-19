package com.example.convertoo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Clothes extends AppCompatActivity {
    Button women, men;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_clothes);

        women = (Button) findViewById(R.id.butt1);
        men = (Button) findViewById(R.id.butt2);

        women.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent10 = new Intent(Clothes.this,Women.class);
                startActivity(intent10);
                finish();
            }
        });

        men.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent11 = new Intent(Clothes.this,Men.class);
                startActivity(intent11);
                finish();
            }
        });

    }
}