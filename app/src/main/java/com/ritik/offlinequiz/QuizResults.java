package com.ritik.offlinequiz;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class QuizResults extends AppCompatActivity {
    AppCompatButton startNewQuizBtn;
    TextView correctAnswer,inCorrectAnswer;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_results);

        startNewQuizBtn=findViewById(R.id.startNewQuizBtn);
        correctAnswer =findViewById(R.id.correctAnswers);
        inCorrectAnswer =findViewById(R.id.incorrectAnswers);

        int getCorrectAnswers =getIntent().getIntExtra("correct",0);
        int getInCorrectAnswers =getIntent().getIntExtra("inCorrect",0);

        correctAnswer.setText(String.valueOf(getCorrectAnswers));
        inCorrectAnswer.setText(String.valueOf(getInCorrectAnswers));

        startNewQuizBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(QuizResults.this,MainActivity.class));
                finish();
            }
        });
    }
    public void onBackPressed(){
        startActivity(new Intent(QuizResults.this,MainActivity.class));
        finish();
    }
}