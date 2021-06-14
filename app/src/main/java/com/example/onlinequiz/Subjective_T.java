package com.example.onlinequiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class Subjective_T extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_subjective__t);

        EditText desc;
        Button submit;

        desc = findViewById(R.id.editTextTextMultiLine6);
        submit = findViewById(R.id.button14);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //Get data from widgets
                String descriptionText = desc.getText().toString();

                //Create a model
                SubjectiveModel model = new SubjectiveModel(descriptionText);

                //Create a Firebase instance
                FirebaseDatabase database = FirebaseDatabase.getInstance();
                DatabaseReference myRef = database.getReference("Quiz");

                //uploading data
                DatabaseReference Subjective = myRef.child("Subjective").getRef();
                Subjective.push().setValue(model);

            }
        });



    }
    public void Marking(View v)
    {

        Intent intent= new Intent(this,Marking.class);
        startActivity(intent);
    }
}