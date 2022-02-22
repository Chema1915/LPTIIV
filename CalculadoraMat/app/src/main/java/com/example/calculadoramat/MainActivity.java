package com.example.calculadoramat;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText m1,m2,m3,m4,m5,m6,m7,m8,m9,m0,tot;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        m1 = (EditText) findViewById(R.id.a);
        m2 = (EditText) findViewById(R.id.b);
        m3 = (EditText) findViewById(R.id.c);
        m4 = (EditText) findViewById(R.id.d);
        m5 = (EditText) findViewById(R.id.e);
        m6 = (EditText) findViewById(R.id.f);
        m7 = (EditText) findViewById(R.id.g);
        m8 = (EditText) findViewById(R.id.h);
        m9= (EditText) findViewById(R.id.i);
        m0 = (EditText) findViewById(R.id.j);
    }
    public void calcular (View view){

        String ma1 = m1.getText().toString();
        String ma2 = m2.getText().toString();
        String ma3 = m3.getText().toString();
        String ma4 = m4.getText().toString();
        String ma5 = m5.getText().toString();
        String ma6 = m6.getText().toString();
        String ma7 = m7.getText().toString();
        String ma8 = m8.getText().toString();
        String ma9 = m9.getText().toString();
        String ma0 = m0.getText().toString();

        double mat1 = Double.parseDouble(ma1);
        double mat2 = Double.parseDouble(ma2);
        double mat3 = Double.parseDouble(ma3);
        double mat4 = Double.parseDouble(ma4);
        double mat5 = Double.parseDouble(ma5);
        double mat6 = Double.parseDouble(ma6);
        double mat7 = Double.parseDouble(ma7);
        double mat8 = Double.parseDouble(ma8);
        double mat9 = Double.parseDouble(ma9);
        double mat0 = Double.parseDouble(ma0);



        double promedio = (mat1+mat2+mat3+mat4+mat5+mat6+mat7+mat8+mat9+mat0)/10;
        String result = String.valueOf(promedio);
        if(mat1<6){

        }

        tot.setText(result);



    }
}