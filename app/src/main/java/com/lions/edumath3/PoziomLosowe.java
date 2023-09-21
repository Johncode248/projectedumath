package com.lions.edumath3;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class PoziomLosowe extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.poziomlosowe);
    }

    public void onClicklos1(View view) {
        Intent intent = new Intent(this, LOSOWE.class);
        startActivity(intent);
    }

    public void onClicklos2(View view) {
        Intent intent = new Intent(this, LOSOWE2.class);
        startActivity(intent);
    }
    public void onClicklos3(View view) {
        Intent intent = new Intent(this, LOSOWE3.class);
        startActivity(intent);
    }
}

