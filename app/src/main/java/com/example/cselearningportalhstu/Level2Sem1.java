package com.example.cselearningportalhstu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Level2Sem1 extends AppCompatActivity {

    Button cse201,cse202,cse203,cse204,cse205,cse206,eee209,eee210,mat201,stt227;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level2_sem1);


        cse201=(Button)findViewById(R.id.cse201);
        cse202=(Button)findViewById(R.id.cse202);
        cse203=(Button)findViewById(R.id.cse203);
        cse204=(Button)findViewById(R.id.cse204);
        cse205=(Button)findViewById(R.id.cse205);
        cse206=(Button)findViewById(R.id.cse206);
        eee209=(Button)findViewById(R.id.eee209);
        eee210=(Button)findViewById(R.id.eee210);
        mat201=(Button)findViewById(R.id.mat201);
        stt227=(Button)findViewById(R.id.stt227);


        cse201.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Level2Sem1.this,VisitingSite.class);
                intent.putExtra("url","https://drive.google.com/drive/folders/1F84bbrOAGCt7NWbBS0BsQOTtkXN4Pive?usp=sharing");
                startActivity(intent);
            }
        });

        cse202.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Level2Sem1.this,VisitingSite.class);
                intent.putExtra("url","https://drive.google.com/drive/folders/1NC0u1i_edPU1azjJFoH3_ho24oGbvN8P?usp=sharing");
                startActivity(intent);
            }
        });


        cse203.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Level2Sem1.this,VisitingSite.class);
                intent.putExtra("url","https://drive.google.com/drive/folders/1_nrRHwHxsBzwkZwXf9RITJLaScAhtsLb?usp=sharing");
                startActivity(intent);
            }
        });

        cse204.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Level2Sem1.this,VisitingSite.class);
                intent.putExtra("url","https://drive.google.com/drive/folders/1GYAAI_ajoarc2bcp5_a_Ms3Ncvdah0Td?usp=sharing");
                startActivity(intent);
            }
        });


        cse205.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Level2Sem1.this,VisitingSite.class);
                intent.putExtra("url","https://drive.google.com/drive/folders/1X9gJ9lwJk-AC0cpwhSrB5Jwny_u3OgB9?usp=sharing");
                startActivity(intent);
            }
        });


        cse206.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Level2Sem1.this,VisitingSite.class);
                intent.putExtra("url","https://drive.google.com/drive/folders/1gk2K7RxbAphcV0ZZcQswZP-C0z2EwZ64?usp=sharing");
                startActivity(intent);
            }
        });

        eee209.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Level2Sem1.this,VisitingSite.class);
                intent.putExtra("url","https://drive.google.com/drive/folders/1mbpjRsIrBvTn0inEtYnei1PQKAFCJt36?usp=sharing");
                startActivity(intent);
            }
        });
        eee210.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Level2Sem1.this,VisitingSite.class);
                intent.putExtra("url","https://drive.google.com/drive/folders/1q7FU9pAaaB4irMH29yhQp9VUNU_77xi-?usp=sharing");
                startActivity(intent);
            }
        });


        mat201.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Level2Sem1.this,VisitingSite.class);
                intent.putExtra("url","https://drive.google.com/drive/folders/1ScddefqQtdHuiZUb-6RQa2sAb-aCGmS_?usp=sharing");
                startActivity(intent);
            }
        });
        stt227.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Level2Sem1.this,VisitingSite.class);
                intent.putExtra("url","https://drive.google.com/drive/folders/1bdYsRcni7h30mAtMXcWbV5gKpXhDbdXj?usp=sharing");
                startActivity(intent);
            }
        });
    }
}