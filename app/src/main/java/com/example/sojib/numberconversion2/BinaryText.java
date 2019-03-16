package com.example.sojib.numberconversion2;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.Nullable;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by SOJIB on 16-Sep-18.
 */

public class BinaryText extends AppCompatActivity implements View.OnClickListener{

    Button toDecBtn,toOctBtn,toHexaBtn;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.binarylinked_page);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("বাইনারী সংখ্যা");

        toDecBtn =(Button) findViewById(R.id.binToDecText);
        toOctBtn =(Button) findViewById(R.id.binToOctText);
        toHexaBtn =(Button) findViewById(R.id.binToHexaText);

        Handler handler = new Handler();

        toDecBtn.setOnClickListener(this);
        toOctBtn.setOnClickListener(this);
        toHexaBtn.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        if(v.getId()==R.id.binToDecText) {
            Intent obj = new Intent(BinaryText.this, BinToDecRupantor.class);
            startActivity(obj);
        }
        if(v.getId()==R.id.binToOctText) {
            Intent obj = new Intent(BinaryText.this, BinToOctRupantor.class);
            startActivity(obj);
        }

        if(v.getId()==R.id.binToHexaText) {
            Intent obj = new Intent(BinaryText.this, BinToHexaRupantor.class);
            startActivity(obj);
        }

    }

}
