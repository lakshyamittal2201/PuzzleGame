package com.example.puzzlegame;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView edtPuzzle = findViewById(R.id.edtText);
        String oldEdtPuzzleValue;

        Puzzle myPuzzle = new Puzzle();
        myPuzzle.letsShuffleTheDevices();

        for (int i = 0; i <60; i++) {

            oldEdtPuzzleValue = edtPuzzle.getText().toString();

            edtPuzzle.setText(oldEdtPuzzleValue + myPuzzle.giveMeTheModels());


        }


    }
}

