package com.example.cselearningportalhstu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Level4Sem1 extends AppCompatActivity {
    Button cse403,cse404,cse405,cse406,cse408,cse402;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level4_sem1);

        cse403=(Button)findViewById(R.id.cse403);
        cse404=(Button)findViewById(R.id.cse404);
        cse405=(Button)findViewById(R.id.cse405);
        cse406=(Button)findViewById(R.id.cse406);
        cse408=(Button)findViewById(R.id.cse408);
        cse402=(Button)findViewById(R.id.cse402);




        cse403.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Level4Sem1.this,VisitingSite.class);
                intent.putExtra("url","https://drive.google.com/drive/folders/1xLT0bCW1YVXsNML6QB5flzfwe0vQqzbX?usp=sharing");
                startActivity(intent);
            }
        });

        cse404.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Level4Sem1.this,VisitingSite.class);
                intent.putExtra("url","https://drive.google.com/drive/folders/1bPQVk1rCQGdc2lyG8Zawo9-Iy1fETA66?usp=sharing");
                startActivity(intent);
            }
        });

        cse405.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Level4Sem1.this,VisitingSite.class);
                intent.putExtra("url","https://drive.google.com/drive/folders/1IDbc8sJ78YmoxnBMjmJUL8cp80e0fUl1?usp=sharing");
                startActivity(intent);
            }
        });

        cse406.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Level4Sem1.this,VisitingSite.class);
                intent.putExtra("url","https://drive.google.com/drive/folders/1-ZWa6_F8QdOmG38K0GdhH77oA3wsLpbG?usp=sharing");
                startActivity(intent);
            }
        });

        cse408.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Level4Sem1.this,VisitingSite.class);
                intent.putExtra("url","https://drive.google.com/drive/folders/1QkjgR3QcfL-7M8Ly3AzoQsBxsw-nHXDp?usp=sharing");
                startActivity(intent);
            }
        });


        cse402.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Level4Sem1.this,VisitingSite.class);
                intent.putExtra("url","https://drive.google.com/drive/folders/1CgRKNQ-B-h1PlHBgrhb_hnQs4-VzP1Tn?usp=sharing");
                startActivity(intent);
            }
        });

    }
}