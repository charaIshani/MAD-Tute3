package com.example.ntentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    EditText etNum1;
    EditText etNum2;

    String number1;
    String number2;

    int n1,n2;

    TextView txtAnswer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        //initialise two text objects
        etNum1 = findViewById(R.id.etNum1);
        etNum2 = findViewById(R.id.etNum2);
        txtAnswer = findViewById(R.id.txtAnswer);

        //get values from the first intent
        Intent intent = getIntent();

        //passing values in first activity
        //to do that create variables
        String number1= intent.getStringExtra("n1");
        String number2= intent.getStringExtra("n2");

        etNum1.setText(number1);
        etNum2.setText(number2);

        n1 =Integer.parseInt(number1);
        n2 =Integer.parseInt(number2);

    }

    public void add(View view){
        txtAnswer.setText("number1 "+ " + " + "number2" + " = " + (n1+n2));
    }

    public void devi(View view){
        txtAnswer.setText("number1" + " - " + "number2" + " = " + (n1-n2));
    }

    public void multi(View view){
        txtAnswer.setText("number1" + " x " + "number2" + " = " + (n1*n2));
    }

    public void substrac(View view){
        txtAnswer.setText("number1" + " / " + "number2" + " = " + (n1/n2));
    }
}