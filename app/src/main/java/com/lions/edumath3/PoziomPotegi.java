package com.lions.edumath3;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class PoziomPotegi extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.poziom_potegi);
    }

    public void onClickPotegi(View view) {
        Intent intent = new Intent(this, Potegi.class);
        startActivity(intent);
    }

    public void onClickPotegi2(View view) {
        Intent intent = new Intent(this, Potegi2.class);
        startActivity(intent);
    }
    public void onClickPotegi3(View view) {
        Intent intent = new Intent(this, Potegi3.class);
        startActivity(intent);
    }
}
