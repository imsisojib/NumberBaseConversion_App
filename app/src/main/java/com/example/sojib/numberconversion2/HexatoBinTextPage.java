package com.example.sojib.numberconversion2;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class HexatoBinTextPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hexato_bin_text_page);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("হেক্সাডেসিমাল সংখ্যা");
    }
}
