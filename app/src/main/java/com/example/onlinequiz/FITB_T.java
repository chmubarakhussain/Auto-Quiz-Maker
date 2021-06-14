package com.example.onlinequiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class FITB_T extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_f_i_t_b__t);

        EditText desc = findViewById(R.id.editTextTextMultiLine);
        EditText ans = findViewById(R.id.editTextTextPersonName);
        Button submit = findViewById(R.id.button11);


        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //Get the data from widgets
                String descriptionText = desc.getText().toString();
                String answerText = ans.getText().toString();

                //Creating model
                FITBModel model = new FITBModel(descriptionText, answerText);

                //Getting firebase instance
                FirebaseDatabase database = FirebaseDatabase.getInstance();
                DatabaseReference myRef = database.getReference("Quiz");

                //uploading data
                DatabaseReference FITB = myRef.child("FITB").getRef();
                FITB.push().setValue(model);
            }
        });
    }

}