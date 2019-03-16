package com.example.sojib.numberconversion2;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HexaPage extends AppCompatActivity implements View.OnClickListener {

    Button octTobin,octToDec,octToHexa;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hexa_page);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("হেক্সাডেসিমাল সংখ্যা");

        octTobin = (Button) findViewById(R.id.octbin);
        octToDec = (Button) findViewById(R.id.octdec);
        octToHexa = (Button) findViewById(R.id.octhexa);

        Handler handler = new Handler();

        octTobin.setOnClickListener(this);
        octToDec.setOnClickListener(this);
        octToHexa.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        if(v.getId()==R.id.octbin){
            Intent obj = new Intent(HexaPage.this,HexatoBinTextPage.class);
            startActivity(obj);
        }

        if(v.getId()==R.id.octdec){
            Intent obj = new Intent(HexaPage.this,HexaToOctalPageText.class);
            startActivity(obj);
        }
        if(v.getId()==R.id.octhexa){
            Intent obj = new Intent(HexaPage.this,HexaToDecimalPageText.class);
            startActivity(obj);
        }
    }
}
