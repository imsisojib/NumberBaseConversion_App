package com.example.sojib.numberconversion2;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class BinToHexaRupantor extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bin_to_hexa_rupantor);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("বাইনারী সংখ্যা");
    }
}
