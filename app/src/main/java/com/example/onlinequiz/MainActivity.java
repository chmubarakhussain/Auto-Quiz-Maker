package com.example.onlinequiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void TeacherLogin(View v) {

        Intent intent= new Intent(this,TeacherLogin.class);
        startActivity(intent);
    }


    public void Student_login(View v) {

        Intent intent= new Intent(this,Student_login.class);
        startActivity(intent);
    }

}