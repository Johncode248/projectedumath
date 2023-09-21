package com.lions.edumath3;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class PoziomPrawdopodobienstwo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.poziom_prawdopodobienstwo);
    }

    public void onClickPraw1(View view) {
        Intent intent = new Intent(this, Prawdopodobieństwo.class);
        startActivity(intent);
    }

    public void onClickPraw2(View view) {
        Intent intent = new Intent(this, Prawdopodobienstwo2.class);
        startActivity(intent);
    }
    public void onClickPraw3(View view) {
        Intent intent = new Intent(this, Prawdopodobienstwo3.class);
        startActivity(intent);
    }
}

