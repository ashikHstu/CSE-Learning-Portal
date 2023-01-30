package com.example.cselearningportalhstu;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AllQuestions extends AppCompatActivity {

    Button l1s1,l1s2,l2s1,l2s2,l3s1,l3s2,l4s1,l4s2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_all_questions);


        l1s1=(Button)findViewById(R.id.l1s1);
        l1s2=(Button)findViewById(R.id.l1s2);
        l2s1=(Button)findViewById(R.id.l2s1);
        l2s2=(Button)findViewById(R.id.l2s2);
        l3s1=(Button)findViewById(R.id.l3s1);
        l3s2=(Button)findViewById(R.id.l3s2);
        l4s1=(Button)findViewById(R.id.l4s1);
        l4s2=(Button)findViewById(R.id.l4s2);


        l1s1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(AllQuestions.this,VisitingSite.class);
                intent.putExtra("url","https://drive.google.com/drive/folders/11M-vL_NagnV6srZbDVcBK0S9GejtMgHN?usp=sharing");
                startActivity(intent);

            }
        });

        l1s2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(AllQuestions.this,VisitingSite.class);
                intent.putExtra("url","https://drive.google.com/drive/folders/1iocxCtiNFmAuxQxGrI3Hn7Uaol5id16c?usp=sharing");
                startActivity(intent);

            }
        });

        l2s1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(AllQuestions.this,VisitingSite.class);
                intent.putExtra("url","https://drive.google.com/drive/folders/1ZPipoAWvsVm49fwFl2rEB0L3nAJ0z3a-?usp=sharing");
                startActivity(intent);

            }
        });

        l2s2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(AllQuestions.this,VisitingSite.class);
                intent.putExtra("url","https://drive.google.com/drive/folders/1c84VB9_NzF_WnI9dsw7SUndjDsshO-Gg?usp=sharing");
                startActivity(intent);

            }
        });


        l3s1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(AllQuestions.this,VisitingSite.class);
                intent.putExtra("url","https://drive.google.com/drive/folders/1xI44DUknJ3Nrl3tWcTq1XCXL-aXOKg7R?usp=sharing");
                startActivity(intent);

            }
        });


        l3s2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(AllQuestions.this,VisitingSite.class);
                intent.putExtra("url","https://drive.google.com/drive/folders/1hLuUyLlgYyU2chciCSeupZk-VwmfMypz?usp=sharing");
                startActivity(intent);

            }
        });

        l4s1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(AllQuestions.this,VisitingSite.class);
                intent.putExtra("url","https://drive.google.com/drive/folders/1ln2M68er-oVOza223J0eeDIOf_DIkJCQ?usp=sharing");
                startActivity(intent);

            }
        });

        l4s2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(AllQuestions.this,VisitingSite.class);
                intent.putExtra("url","https://drive.google.com/drive/folders/1YgX3GwJWwnkYvfDKcBkGihbKc4MYLK80?usp=sharing");
                startActivity(intent);

            }
        });





    }
}