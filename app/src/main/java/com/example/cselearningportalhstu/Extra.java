package com.example.cselearningportalhstu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Extra extends AppCompatActivity {

    Button aad,wdd,cp,ml,os;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_extra);

        aad=(Button)findViewById(R.id.aad);
        wdd=(Button)findViewById(R.id.wdd);
        cp=(Button)findViewById(R.id.cp);
        ml=(Button)findViewById(R.id.ml);
        os=(Button)findViewById(R.id.os);


       aad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent=new Intent(Extra.this,VisitingSite.class);
                intent.putExtra("url","https://drive.google.com/drive/folders/1v5DDkBF2B2A6AvciyyyxtzfOSHsQJkgk?usp=sharing");
                startActivity(intent);
            }
        });


        wdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent=new Intent(Extra.this,VisitingSite.class);
                intent.putExtra("url","https://drive.google.com/drive/folders/1v5DDkBF2B2A6AvciyyyxtzfOSHsQJkgk?usp=sharing");
                startActivity(intent);
            }
        });

        cp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent=new Intent(Extra.this,VisitingSite.class);
                intent.putExtra("url","https://www.youtube.com/watch?v=Ng1wTl5NnFw&t=19s");
                startActivity(intent);
            }
        });

        ml.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent=new Intent(Extra.this,VisitingSite.class);
                intent.putExtra("url","https://drive.google.com/drive/folders/1v5DDkBF2B2A6AvciyyyxtzfOSHsQJkgk?usp=sharing");
                startActivity(intent);
            }
        });

        os.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent=new Intent(Extra.this,VisitingSite.class);
                intent.putExtra("url","https://drive.google.com/drive/folders/1v5DDkBF2B2A6AvciyyyxtzfOSHsQJkgk?usp=sharing");
                startActivity(intent);
            }
        });
    }
}