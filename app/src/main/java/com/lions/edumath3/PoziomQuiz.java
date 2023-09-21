package com.lions.edumath3;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class PoziomQuiz extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.poziom_quiz);
    }

    public void onClickquiz1(View view) {
        Intent intent = new Intent(this, quiz.class);
        startActivity(intent);
    }

    public void onClickquiz2(View view) {
        Intent intent = new Intent(this, quiz2.class);
        startActivity(intent);
    }
    public void onClickquiz3(View view) {
        Intent intent = new Intent(this, quiz3.class);
        startActivity(intent);
    }
}
