package com.example.cselearningportalhstu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Categories extends AppCompatActivity {

    Button pl,math,wdd,eee,sd,cp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_categories);



        pl=(Button)findViewById(R.id.pl);
        math=(Button)findViewById(R.id.math);
        wdd=(Button)findViewById(R.id.wdd);

        eee=(Button)findViewById(R.id.eee);
        sd=(Button)findViewById(R.id.sd);
        cp=(Button)findViewById(R.id.cp);



        pl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent=new Intent(Categories.this,ProgrammingLanguage.class);
                startActivity(intent);
            }
        });

        math.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent=new Intent(Categories.this,Math.class);
                startActivity(intent);
            }
        });

        wdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent=new Intent(Categories.this,WebDesignDevelopment.class);
                startActivity(intent);
            }
        });


        eee.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent=new Intent(Categories.this,EEE.class);
                startActivity(intent);
            }
        });


       sd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent=new Intent(Categories.this,SoftwareDevelopment.class);
                startActivity(intent);
            }
        });

        cp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent=new Intent(Categories.this,CompetitiveProgramming.class);
                startActivity(intent);
            }
        });

    }


}