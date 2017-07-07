package com.example.acer.calculadoradeformulas;


import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;
import android.widget.Toast;

public class Screen5Activity extends AppCompatActivity implements View.OnClickListener {

    CheckBox btnS;
    CheckBox btnN;
    TextView vs;
    TextView vn;
    Button tocred;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen5);


         btnS = (CheckBox) findViewById(R.id.S);
        btnN = (CheckBox) findViewById(R.id.N);
         vs = (TextView) findViewById(R.id.avalS);
         vn = (TextView) findViewById(R.id.avalN);
        tocred = (Button) findViewById(R.id.cred);
        btnS.setOnClickListener(this);
        btnN.setOnClickListener(this);
        tocred.setOnClickListener(this);


        }

        public void onClick(View v){
            Intent newIntent;
            if (btnS.isChecked()) {
                btnS.setEnabled(false);
                btnN.setEnabled(false);
            vs.setVisibility(View.VISIBLE);


        }
        if (btnN.isChecked()) {
            btnS.setEnabled(false);
            btnN.setEnabled(false);
            vn.setVisibility(View.VISIBLE);

        }
        if (tocred.isPressed()){

            newIntent = new Intent(this, Screen6Activity.class);
            startActivity(newIntent);
        }

    }
}
