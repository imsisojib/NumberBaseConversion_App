package com.example.sojib.numberconversion2;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class HexaToDecimalPageText extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hexa_to_decimal_page_text);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("হেক্সাডেসিমাল সংখ্যা");
    }
}
