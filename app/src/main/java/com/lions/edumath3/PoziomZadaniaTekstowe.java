package com.lions.edumath3;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class PoziomZadaniaTekstowe extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.poziom_zadaniatekstowe);
    }

    public void onClickzad1(View view) {
        Intent intent = new Intent(this, ZadaniaTekstowe.class);
        startActivity(intent);
    }

    public void onClickzad2(View view) {
        Intent intent = new Intent(this, ZadaniaTekstowe2.class);
        startActivity(intent);
    }
    public void onClickzad3(View view) {
        Intent intent = new Intent(this, ZadaniaTekstowe3.class);
        startActivity(intent);
    }
}
