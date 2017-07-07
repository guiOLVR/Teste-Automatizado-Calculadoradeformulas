package com.example.acer.calculadoradeformulas;

import android.content.Intent;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    RadioButton btnS2;
    RadioButton btnS3;
    RadioButton btnS4;
    Button btnS5;


    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnS2 = (RadioButton) findViewById(R.id.btnScreen2);
        btnS3 = (RadioButton) findViewById(R.id.btnScreen3);
        btnS4 = (RadioButton) findViewById(R.id.btnScreen4);
        btnS5 = (Button) findViewById(R.id.btnScreen5);

        btnS2.setOnClickListener(this);
        btnS3.setOnClickListener(this);
        btnS4.setOnClickListener(this);
        btnS5.setOnClickListener(this);
    }

    @Override
    protected void onResume() {
        super.onResume();
        btnS2.setChecked(false);
        btnS3.setChecked(false);
        btnS4.setChecked(false);

    }

    public void onClick(View view) {
        Intent newIntent;
        switch (view.getId()) {
            case R.id.btnScreen2:
                newIntent = new Intent(this, Screen2Activity.class);
                startActivity(newIntent);
                break;
            case R.id.btnScreen3:
                newIntent = new Intent(this, Screen3Activity.class);
                startActivity(newIntent);
                break;
            case R.id.btnScreen4:
                newIntent = new Intent(this, Screen4Activity.class);
                startActivity(newIntent);
                break;
            case R.id.btnScreen5:
                newIntent = new Intent(this, Screen5Activity.class);
                startActivity(newIntent);
                break;

        }
    }
}
