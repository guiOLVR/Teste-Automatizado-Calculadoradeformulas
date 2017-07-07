package com.example.acer.calculadoradeformulas;

import android.icu.text.DecimalFormat;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Screen3Activity extends AppCompatActivity {
    java.text.DecimalFormat df =  new java.text.DecimalFormat("0.0");
    EditText velo;
    EditText comprimento;
    TextView result;
    float resultado;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen3);
        velo = (EditText) findViewById(R.id.editVelo);
        comprimento = (EditText) findViewById(R.id.editC);
        result = (TextView) findViewById(R.id.editR);
    }
    public void clique2 (View v){
        resultado = Float.parseFloat(velo.getText().toString())/ Float.parseFloat(comprimento.getText().toString());
        result.setText(df.format(resultado)+" Hz");
    }
}
//n.setText(""+RE);


