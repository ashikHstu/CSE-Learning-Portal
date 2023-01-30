package com.example.cselearningportalhstu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Level4Sem2 extends AppCompatActivity {
    Button cse453,cse454,cse455,mgt405,cse452;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level4_sem2);

        cse453=(Button)findViewById(R.id.cse453);
        cse454=(Button)findViewById(R.id.cse454);
        cse455=(Button)findViewById(R.id.cse455);
        mgt405=(Button)findViewById(R.id.mgt405);
        cse452=(Button)findViewById(R.id.cse452);



        cse453.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Level4Sem2.this,VisitingSite.class);
                intent.putExtra("url","https://drive.google.com/drive/folders/1t-ITUrSxRzvI5uthjYlaH-VVGIEp-Zr7?usp=sharing");
                startActivity(intent);
            }
        });

        cse454.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Level4Sem2.this,VisitingSite.class);
                intent.putExtra("url","https://drive.google.com/drive/folders/1xSWJQvj1n7J50umGAdP40zW7lhgkCz1n?usp=sharing");
                startActivity(intent);
            }
        });

        cse455.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Level4Sem2.this,VisitingSite.class);
                intent.putExtra("url","https://drive.google.com/drive/folders/1H8RJZVEwJJv78GfYkEBuOYN9Z4e2G8ql?usp=sharing");
                startActivity(intent);
            }
        });

        mgt405.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Level4Sem2.this,VisitingSite.class);
                intent.putExtra("url","https://drive.google.com/drive/folders/1Q7SQoRSlFDTkQLlUFyzZWiLbIjy3gV_6?usp=sharing");
                startActivity(intent);
            }
        });

        cse452.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Level4Sem2.this,VisitingSite.class);
                intent.putExtra("url","https://drive.google.com/drive/folders/1aU5OS-Z4vYRWTZCwfIOIStSgZDP_029X?usp=sharing");
                startActivity(intent);
            }
        });


    }
}