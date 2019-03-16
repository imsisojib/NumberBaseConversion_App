package com.example.sojib.numberconversion2;

import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Collections;

import static java.lang.Math.pow;


public class OctalToBinary extends AppCompatActivity {
    EditText et_in;
    private static TextView tv_show;
    Button btn_conv,btn_reset;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.octal2binary);

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
                            if (store[i] >='0' && store[i]<='7' || store[i] == '.') continue;
                            else throw new Exception();
                        }
                    } catch (Exception ex) {
                        Toast.makeText(OctalToBinary.this, "সংখাটি সঠিকভাবে লিখুন!", Toast.LENGTH_SHORT).show();
                        return;
                    }
                    for (int i = 0; i < totalIndex; i++) {
                        if (store[i]>='0' && store[i]<='7') intPart++;
                        if (store[i] == '.') break;
                    }
                    double sum = 0;
                    int powDegree = intPart - 1;

                    for (int i = 0; i < intPart; i++) {
                        if (store[i] == '1') {
                            sum += pow(8, powDegree);
                            powDegree--;
                        } else if (store[i] == '2') {
                            sum += 2 * pow(8, powDegree);
                            powDegree--;
                        } else if (store[i] == '3') {
                            sum += 3 * pow(8, powDegree);
                            powDegree--;
                        } else if (store[i] == '4') {
                            sum += 4 * pow(8, powDegree);
                            powDegree--;
                        } else if (store[i] == '5') {
                            sum += 5 * pow(8, powDegree);
                            powDegree--;
                        } else if (store[i] == '6') {
                            sum += 6 * pow(8, powDegree);
                            powDegree--;
                        } else if (store[i] == '7') {
                            sum += 7 * pow(8, powDegree);
                            powDegree--;
                        } else powDegree--;
                    }

                        for (int i = intPart + 1; i < totalIndex; i++) {
                            if (store[i] == '1') {
                                sum += pow(8, powDegree);
                                powDegree--;
                            } else if (store[i] == '2') {
                                sum += 2 * pow(8, powDegree);
                                powDegree--;
                            } else if (store[i] == '3') {
                                sum += 3 * pow(8, powDegree);
                                powDegree--;
                            } else if (store[i] == '4') {
                                sum += 4 * pow(8, powDegree);
                                powDegree--;
                            } else if (store[i] == '5') {
                                sum += 5 * pow(8, powDegree);
                                powDegree--;
                            } else if (store[i] == '6') {
                                sum += 6 * pow(8, powDegree);
                                powDegree--;
                            } else if (store[i] == '7') {
                                sum += 7 * pow(8, powDegree);
                                powDegree--;
                            } else powDegree--;
                        }
                            convertToBinary(sum);
                }
                    catch (Exception e) {
                    Toast.makeText(OctalToBinary.this, "সংখাটি সঠিকভাবে লিখুন!", Toast.LENGTH_SHORT).show();
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
    private static void convertToBinary(double number){
        int intPart;
        char[] concStore = new char[128];
        ArrayList<Integer> storeFloat = new ArrayList<>();
        ArrayList<Integer> storeInt = new ArrayList<>();

        intPart = (int) number;
        number -= intPart;

        //integer part
        while (intPart != 0) {
            storeInt.add(intPart % 2);
            intPart /= 2;
        }
        Collections.reverse(storeInt);
        //float part
        while (number != 0) {
            number *= 2;
            storeFloat.add((int) number);
            number -= (int) number;
        }
        int i = 0;
        if (storeInt.size() == 0) {
            concStore[i] = '0';
            i++;
        } else {
            for (int n : storeInt) {
                concStore[i] = (char) (n + '0');
                i++;
            }
        }
        if (storeFloat.size() == 0) {
            String output = new String(concStore);
            tv_show.setText(output);
        } else {
            concStore[i] = '.';
            i++;
            for (int n : storeFloat) {
                concStore[i] = (char) (n + '0');
                i++;
            }

            String output = new String(concStore);
            tv_show.setText(output);
        }
    }
}