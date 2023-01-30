package com.example.cselearningportalhstu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Level1Sem2 extends AppCompatActivity {

    Button cse151,cse152,cse153,cse154,eee155,eee156,aie106,mat105,soc103;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level1_sem2);

        cse151=(Button)findViewById(R.id.cse151);
        cse152=(Button)findViewById(R.id.cse152);
        cse153=(Button)findViewById(R.id.cse153);
        cse154=(Button)findViewById(R.id.cse154);
        eee155=(Button)findViewById(R.id.eee155);
        eee156=(Button)findViewById(R.id.eee156);
       aie106=(Button)findViewById(R.id.aie106);
        mat105=(Button)findViewById(R.id.mat105);
        soc103=(Button)findViewById(R.id.soc103);


        cse151.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Level1Sem2.this,VisitingSite.class);
                intent.putExtra("url","https://drive.google.com/drive/folders/1ZTtp8LOB-Hp975I9bQF1ZMFQJIb3J2Oy?usp=sharing");
                startActivity(intent);
            }
        });

        cse152.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Level1Sem2.this,VisitingSite.class);
                intent.putExtra("url","https://drive.google.com/drive/folders/10Sj7t_obqFfHW6perxU7oq8U8mtYewgg?usp=sharing");
                startActivity(intent);
            }
        });

        cse153.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Level1Sem2.this,VisitingSite.class);
                intent.putExtra("url","https://drive.google.com/drive/folders/1sQHDe0fvB9m7bv169k3AaiRux2_MwODz?usp=sharing");
                startActivity(intent);
            }
        });

        cse154.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Level1Sem2.this,VisitingSite.class);
                intent.putExtra("url","https://drive.google.com/drive/folders/1VHpiqNNMDZ9GCbXMuK_nifH-iUZcgVrr?usp=sharing");
                startActivity(intent);
            }
        });

        eee155.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Level1Sem2.this,VisitingSite.class);
                intent.putExtra("url","https://drive.google.com/drive/folders/1nWuZHXn86wYK__r5s5qoqzvrvv3afE4f?usp=sharing");
                startActivity(intent);
            }
        });



        eee156.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Level1Sem2.this,VisitingSite.class);
                intent.putExtra("url","https://drive.google.com/drive/folders/1UosSawS99TGRRaDha75l7dCrk9kZ3f-g?usp=sharing");
                startActivity(intent);
            }
        });

        aie106.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Level1Sem2.this,VisitingSite.class);
                intent.putExtra("url","https://drive.google.com/drive/folders/1QL2AoDrVvcy9KYs_V2wMQDUYyj026KnP?usp=sharing");
                startActivity(intent);
            }
        });

        mat105.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Level1Sem2.this,VisitingSite.class);
                intent.putExtra("url","https://drive.google.com/drive/folders/1WrZAwNhRST3tkRoTAUlk-HjQBrXK2-mW?usp=sharing");
                startActivity(intent);
            }
        });

        soc103.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Level1Sem2.this,VisitingSite.class);
                intent.putExtra("url","https://drive.google.com/drive/folders/1uvzz9CBBeJctvN0KZaCi1HJMa1r3q3u2?usp=sharing");
                startActivity(intent);
            }
        });
    }
}