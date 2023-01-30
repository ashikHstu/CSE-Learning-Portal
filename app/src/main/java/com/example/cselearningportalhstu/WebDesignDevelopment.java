package com.example.cselearningportalhstu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class WebDesignDevelopment extends AppCompatActivity {
    Button cse355,cse356,cse352;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_design_development);

        cse355=(Button)findViewById(R.id.cse355);
        cse356=(Button)findViewById(R.id.cse356);
        cse352=(Button)findViewById(R.id.cse352);


        cse355.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(WebDesignDevelopment.this,VisitingSite.class);
                intent.putExtra("url","https://drive.google.com/drive/folders/16Yu_DT_Z2ZzSdoATOTaDlpMA_8Ug5R12?usp=sharing");
                startActivity(intent);
            }
        });


        cse356.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(WebDesignDevelopment.this,VisitingSite.class);
                intent.putExtra("url","https://drive.google.com/drive/folders/1ZervNs5SOB_I2SnsGlI599tYD2XMrdYn?usp=sharing");
                startActivity(intent);
            }
        });

        cse352.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(WebDesignDevelopment.this,VisitingSite.class);;
                intent.putExtra("url","https://drive.google.com/drive/folders/1R4hD40KvSuZkFRqV8BL5SUMDEgomLecu?usp=sharing");
                startActivity(intent);
            }
        });

    }
}