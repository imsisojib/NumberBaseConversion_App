package com.example.sojib.numberconversion2;

import android.app.Dialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

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

        nDrawerLayout = findViewById(R.id.drawer);
        nToggle=new ActionBarDrawerToggle(MainActivity.this,nDrawerLayout,R.string.open, R.string.close);
        nDrawerLayout.addDrawerListener(nToggle);
        nToggle.syncState();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        NavigationView navigationView =  findViewById(R.id.navigation_view);
        navigationView.setNavigationItemSelectedListener(this);

        textView = findViewById(R.id.click);

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
        if(item.getItemId()==R.id.dev_id){
            Dialog myDialog = new Dialog(this);
            myDialog.setContentView(R.layout.activity_developer_info);
            myDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
            myDialog.show();
        }

        if(item.getItemId()==R.id.exit_id){
            finish();
            System.exit(0);
        }
        //return super.onOptionsItemSelected(item);
        return true;

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

        return false;
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.menu_layout,menu);
        return super.onCreateOptionsMenu(menu);
    }

}
