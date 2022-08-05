package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Calculator
        CardView C1 = findViewById(R.id.C1);
        TextView T1 = findViewById(R.id.T1);

        //Total and استاذ محمد الهاشمي
        TextView T2 = findViewById(R.id.T2);
        TextView T3 = findViewById(R.id.T3);

        CardView C2 = findViewById(R.id.C2);
        EditText PT1 = findViewById(R.id.PT1);

        //Plaintext
        CardView C3 = findViewById(R.id.C3);
        EditText PT2 = findViewById(R.id.PT2);

        //Calculate
        Button B1 = findViewById(R.id.B1);

        //+-...
        Button B2 = findViewById(R.id.B2);
        Button B3 = findViewById(R.id.B3);
        Button B4 = findViewById(R.id.B4);
        Button B5 = findViewById(R.id.B5);

    }
}