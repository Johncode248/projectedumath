package com.lions.edumath3;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class PoziomAlgebra extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.poziom_algebra);
    }

    public void onClickAlgebra(View view) {
        Intent intent = new Intent(this, Algebra.class);
        startActivity(intent);
    }

    public void onClickAlgebra2(View view) {
        Intent intent = new Intent(this, Algebra2.class);
        startActivity(intent);
    }
    public void onClickAlgebra3(View view) {
        Intent intent = new Intent(this, Algebra3.class);
        startActivity(intent);
    }
}
