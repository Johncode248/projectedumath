package com.lions.edumath3;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ActivityMain extends AppCompatActivity {

    Button link;
    TextView tel, lakss;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tel = findViewById(R.id.lolo);
        lakss = findViewById(R.id.lal13);

        tel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                golink("https://doc-hosting.flycricket.io/edu-math-e8-privacy-policy/b10d9517-9335-47e9-afe7-bdc074dc0022/privacy");
            }
            private void golink(String s) {
                Uri uri = Uri.parse(s);
                startActivity(new Intent(Intent.ACTION_VIEW,uri));
            }
        });
        lakss.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                golink("https://doc-hosting.flycricket.io/edu-math-e8-terms-of-use/e34341c5-1e53-45e7-b97e-6eb0e615fbae/terms");
            }
        });



    }


        public void onClick123(View view){
        golink("https://doc-hosting.flycricket.io/edu-math-privacy-policy/b025d1e4-5812-4b68-9860-b102bb20de2f/privacy");
    }










    public void onClickzaczynamy(View view) {
        Intent intent = new Intent(this, Kategorieb.class);
        startActivity(intent);
    }
    private void golink(String s) {
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));
    }
}


