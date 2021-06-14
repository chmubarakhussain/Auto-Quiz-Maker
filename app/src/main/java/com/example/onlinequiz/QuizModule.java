package com.example.onlinequiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class QuizModule extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_module);
    }
    public void MCQ(View v)
    {

        Intent intent= new Intent(this,MCQ.class);
        startActivity(intent);
    }
    public void FITB_T(View v)
    {

        Intent intent= new Intent(this,FITB_T.class);
        startActivity(intent);
    }

    public void Subjective_T(View v)
    {

        Intent intent= new Intent(this,Subjective_T.class);
        startActivity(intent);
    }

    public void Column_T(View v)
    {

        Intent intent= new Intent(this,Column_T.class);
        startActivity(intent);
    }

}