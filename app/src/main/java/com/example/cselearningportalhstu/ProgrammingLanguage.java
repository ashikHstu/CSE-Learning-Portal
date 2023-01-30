package com.example.cselearningportalhstu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ProgrammingLanguage extends AppCompatActivity {

    Button cse151,cse152,cse201,cse202,cse254;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_programming_language);
        cse151=(Button)findViewById(R.id.cse151);
        cse152=(Button)findViewById(R.id.cse152);
        cse201=(Button)findViewById(R.id.cse201);
        cse202=(Button)findViewById(R.id.cse202);
        cse254=(Button)findViewById(R.id.cse254);

        cse151.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(ProgrammingLanguage.this,VisitingSite.class);
                intent.putExtra("url","https://drive.google.com/drive/folders/1ZTtp8LOB-Hp975I9bQF1ZMFQJIb3J2Oy?usp=sharing");
                startActivity(intent);
            }
        });

        cse152.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(ProgrammingLanguage.this,VisitingSite.class);
                intent.putExtra("url","https://drive.google.com/drive/folders/10Sj7t_obqFfHW6perxU7oq8U8mtYewgg?usp=sharing");
                startActivity(intent);
            }
        });


        cse201.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(ProgrammingLanguage.this,VisitingSite.class);
                intent.putExtra("url","https://drive.google.com/drive/folders/1F84bbrOAGCt7NWbBS0BsQOTtkXN4Pive?usp=sharing");
                startActivity(intent);
            }
        });

        cse202.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(ProgrammingLanguage.this,VisitingSite.class);
                intent.putExtra("url","https://drive.google.com/drive/folders/1NC0u1i_edPU1azjJFoH3_ho24oGbvN8P?usp=sharing");
                startActivity(intent);
            }
        });

        cse254.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(ProgrammingLanguage.this,VisitingSite.class);
                intent.putExtra("url","https://drive.google.com/drive/folders/1jftqvD18mrqrMwEKKnBBS6dxvVEepni2?usp=sharing");
                startActivity(intent);
            }
        });
    }
}