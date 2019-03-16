package com.example.sojib.numberconversion2;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Sthanioman extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sthanioman);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("সংখ্যার স্থানীয় মান");
    }
}
