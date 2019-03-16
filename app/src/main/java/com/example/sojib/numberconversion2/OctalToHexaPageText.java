package com.example.sojib.numberconversion2;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class OctalToHexaPageText extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_octal_to_hexa_page_text);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("অক্টাল সংখ্যা");
    }
}
