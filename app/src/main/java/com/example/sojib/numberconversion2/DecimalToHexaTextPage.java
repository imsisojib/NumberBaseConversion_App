package com.example.sojib.numberconversion2;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class DecimalToHexaTextPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_decimal_to_hexa_text_page);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("দশমিক সংখ্যা");
    }
}
