package com.lions.edumath3;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class PoziomProcenty extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.poziom_procenty);
    }

    public void onClickProcenty(View view) {
        Intent intent = new Intent(this, Procenty.class);
        startActivity(intent);
    }

    public void onClickProcenty2(View view) {
        Intent intent = new Intent(this, Procenty2.class);
        startActivity(intent);
    }
    public void onClickProcenty3(View view) {
        Intent intent = new Intent(this, Procenty3.class);
        startActivity(intent);
    }
}
