package com.example.acer.calculadoradeformulas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;

public class Screen4Activity extends AppCompatActivity {
    DecimalFormat df =  new DecimalFormat("0.0");
    EditText Pes;
    EditText Height;
    TextView Resultado;
    TextView Situacao;
    Float IMC;
    Float pesimc;
    Float altimc;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen4);
        Pes = (EditText) findViewById(R.id.editPeso);
        Height = (EditText) findViewById(R.id.editAlt);
        Resultado = (TextView) findViewById(R.id.editResult);
        Situacao = (TextView) findViewById(R.id.situ);
    }
    public void clique3 (View v){
        Resultado.setVisibility(View.VISIBLE);
        Situacao.setVisibility(View.VISIBLE);
        pesimc =  Float.parseFloat(Pes.getText().toString());
        altimc = Float.parseFloat(Height.getText().toString());
        IMC = pesimc/(altimc*altimc);
        Resultado.setText(df.format(IMC));
        if (IMC < 17){
            Situacao.setText("Situação: muito abaixo do peso");
        }
        else if (IMC >= 17 && IMC <=18.49){
            Situacao.setText("Situação: abaixo do peso");
        }
        else if (IMC >= 18.5 && IMC <=24.99){
            Situacao.setText("Situação: peso normal");
        }
        else if (IMC >= 25 && IMC <=29.99){
            Situacao.setText("Situação: acima do peso");
        }
        else if (IMC >= 30 && IMC <=34.99){
            Situacao.setText("Situação: obesidade |");
        }
        else if (IMC >= 35 && IMC <=39.99){
            Situacao.setText("Situação: obesidade || (severa)");
        }
        else if (IMC > 40  ){
            Situacao.setText("Situação: obesidade |||(mórbida)");
        }





    }
    }

