package com.example.acer.calculadoradeformulas;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;

public class Screen2Activity extends AppCompatActivity {
    DecimalFormat df =  new DecimalFormat("0.0");
    EditText comprimento;
    EditText freq;
    TextView result;
    float resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen2);
        comprimento = (EditText) findViewById(R.id.editLambda);
        freq = (EditText) findViewById(R.id.editF);
        result = (TextView) findViewById(R.id.editResu);



    }
    public void clique (View v){
        result.setVisibility(View.VISIBLE);
        resultado = Float.parseFloat(comprimento.getText().toString())* Float.parseFloat(freq.getText().toString());
        result.setText(df.format(resultado)+" m/s");
    }
    }

