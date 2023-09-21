package com.lions.edumath3;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class Kategorieb extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.kategorieb);
    }

    public void onClickAlgebra(View view) {
        Intent intent = new Intent(this, PoziomAlgebra.class);
        startActivity(intent);
    }

    public void onClickLiczbywymierne(View view) {
        Intent intent = new Intent(this, PoziomQuiz.class);
        startActivity(intent);
    }

    public void onClickPotegi(View view) {
        Intent intent = new Intent(this, PoziomPotegi.class);
        startActivity(intent);
    }

    public void onClickProcenty(View view) {
        Intent intent = new Intent(this, Procenty.class);
        startActivity(intent);
    }

    public void onClickPrawdopodobienstwa(View view) {
        Intent intent = new Intent(this, Prawdopodobieństwo.class);
        startActivity(intent);
    }
    public void onClickZadTekst(View view) {
        Intent intent = new Intent( this, PoziomZadaniaTekstowe.class);
        startActivity(intent);
    }
    public void onClickLosowee(View view) {
        Intent intent = new Intent( this, PoziomLosowe.class);
        startActivity(intent);
    }
    public void onClickPoziomPrawdopodobienstwa(View view) {
        Intent intent = new Intent( this, PoziomPrawdopodobienstwo.class);
        startActivity(intent);
    }
    public void onClickPoziomProcenty(View view) {
        Intent intent = new Intent( this, PoziomProcenty.class);
        startActivity(intent);
    }
    public void onClickPoziomPotegi(View view) {
        Intent intent = new Intent( this, PoziomPotegi.class);
        startActivity(intent);
    }
}



