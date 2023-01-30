package com.example.cselearningportalhstu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SoftwareDevelopment extends AppCompatActivity {

    Button cse252,cse303,cse304,cse305,cse302,cse352;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_software_development);
        cse252=(Button)findViewById(R.id.cse252);
        cse303=(Button)findViewById(R.id.cse303);
        cse304=(Button)findViewById(R.id.cse304);
        cse305=(Button)findViewById(R.id.cse305);
        cse302=(Button)findViewById(R.id.cse302);
        cse352=(Button)findViewById(R.id.cse352);


        cse252.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(SoftwareDevelopment.this,VisitingSite.class);
                intent.putExtra("url","https://drive.google.com/drive/folders/1SnOv3VnOI1k6Chn6Nk9TtbFKHefH4Si8?usp=sharing");
                startActivity(intent);
            }
        });

        cse303.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(SoftwareDevelopment.this,VisitingSite.class);
                intent.putExtra("url","https://drive.google.com/drive/folders/1EAqbNBdxutOVi_v0C7FOl-K_c-0YCoHl?usp=sharing");
                startActivity(intent);
            }
        });

        cse304.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(SoftwareDevelopment.this,VisitingSite.class);
                intent.putExtra("url","https://drive.google.com/drive/folders/1K6dzmtLic9zBlRdGZNc6w7fK4Q_O0Ipn?usp=sharing");
                startActivity(intent);
            }
        });

        cse305.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(SoftwareDevelopment.this,VisitingSite.class);
                intent.putExtra("url","https://drive.google.com/drive/folders/1mi-S1SIzWUf6DQ7NbMHick5Bks9d7clB?usp=sharing");
                startActivity(intent);
            }
        });

        cse302.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(SoftwareDevelopment.this,VisitingSite.class);
                intent.putExtra("url","https://drive.google.com/drive/folders/1v21IbRaCWGdMZV8lT5dkDTUzde3Ei1dk?usp=sharing");
                startActivity(intent);
            }
        });

        cse352.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(SoftwareDevelopment.this,VisitingSite.class);
                intent.putExtra("url","https://drive.google.com/drive/folders/1R4hD40KvSuZkFRqV8BL5SUMDEgomLecu?usp=sharing");
                startActivity(intent);
            }
        });


    }
}