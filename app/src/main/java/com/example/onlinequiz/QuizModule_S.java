package com.example.onlinequiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class QuizModule_S extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_module__s);
    }
    public void MCQS_S(View v) {

        Intent intent= new Intent(this,MCQS_S.class);
        startActivity(intent);
    }
    public void FITB_S(View v) {

        Intent intent= new Intent(this,FITB_S.class);
        startActivity(intent);
    }
    public void Subjective_S(View v) {

        Intent intent= new Intent(this,Subjective_S.class);
        startActivity(intent);
    }
    public void Columns_S(View v) {

        Intent intent= new Intent(this,Columns_S.class);
        startActivity(intent);
    }

}