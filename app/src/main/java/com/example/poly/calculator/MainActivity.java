package com.example.poly.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText etNumberOne;
    private EditText etEtNumberTwo;
    private Button btnPlus;
    private Button btnMinus;
    private Button btnMultiply;
    private Button btnDivide;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etNumberOne = findViewById(R.id.etNumberOne);
        etEtNumberTwo = findViewById(R.id.etNumberTwo);
        btnPlus = findViewById(R.id.bntPuls);
        btnMinus = findViewById(R.id.bntMinus);
        btnMultiply = findViewById(R.id.bntMutiply);
        btnDivide = findViewById(R.id.bntDivide);

        btnPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int numberOne = Integer.parseInt(etNumberOne.getText().toString());
                int numberTwo = Integer.parseInt(etNumberOne.getText().toString());
                Plus(numberOne,numberTwo);
                Toast.makeText( MainActivity.this,String.valueOf(Plus(numberOne,numberTwo)),Toast.LENGTH_SHORT).show();;
            }
        });
        btnMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int numberOne = Integer.parseInt(etNumberOne.getText().toString());
                int numberTwo = Integer.parseInt(etNumberOne.getText().toString());
                Minus(numberOne,numberTwo);
            }
        });
        btnMultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int numberOne = Integer.parseInt(etNumberOne.getText().toString());
                int numberTwo = Integer.parseInt(etNumberOne.getText().toString());
                Mutiply(numberOne,numberTwo);
            }
        });
        btnDivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int numberOne = Integer.parseInt(etNumberOne.getText().toString());
                int numberTwo = Integer.parseInt(etNumberOne.getText().toString());
                Divide(numberOne,numberTwo);
            }
        });
    }

    private int Plus(int numberOne, int numberTwo) {
        return numberOne + numberTwo;
    }
    private int Minus(int numberOne, int numberTwo) {
        return numberOne - numberTwo;
    }
    private int Mutiply(int numberOne, int numberTwo) {
        return numberOne * numberTwo;
    }
    private int Divide(int numberOne, int numberTwo) {
        if (numberTwo == 0){
            return 0;
        }else {
            return numberOne;
        }
        return numberOne / numberTwo;
    }
}
