package com.example.sojib.numberconversion2;

import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import static java.lang.Math.pow;

/**
 * Created by SOJIB on 10-Aug-18.
 */

public class BinaryToDecimal extends AppCompatActivity {
    EditText et_in;
    TextView tv_show;
    Button btn_conv,btn_reset;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.binary2decimal);

        ActionBar actionBar = getSupportActionBar();

        et_in= (EditText) findViewById(R.id.inputDecimal);

        btn_conv= (Button) findViewById(R.id.convert);
        tv_show=(TextView) findViewById(R.id.outputTV);
        btn_reset=(Button) findViewById(R.id.tryAgain);

        btn_conv.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                try {
                    String number;
                    number = et_in.getText().toString();

                    char[] store = new char[120];
                    store = number.toCharArray();

                    int totalIndex = number.length();
                    int intPart = 0;
                    try {
                        for (int i = 0; i < totalIndex; i++) {
                            if (store[i] == '1' || store[i] == '0' || store[i] == '.') continue;
                            else throw new Exception();
                        }
                    } catch (Exception ex) {
                        Toast.makeText(BinaryToDecimal.this, "সংখাটি সঠিকভাবে লিখুন!", Toast.LENGTH_SHORT).show();
                        return;
                    }
                    for (int i = 0; i < totalIndex; i++) {
                        if (store[i] == '1' || store[i] == '0') intPart++;
                        if (store[i] == '.') break;
                    }
                    double sum = 0;
                    int powDegree = intPart - 1;

                    for (int i = 0; i < intPart; i++) {
                        if (store[i] == '1') {
                            sum += pow(2, powDegree);
                            powDegree--;
                        } else powDegree--;
                    }

                    for (int i = intPart + 1; i < totalIndex; i++) {
                        if (store[i] == '1') {
                            sum += 1 * pow(2, powDegree);
                            powDegree--;
                        } else powDegree--;
                    }
                    if ((sum * 10) % 10 == 0) tv_show.setText(String.valueOf((int) sum));
                    else tv_show.setText(String.valueOf(sum));


                } catch (Exception e) {
                    Toast.makeText(BinaryToDecimal.this, "সংখাটি সঠিকভাবে লিখুন!", Toast.LENGTH_SHORT).show();
                }
            }
        });

        btn_reset.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){

                tv_show.setText("");
                et_in.setText("");

            }
        });


    }
}