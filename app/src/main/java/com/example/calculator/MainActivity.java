package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText n1,n2;
    TextView tv;
    Button a,s,m,d;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        n1 = (EditText) findViewById(R.id.editTextNumber);
        n2 = (EditText) findViewById(R.id.editTextNumber2);
        tv = (TextView) findViewById(R.id.textView3);
        a = (Button) findViewById(R.id.button);
        s = (Button) findViewById(R.id.button2);
        m = (Button) findViewById(R.id.button5);
        d = (Button) findViewById(R.id.button6);

        a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double num1 = Double.parseDouble(n1.getText().toString());
                double num2 = Double.parseDouble(n2.getText().toString());
                double c = num1+num2;
                tv.setText(Double.toString(c));
               // System.out.println(c);
            }
        });
        s.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double num1 = Double.parseDouble(n1.getText().toString());
                double num2 = Double.parseDouble(n2.getText().toString());
                double c = num1-num2;
                tv.setText(Double.toString(c));
                //System.out.println(c);
            }
        });
        m.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double num1 = Double.parseDouble(n1.getText().toString());
                double num2 = Double.parseDouble(n2.getText().toString());
                double c = num1*num2;
                tv.setText(Double.toString(c));
                //System.out.println(c);
            }
        });
        d.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double num1 = Double.parseDouble(n1.getText().toString());
                double num2 = Double.parseDouble(n2.getText().toString());
                double c = (num1/num2);
                tv.setText(String.format("%.2f",c));
                //System.out.println(c);
            }
        });
    }
}