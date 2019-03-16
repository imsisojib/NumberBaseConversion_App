package com.example.sojib.numberconversion2;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.example.sojib.numberconversion2.R;

import static com.example.sojib.numberconversion2.R.layout.activity_main;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener{
    private DrawerLayout nDrawerLayout;
    private ActionBarDrawerToggle nToggle;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(activity_main);

        nDrawerLayout=(DrawerLayout) findViewById(R.id.drawer);
        nToggle=new ActionBarDrawerToggle(MainActivity.this,nDrawerLayout,R.string.open, R.string.close);
        nDrawerLayout.addDrawerListener(nToggle);
        nToggle.syncState();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        NavigationView navigationView = (NavigationView) findViewById(R.id.navigation_view);
        navigationView.setNavigationItemSelectedListener(this);

        textView=(TextView) findViewById(R.id.click);

        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent obj = new Intent(MainActivity.this,Page1.class);
                startActivity(obj);
            }
        });

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if(nToggle.onOptionsItemSelected(item)){
            return true;
        }
        return super.onOptionsItemSelected(item);

    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        int id=item.getItemId();
        if(id==R.id.binToDec){
            Intent obj = new Intent(MainActivity.this,BinaryToDecimal.class);
            startActivity(obj);
        }
        if(id==R.id.decToBin){
            Intent obj = new Intent(MainActivity.this,DecimalToBinary.class);
            startActivity(obj);
        }
        if(id==R.id.decToOct){
            Intent obj = new Intent(MainActivity.this,DecimalToOctal.class);
            startActivity(obj);
        }
        if(id==R.id.octToDec){
            Intent obj = new Intent(MainActivity.this,OctalToDecimal.class);
            startActivity(obj);
        }
        if(id==R.id.decToHexa){
            Intent obj = new Intent(MainActivity.this,DecimalToHexa.class);
            startActivity(obj);
        }
        if(id==R.id.hexaToDec){
            Intent obj = new Intent(MainActivity.this,HexaToDecimal.class);
            startActivity(obj);
        }
        if(id==R.id.binToOct){
            Intent obj = new Intent(MainActivity.this,BinaryToOctal.class);
            startActivity(obj);
        }
        if(id==R.id.octToBin){
            Intent obj = new Intent(MainActivity.this,OctalToBinary.class);
            startActivity(obj);
        }
        if(id==R.id.binToHexa){
            Intent obj = new Intent(MainActivity.this,BinaryToHexa.class);
            startActivity(obj);
        }
        if(id==R.id.hexaToBin){
            Intent obj = new Intent(MainActivity.this,HexaToBinary.class);
            startActivity(obj);
        }
        if(id==R.id.octToHexa){
            Intent obj = new Intent(MainActivity.this,OctalToHexa.class);
            startActivity(obj);
        }
        if(id==R.id.hexaToOct){
            Intent obj = new Intent(MainActivity.this,HexaToOctal.class);
            startActivity(obj);
        }
        if(id==R.id.dev_id){
            Intent obj = new Intent(MainActivity.this,DeveloperInfo.class);
            startActivity(obj);
        }
        if(id==R.id.exit_id){
            finish();
            System.exit(0);
        }

        return false;
    }
}
