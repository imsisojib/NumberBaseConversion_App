package com.example.sojib.numberconversion2;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SonkhaPoddhotiKi extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sonkha_poddhoti_ki);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("সংখ্যা পদ্ধতি");
    }
}
