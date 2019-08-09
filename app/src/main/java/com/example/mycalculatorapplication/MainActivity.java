package com.example.mycalculatorapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button one, two, three, four, five, six, seven, eight, nine, add, minus, divide, multiply, zero, equals, C;
    TextView calculatorText, inputView;

    Float ValueOne, ValueTwo;

    boolean inputAdd, inputMinus, inputDivide, inputMultiply, inputC;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        one = (Button) findViewById(R.id.one);
        two = (Button) findViewById(R.id.two);
        three = (Button) findViewById(R.id.three);
        four = (Button) findViewById(R.id.four);
        five = (Button) findViewById(R.id.five);
        six = (Button) findViewById(R.id.six);
        seven = (Button) findViewById(R.id.seven);
        eight = (Button) findViewById(R.id.eight);
        nine = (Button) findViewById(R.id.nine);
        zero = (Button) findViewById(R.id.zero);
        add = (Button) findViewById(R.id.add);
        minus = (Button) findViewById(R.id.minus);
        divide = (Button) findViewById(R.id.divide);
        multiply = (Button) findViewById(R.id.multiply);
        equals = (Button) findViewById(R.id.equals);
        C = (Button) findViewById(R.id.C);
        calculatorText = (TextView) findViewById(R.id.calculatorText);
        inputView = (TextView) findViewById(R.id.inputView);


        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inputView.setText(inputView.getText() + "0");
            }
        });

        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inputView.setText(inputView.getText() + "1");
            }
        });

        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inputView.setText(inputView.getText() + "2");
            }
        });

        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inputView.setText(inputView.getText() + "3");
            }
        });

        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inputView.setText(inputView.getText() + "4");
            }
        });

        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inputView.setText(inputView.getText() + "5");
            }
        });

        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inputView.setText(inputView.getText() + "6");
            }
        });

        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inputView.setText(inputView.getText() + "7");
            }
        });

        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inputView.setText(inputView.getText() + "8");
            }
        });

        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inputView.setText(inputView.getText() + "9");
            }
        });

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (inputView == null){
                    inputView.setText("");
                } else {
                    ValueOne = Float.parseFloat(inputView.getText() + "");
                    inputAdd = true;
                    inputView.setText(null);
                }
            }
        });

        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ValueOne = Float.parseFloat(inputView.getText() + "");
                inputMinus = true;
                inputView.setText(null);
            }
        });

        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ValueOne = Float.parseFloat(inputView.getText() + "");
                inputMultiply = true;
                inputView.setText(null);
            }
        });

        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ValueOne = Float.parseFloat(inputView.getText() + "");
                inputDivide = true;
                inputView.setText(null);
            }
        });

        equals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ValueTwo = Float.parseFloat(inputView.getText() + "");

                if (inputAdd == true){
                    inputView.setText(ValueOne + ValueTwo + "");
                    inputAdd = false;
                }

                if (inputMinus == true){
                    inputView.setText(ValueOne - ValueTwo + "");
                    inputMinus = false;
                }

                if (inputMultiply == true){
                    inputView.setText(ValueOne * ValueTwo + "");
                    inputMultiply = false;
                }

                if (inputDivide == true) {
                    inputView.setText(ValueOne / ValueTwo + "");
                    inputDivide = false;
                }
            }
        });

        C.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inputView.setText("");
            }
        });

    }
}














