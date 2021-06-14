package com.example.onlinequiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class Column_T extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_column__t);
        EditText First, Second, Correct;
        Button submit;

        First = findViewById(R.id.editTextTextMultiLine8);
        Second = findViewById(R.id.editTextTextMultiLine9);
        Correct = findViewById(R.id.editTextTextMultiLine10);
        submit = findViewById(R.id.button16);


        //On submit Action
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //Getting info from widgets
                String firstText = First.getText().toString();
                String secondText = Second.getText().toString();
                String correctText = Correct.getText().toString();

                //Creating the model
                ColumnModel model = new ColumnModel(firstText, secondText, correctText);

                //Creating Firebase Instance
                FirebaseDatabase database = FirebaseDatabase.getInstance();
                DatabaseReference myRef = database.getReference("Quiz");

                DatabaseReference Column = myRef.child("Column").getRef();
                Column.push().setValue(model);

            }
        });

    }

}