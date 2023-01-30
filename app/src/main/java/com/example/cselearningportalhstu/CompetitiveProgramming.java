package com.example.cselearningportalhstu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class CompetitiveProgramming extends AppCompatActivity {

    Button cse103,cse203,cse204,cse205,cse206,cse255,cse256,cse361;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_competitive_programming);

        cse103=(Button)findViewById(R.id.cse103);

        cse203=(Button)findViewById(R.id.cse203);
        cse204=(Button)findViewById(R.id.cse204);
        cse205=(Button)findViewById(R.id.cse205);
        cse206=(Button)findViewById(R.id.cse206);
        cse255=(Button)findViewById(R.id.cse255);
        cse256=(Button)findViewById(R.id.cse256);
        cse361=(Button)findViewById(R.id.cse361);

        cse103.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(CompetitiveProgramming.this,VisitingSite.class);
                intent.putExtra("url","https://drive.google.com/drive/folders/1esO4Co3H3o2zHVLoEEAmeFwQsOX9s0y5?usp=sharing");
                startActivity(intent);
            }
        });


        cse203.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(CompetitiveProgramming.this,VisitingSite.class);
                intent.putExtra("url","https://drive.google.com/drive/folders/1_nrRHwHxsBzwkZwXf9RITJLaScAhtsLb?usp=sharing");
                startActivity(intent);
            }
        });

        cse204.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(CompetitiveProgramming.this,VisitingSite.class);
                intent.putExtra("url","https://drive.google.com/drive/folders/1GYAAI_ajoarc2bcp5_a_Ms3Ncvdah0Td?usp=sharing");
                startActivity(intent);
            }
        });


        cse205.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(CompetitiveProgramming.this,VisitingSite.class);
                intent.putExtra("url","https://drive.google.com/drive/folders/1X9gJ9lwJk-AC0cpwhSrB5Jwny_u3OgB9?usp=sharing");
                startActivity(intent);
            }
        });


        cse206.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(CompetitiveProgramming.this,VisitingSite.class);
                intent.putExtra("url","https://drive.google.com/drive/folders/1gk2K7RxbAphcV0ZZcQswZP-C0z2EwZ64?usp=sharing");
                startActivity(intent);
            }
        });

        cse255.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(CompetitiveProgramming.this,VisitingSite.class);
                intent.putExtra("url","https://drive.google.com/drive/folders/18zxqndpoTnZy5Vjx2L0Jgve5PRZg-7sR?usp=sharing");
                startActivity(intent);
            }
        });

        cse256.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(CompetitiveProgramming.this,VisitingSite.class);
                intent.putExtra("url","https://drive.google.com/drive/folders/1m3ypjDnxdzA9sjQJB0hiz04TzJ8Txi6D?usp=sharing");
                startActivity(intent);
            }
        });

        cse361.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(CompetitiveProgramming.this,VisitingSite.class);
                intent.putExtra("url","https://drive.google.com/drive/folders/1pZjfSh1SU5VoCIBe49iNZRDa5PtCfkXi?usp=sharing");
                startActivity(intent);
            }
        });
    }
}