package com.example.onlinequiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MCQ extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_m_c_q);

        Button submit;
        EditText desc;
        EditText choice1;
        EditText choice2;
        EditText choice3;

        submit = findViewById(R.id.button8);
        desc = findViewById(R.id.editTextTextMultiLine2);
        choice1 = findViewById(R.id.editTextTextMultiLine3);
        choice2 = findViewById(R.id.editTextTextMultiLine4);
        choice3 = findViewById(R.id.editTextTextMultiLine5);


        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String descriptionText = desc.getText().toString();
                String choice1Text = choice1.getText().toString();
                String choice2Text = choice2.getText().toString();
                String choice3Text = choice3.getText().toString();


                MCQModel model = new MCQModel(descriptionText, choice1Text, choice2Text, choice3Text, "A");

                // Write a message to the database
                FirebaseDatabase database = FirebaseDatabase.getInstance();
                DatabaseReference myRef = database.getReference("Quiz");



                DatabaseReference MCQ = myRef.child("MCQ").getRef();
                MCQ.push().setValue(model);
            }
        });




    }

    public void Marking(View v)
    {
        Intent intent= new Intent(this,Marking.class);
        startActivity(intent);
    }


}