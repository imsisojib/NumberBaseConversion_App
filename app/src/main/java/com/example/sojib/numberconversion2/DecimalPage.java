package com.example.sojib.numberconversion2;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import static com.example.sojib.numberconversion2.R.id.octToDec;
import static com.example.sojib.numberconversion2.R.id.octToHexa;

public class DecimalPage extends AppCompatActivity implements View.OnClickListener {
    Button decTobin,decToOct,decToHex;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.decimal_page);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("দশমিক সংখ্যা");

        decTobin = (Button) findViewById(R.id.octbin);
        decToOct = (Button) findViewById(R.id.octdec);
        decToHex = (Button) findViewById(R.id.octhexa);

        Handler handler = new Handler();

        decTobin.setOnClickListener(this);
        decToOct.setOnClickListener(this);
        decToHex.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        if(v.getId()==R.id.octbin){
            Intent obj = new Intent(DecimalPage.this,DecimalToBinaryTextPage.class);
            startActivity(obj);
        }

        if(v.getId()==R.id.octdec){
            Intent obj = new Intent(DecimalPage.this,DecimalToOctalTextPage.class);
            startActivity(obj);
        }
        if(v.getId()==R.id.octhexa){
            Intent obj = new Intent(DecimalPage.this,DecimalToHexaTextPage.class);
            startActivity(obj);
        }
    }
}