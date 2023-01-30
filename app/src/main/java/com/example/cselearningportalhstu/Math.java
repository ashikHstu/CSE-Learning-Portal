package com.example.cselearningportalhstu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Math extends AppCompatActivity {

    Button cse103,mat101,mat105,mat201;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_math);

        cse103=(Button)findViewById(R.id.cse103);
        mat101=(Button)findViewById(R.id.mat101);
        mat105=(Button)findViewById(R.id.mat105);
        mat201=(Button)findViewById(R.id.mat201);


        cse103.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Math.this,VisitingSite.class);
                intent.putExtra("url","https://drive.google.com/drive/folders/1esO4Co3H3o2zHVLoEEAmeFwQsOX9s0y5?usp=sharing");
                startActivity(intent);
            }
        });

        mat101.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Math.this,VisitingSite.class);
                intent.putExtra("url","https://drive.google.com/drive/folders/1vdZ-XrpETU1KSqBsf9dQhE3-btQOQwc8?usp=sharing");
                startActivity(intent);
            }
        });

        mat105.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Math.this,VisitingSite.class);
                intent.putExtra("url","https://drive.google.com/drive/folders/1WrZAwNhRST3tkRoTAUlk-HjQBrXK2-mW?usp=sharing");
                startActivity(intent);
            }
        });

        mat201.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Math.this,VisitingSite.class);
                intent.putExtra("url","https://drive.google.com/drive/folders/1ScddefqQtdHuiZUb-6RQa2sAb-aCGmS_?usp=sharing");
                startActivity(intent);
            }
        });
    }
}