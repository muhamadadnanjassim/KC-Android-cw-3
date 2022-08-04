package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView Q = findViewById(R.id.T1);
        TextView W = findViewById(R.id.T2);

        EditText E = findViewById(R.id.PT1);
        EditText r = findViewById(R.id.PT2);

        Button t = findViewById(R.id.B1);
        
    }
}