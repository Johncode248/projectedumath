package com.lions.edumath3;

import android.app.AlertDialog;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Procenty2 extends AppCompatActivity implements View.OnClickListener {

    //Klasa preznaczona do kategorii quiz

    TextView totalQuestionsTextView;
    TextView questionTextView;
    Button ansA, ansB, ansC, ansD;
    Button submitbtn;

    int score = 0;
    int totalQuestions = QuestionProcenty2.question.length;
    int currentQuestionIndex = 0;
    String selectedAnswer = "";



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.procenty);

        totalQuestionsTextView = findViewById(R.id.total_question);
        questionTextView = findViewById(R.id.question);
        ansA = findViewById(R.id.ans_A);
        ansB = findViewById(R.id.ans_B);
        ansC = findViewById(R.id.ans_C);
        ansD = findViewById(R.id.ans_D);
        submitbtn = findViewById(R.id.submit_btn);

        ansA.setOnClickListener(this);
        ansB.setOnClickListener(this);
        ansC.setOnClickListener(this);
        ansD.setOnClickListener(this);
        submitbtn.setOnClickListener(this);

        totalQuestionsTextView.setText("Total questions :" + totalQuestions);

        loadNewQuestion();

    }
    @Override
    public void onClick(View v) {

        ansA.setBackgroundColor(Color.WHITE);
        ansB.setBackgroundColor(Color.WHITE);
        ansC.setBackgroundColor(Color.WHITE);
        ansD.setBackgroundColor(Color.WHITE);

        Button clickedButton = (Button) v;
        selectedAnswer = clickedButton.getText().toString();

        if (selectedAnswer.equals(QuestionProcenty2.correctAnswer[currentQuestionIndex])) {
            score++;
            clickedButton.setBackgroundColor(Color.GREEN);
        } else {
            clickedButton.setBackgroundColor(Color.RED);
            submitbtn.setBackgroundColor(Color.WHITE);


        }
        if (selectedAnswer.equals(QuestionProcenty2.correctAnswer[currentQuestionIndex])) {
            clickedButton.setBackgroundColor(Color.GREEN);

        }else {
            clickedButton.setBackgroundColor(Color.RED);
            submitbtn.setBackgroundColor(Color.WHITE);


        }
        if (selectedAnswer.equals(QuestionProcenty2.correctAnswer[currentQuestionIndex])) {
            clickedButton.setBackgroundColor(Color.GREEN);

        }else {
            clickedButton.setBackgroundColor(Color.RED);
            submitbtn.setBackgroundColor(Color.WHITE);



        }
        if(score > 5){
            score = 5;
        }
        if(score < 0) {
            score = 0;
        }






        if (clickedButton.getId() == R.id.submit_btn) {
            currentQuestionIndex++;
            loadNewQuestion();


        }

    }

    void loadNewQuestion() {

        if (currentQuestionIndex == totalQuestions) {
            finishQuiz();
            return;


        }

        questionTextView.setText(QuestionProcenty2.question[currentQuestionIndex]);
        ansA.setText(QuestionProcenty2.choices[currentQuestionIndex][0]);
        ansB.setText(QuestionProcenty2.choices[currentQuestionIndex][1]);
        ansC.setText(QuestionProcenty2.choices[currentQuestionIndex][2]);
        ansD.setText(QuestionProcenty2.choices[currentQuestionIndex][3]);

    }

    void finishQuiz() {
        String passStatus = "";
        if (score > totalQuestions * 0.59) {
            passStatus = "Zdałeś!";
        } else {
            passStatus = "Spróbuj jeszcze raz";
        }
        if (score > totalQuestions * 0.99) {
            passStatus = "Perfekcyjnie";
        }

        new AlertDialog.Builder(this)
                .setTitle(passStatus)
                .setMessage("Poprawnie " + score + " z " + totalQuestions)
                .setPositiveButton("Restart", ((dialog, which) -> restartQuiz()))
                .setPositiveButton("Powrót", ((dialog, which) -> goHome()))
                .setCancelable(false)
                .show();

    }

    void restartQuiz() {
        score = 0;
        currentQuestionIndex = 0;
        loadNewQuestion();

    }

    void goHome() {
        score = 0;
        currentQuestionIndex = 0;
        homeNow();

    }

    public void homeNow() {
        Intent intent = new Intent(this, Kategorieb.class);
        startActivity(intent);
    }
}
