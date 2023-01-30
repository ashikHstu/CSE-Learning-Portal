package com.example.cselearningportalhstu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Level3Sem2 extends AppCompatActivity {
    Button cse353,cse354,cse355,cse356,cse357,cse358,cse359,cse360,cse361,cse352;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level3_sem2);

        cse353=(Button)findViewById(R.id.cse353);
        cse354=(Button)findViewById(R.id.cse354);
        cse355=(Button)findViewById(R.id.cse355);
        cse356=(Button)findViewById(R.id.cse356);
        cse357=(Button)findViewById(R.id.cse357);
        cse358=(Button)findViewById(R.id.cse358);
        cse359=(Button)findViewById(R.id.cse359);
        cse360=(Button)findViewById(R.id.cse360);
        cse361=(Button)findViewById(R.id.cse361);
        cse352=(Button)findViewById(R.id.cse352);


        cse353.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Level3Sem2.this,VisitingSite.class);
                intent.putExtra("url","https://drive.google.com/drive/folders/14IfFt-mwdTELGHbfdgjhjbqch9uO-04n?usp=sharing");
                startActivity(intent);
            }
        });


        cse354.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Level3Sem2.this,VisitingSite.class);
                intent.putExtra("url","https://drive.google.com/drive/folders/1sBfrkV3DvYHqBzZSm8n7_wOoDLCRTTG1?usp=sharing");
                startActivity(intent);
            }
        });

        cse355.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Level3Sem2.this,VisitingSite.class);
                intent.putExtra("url","https://drive.google.com/drive/folders/16Yu_DT_Z2ZzSdoATOTaDlpMA_8Ug5R12?usp=sharing");
                startActivity(intent);
            }
        });


        cse356.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Level3Sem2.this,VisitingSite.class);
                intent.putExtra("url","https://drive.google.com/drive/folders/1ZervNs5SOB_I2SnsGlI599tYD2XMrdYn?usp=sharing");
                startActivity(intent);
            }
        });


        cse357.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Level3Sem2.this,VisitingSite.class);
                intent.putExtra("url","https://drive.google.com/drive/folders/1KmSdcvFV6KZfVzPKYHtn2CFWkXu8-77P?usp=sharing");
                startActivity(intent);
            }
        });

        cse358.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Level3Sem2.this,VisitingSite.class);
                intent.putExtra("url","https://drive.google.com/drive/folders/1tFzWaAh-gsmZKdewRUlOCqQPMiaOnCaG?usp=sharing");
                startActivity(intent);
            }
        });


        cse359.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Level3Sem2.this,VisitingSite.class);
                intent.putExtra("url","https://drive.google.com/drive/folders/1qJGvDxECI1t4aoDlnChj44JMpxZ7WgZ_?usp=sharing");
                startActivity(intent);
            }
        });

        cse360.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Level3Sem2.this,VisitingSite.class);
                intent.putExtra("url","https://drive.google.com/drive/folders/113B3Q2t7ZIf0MoyFJvFdL_mOE80TLRp5?usp=sharing");
                startActivity(intent);
            }
        });


        cse361.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Level3Sem2.this,VisitingSite.class);
                intent.putExtra("url","https://drive.google.com/drive/folders/1pZjfSh1SU5VoCIBe49iNZRDa5PtCfkXi?usp=sharing");
                startActivity(intent);
            }
        });

        cse352.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Level3Sem2.this,VisitingSite.class);
                intent.putExtra("url","https://drive.google.com/drive/folders/1R4hD40KvSuZkFRqV8BL5SUMDEgomLecu?usp=sharing");
                startActivity(intent);
            }
        });



    }
}