package com.example.cselearningportalhstu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Level3Sem1 extends AppCompatActivity {

    Button cse303,cse304,cse305,cse307,cse308,ece311,ecn305,cse302;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level3_sem1);

        cse303=(Button)findViewById(R.id.cse303);
        cse304=(Button)findViewById(R.id.cse304);
        cse305=(Button)findViewById(R.id.cse305);
        cse307=(Button)findViewById(R.id.cse307);
        cse308=(Button)findViewById(R.id.cse308);
        ece311=(Button)findViewById(R.id.ece311);
        ecn305=(Button)findViewById(R.id.ecn305);
        cse302=(Button)findViewById(R.id.cse302);

        cse303.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Level3Sem1.this,VisitingSite.class);
                intent.putExtra("url","https://drive.google.com/drive/folders/1EAqbNBdxutOVi_v0C7FOl-K_c-0YCoHl?usp=sharing");
                startActivity(intent);
            }
        });

        cse304.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Level3Sem1.this,VisitingSite.class);
                intent.putExtra("url","https://drive.google.com/drive/folders/1K6dzmtLic9zBlRdGZNc6w7fK4Q_O0Ipn?usp=sharing");
                startActivity(intent);
            }
        });

        cse305.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Level3Sem1.this,VisitingSite.class);
                intent.putExtra("url","https://drive.google.com/drive/folders/1mi-S1SIzWUf6DQ7NbMHick5Bks9d7clB?usp=sharing");
                startActivity(intent);
            }
        });

        cse307.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Level3Sem1.this,VisitingSite.class);
                intent.putExtra("url","https://drive.google.com/drive/folders/1piWYyCe0bjZ_tP-TbNcG8zQzE3KNmwEH?usp=sharing");
                startActivity(intent);
            }
        });

        cse308.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Level3Sem1.this,VisitingSite.class);
                intent.putExtra("url","https://drive.google.com/drive/folders/1MVNHcy8WCn0RG68_cejpQx5zGy6_DN92?usp=sharing");
                startActivity(intent);
            }
        });

        ece311.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Level3Sem1.this,VisitingSite.class);
                intent.putExtra("url","https://drive.google.com/drive/folders/1492SV0Uszp368P_b0vbEqZGbBCDZbHyo?usp=sharing");
                startActivity(intent);
            }
        });

        ecn305.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Level3Sem1.this,VisitingSite.class);
                intent.putExtra("url","https://drive.google.com/drive/folders/1fhjY-1XRRJZKQhh4pe1rSCiPcL0HI4c_?usp=sharing");
                startActivity(intent);
            }
        });

        cse302.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Level3Sem1.this,VisitingSite.class);
                intent.putExtra("url","https://drive.google.com/drive/folders/1v21IbRaCWGdMZV8lT5dkDTUzde3Ei1dk?usp=sharing");
                startActivity(intent);
            }
        });




    }
}