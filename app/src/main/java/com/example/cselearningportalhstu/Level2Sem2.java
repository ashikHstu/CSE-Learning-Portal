package com.example.cselearningportalhstu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Level2Sem2 extends AppCompatActivity {

    Button cse254,cse255,cse256,cse257,cse258,cse259,ece259,ece260,act205,cse252;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level2_sem2);
        cse254=(Button)findViewById(R.id.cse254);
        cse255=(Button)findViewById(R.id.cse255);
        cse256=(Button)findViewById(R.id.cse256);
        cse257=(Button)findViewById(R.id.cse257);
        cse258=(Button)findViewById(R.id.cse258);
        cse259=(Button)findViewById(R.id.cse259);
       ece259=(Button)findViewById(R.id.ece259);
       ece260=(Button)findViewById(R.id.ece260);
        act205=(Button)findViewById(R.id.act205);
        cse252=(Button)findViewById(R.id.cse252);


        cse254.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Level2Sem2.this,VisitingSite.class);
                intent.putExtra("url","https://drive.google.com/drive/folders/1jftqvD18mrqrMwEKKnBBS6dxvVEepni2?usp=sharing");
                startActivity(intent);
            }
        });

        cse255.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Level2Sem2.this,VisitingSite.class);
                intent.putExtra("url","https://drive.google.com/drive/folders/18zxqndpoTnZy5Vjx2L0Jgve5PRZg-7sR?usp=sharing");
                startActivity(intent);
            }
        });

        cse256.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Level2Sem2.this,VisitingSite.class);
                intent.putExtra("url","https://drive.google.com/drive/folders/1m3ypjDnxdzA9sjQJB0hiz04TzJ8Txi6D?usp=sharing");
                startActivity(intent);
            }
        });


        cse257.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Level2Sem2.this,VisitingSite.class);
                intent.putExtra("url","https://drive.google.com/drive/folders/1WOEmgkwnn3ghQZE-b8K_7JAVRyO5UVS9?usp=sharing");
                startActivity(intent);
            }
        });


        cse258.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Level2Sem2.this,VisitingSite.class);
                intent.putExtra("url","https://drive.google.com/drive/folders/1Ilz-DeallerOVwQwZsCvrji9PTBtgYU-?usp=sharing");
                startActivity(intent);
            }
        });

        cse259.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Level2Sem2.this,VisitingSite.class);
                intent.putExtra("url","https://drive.google.com/drive/folders/1S8GfVPIAwSGo68sua_WKKJQauhJNcXvU?usp=sharing");
                startActivity(intent);
            }
        });

        ece259.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Level2Sem2.this,VisitingSite.class);
                intent.putExtra("url","https://drive.google.com/drive/folders/1-GbJOT6DRmWXo1Ea7q-rWMBOrAxBZpHP?usp=sharing");
                startActivity(intent);
            }
        });




        ece260.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Level2Sem2.this,VisitingSite.class);
                intent.putExtra("url","https://drive.google.com/drive/folders/1KWO0zThjDQ2H8N4IUJJCF05snTaTy58o?usp=sharing");
                startActivity(intent);
            }
        });

        act205.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Level2Sem2.this,VisitingSite.class);
                intent.putExtra("url","https://drive.google.com/drive/folders/1bf9Epadl4AlBpQ4e9IVaKcCfmFf1Umey?usp=sharing");
                startActivity(intent);
            }
        });

        cse252.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Level2Sem2.this,VisitingSite.class);
                intent.putExtra("url","https://drive.google.com/drive/folders/1SnOv3VnOI1k6Chn6Nk9TtbFKHefH4Si8?usp=sharing");
                startActivity(intent);
            }
        });


    }
}