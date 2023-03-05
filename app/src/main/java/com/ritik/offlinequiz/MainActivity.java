package com.ritik.offlinequiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private String  selectedTopicName="";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LinearLayout java =findViewById(R.id.javaLayout);
        LinearLayout php =findViewById(R.id.phpLayout);
        LinearLayout  html =findViewById(R.id.htmlLayout);
        LinearLayout android =findViewById(R.id.androidLayout);

        Button startBtn =findViewById(R.id.startQuizBtn);
        java.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                selectedTopicName ="java";

                java.setBackgroundResource(R.drawable.round_back_white_stroke10);
                php.setBackgroundResource(R.drawable.round_back_white10);
                html.setBackgroundResource(R.drawable.round_back_white10);
                android.setBackgroundResource(R.drawable.round_back_white10);

            }
        });

        php.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                selectedTopicName= "php";

                php.setBackgroundResource(R.drawable.round_back_white_stroke10);
                java.setBackgroundResource(R.drawable.round_back_white10);
                html.setBackgroundResource(R.drawable.round_back_white10);
                android.setBackgroundResource(R.drawable.round_back_white10);
            }
        });

        html.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                selectedTopicName= "html";

                html.setBackgroundResource(R.drawable.round_back_white_stroke10);
                java.setBackgroundResource(R.drawable.round_back_white10);
                php.setBackgroundResource(R.drawable.round_back_white10);
                android.setBackgroundResource(R.drawable.round_back_white10);
            }
        });

        android.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                selectedTopicName= "android";

                android.setBackgroundResource(R.drawable.round_back_white_stroke10);
                java.setBackgroundResource(R.drawable.round_back_white10);
                php.setBackgroundResource(R.drawable.round_back_white10);
                html.setBackgroundResource(R.drawable.round_back_white10);
            }
        });

        startBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (selectedTopicName.isEmpty()){
                    Toast.makeText(MainActivity.this, "Please Select The Topic!", Toast.LENGTH_LONG).show();
                }else{
                    Intent intent =new Intent(MainActivity.this,QuizActivity.class);
                    intent.putExtra("selectedTopic",selectedTopicName);
                    startActivity(intent);
                }
            }
        });
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }
}