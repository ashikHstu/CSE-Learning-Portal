package com.example.cselearningportalhstu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class EEE extends AppCompatActivity {

    Button phy103,phy104,eee155,eee156,eee209,eee210;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eee);

        phy103=(Button)findViewById(R.id.phy103);
        phy104=(Button)findViewById(R.id.phy104);
        eee155=(Button)findViewById(R.id.eee155);
        eee156=(Button)findViewById(R.id.eee156);

        eee209=(Button)findViewById(R.id.eee209);
        eee210=(Button)findViewById(R.id.eee210);



        phy103.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(EEE.this,VisitingSite.class);
                intent.putExtra("url","https://drive.google.com/drive/folders/1ZXE_atpN4NdqhBwY6G8gCtBr5h0EXbjv?usp=sharing");
                startActivity(intent);
            }
        });

        phy104.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(EEE.this,VisitingSite.class);
                intent.putExtra("url","https://drive.google.com/drive/folders/1FYscs8qwXatUeuNdM6FIhZjrPTnJ0Vtn?usp=sharing");
                startActivity(intent);
            }
        });


        eee155.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(EEE.this,VisitingSite.class);
                intent.putExtra("url","https://drive.google.com/drive/folders/1nWuZHXn86wYK__r5s5qoqzvrvv3afE4f?usp=sharing");
                startActivity(intent);
            }
        });



        eee156.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(EEE.this,VisitingSite.class);
                intent.putExtra("url","https://drive.google.com/drive/folders/1UosSawS99TGRRaDha75l7dCrk9kZ3f-g?usp=sharing");
                startActivity(intent);
            }
        });



        eee209.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(EEE.this,VisitingSite.class);
                intent.putExtra("url","https://drive.google.com/drive/folders/1mbpjRsIrBvTn0inEtYnei1PQKAFCJt36?usp=sharing");
                startActivity(intent);
            }
        });
        eee210.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(EEE.this,VisitingSite.class);
                intent.putExtra("url","https://drive.google.com/drive/folders/1q7FU9pAaaB4irMH29yhQp9VUNU_77xi-?usp=sharing");
                startActivity(intent);
            }
        });
    }
}