package com.example.sojib.numberconversion2;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.Nullable;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import static com.example.sojib.numberconversion2.R.string.pageSubject;

/**
 * Created by SOJIB on 13-Aug-18.
 */

public class Page1 extends AppCompatActivity implements View.OnClickListener{
    private Button sonkhatotto,sonkharvitti,sthanioman,prokarved,binary,octal,decimal,hexadecimal;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.page1);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("সূচিপত্র");

        sonkhatotto =(Button) findViewById(R.id.sonkhatottho);
        sonkharvitti =(Button) findViewById(R.id.sonkharVitti) ;
        sthanioman =(Button) findViewById(R.id.sonkharman);
        prokarved =(Button) findViewById(R.id.prokarved);
        binary =(Button) findViewById(R.id.binaryPage);
        octal =(Button) findViewById(R.id.octalPage);
        decimal =(Button) findViewById(R.id.decimalPage);
        hexadecimal=(Button) findViewById(R.id.hexaPage);

        Handler handler = new Handler();

        sonkhatotto.setOnClickListener(this);
        sonkharvitti.setOnClickListener(this);
        sthanioman.setOnClickListener(this);
        prokarved.setOnClickListener(this);
        binary.setOnClickListener(this);
        decimal.setOnClickListener(this);
        octal.setOnClickListener(this);
        hexadecimal.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        if(v.getId()==R.id.sonkhatottho){
            Intent obj = new Intent(Page1.this,SonkhaPoddhotiKi.class);
            startActivity(obj);
        }
        if(v.getId()==R.id.sonkharVitti){
            Intent obj = new Intent(Page1.this,SonkhaPoddhotirVitti.class);
            startActivity(obj);
        }
        if(v.getId()==R.id.sonkharman){
            Intent obj = new Intent(Page1.this,Sthanioman.class);
            startActivity(obj);
        }
        if(v.getId()==R.id.prokarved){
            Intent obj = new Intent(Page1.this,SonkhaPoddhotirProkarved.class);
            startActivity(obj);
        }
        if(v.getId()==R.id.binaryPage){
            Intent obj = new Intent(Page1.this,BinaryText.class);
            startActivity(obj);
        }
        if(v.getId()==R.id.octalPage){
            Intent obj = new Intent(Page1.this,OctalPage.class);
            startActivity(obj);
        }
        if(v.getId()==R.id.decimalPage){
            Intent obj = new Intent(Page1.this,DecimalPage.class);
            startActivity(obj);
        }
        if(v.getId()==R.id.hexaPage){
            Intent obj = new Intent(Page1.this,HexaPage.class);
            startActivity(obj);
        }


    }
}
