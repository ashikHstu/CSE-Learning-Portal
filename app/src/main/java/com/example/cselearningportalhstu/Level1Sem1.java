package com.example.cselearningportalhstu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Level1Sem1 extends AppCompatActivity {

    Button cse101,cse102,cse103,mat101,phy103,phy104,aie105,eng101,eng102;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level1_sem1);

        cse101=(Button)findViewById(R.id.cse101);
        cse102=(Button)findViewById(R.id.cse102);
        cse103=(Button)findViewById(R.id.cse103);
        mat101=(Button)findViewById(R.id.mat101);
        phy103=(Button)findViewById(R.id.phy103);
        phy104=(Button)findViewById(R.id.phy104);
        aie105=(Button)findViewById(R.id.aie105);
        eng101=(Button)findViewById(R.id.eng101);
        eng102=(Button)findViewById(R.id.eng102);


        cse101.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent=new Intent(Level1Sem1.this,VisitingSite.class);
                intent.putExtra("url","https://drive.google.com/drive/folders/1v5DDkBF2B2A6AvciyyyxtzfOSHsQJkgk?usp=sharing");
                startActivity(intent);
            }
        });

        cse102.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent=new Intent(Level1Sem1.this,VisitingSite.class);
                intent.putExtra("url","https://drive.google.com/drive/folders/1LoTGEux4xzGCqmGTI3QkTblD2Fuhn8_4?usp=sharing");
                startActivity(intent);
            }
        });



        cse103.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Level1Sem1.this,VisitingSite.class);
                intent.putExtra("url","https://drive.google.com/drive/folders/1esO4Co3H3o2zHVLoEEAmeFwQsOX9s0y5?usp=sharing");
                startActivity(intent);
            }
        });

        mat101.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Level1Sem1.this,VisitingSite.class);
                intent.putExtra("url","https://drive.google.com/drive/folders/1vdZ-XrpETU1KSqBsf9dQhE3-btQOQwc8?usp=sharing");
                startActivity(intent);
            }
        });

        phy103.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Level1Sem1.this,VisitingSite.class);
                intent.putExtra("url","https://drive.google.com/drive/folders/1ZXE_atpN4NdqhBwY6G8gCtBr5h0EXbjv?usp=sharing");
                startActivity(intent);
            }
        });

        phy104.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Level1Sem1.this,VisitingSite.class);
                intent.putExtra("url","https://drive.google.com/drive/folders/1FYscs8qwXatUeuNdM6FIhZjrPTnJ0Vtn?usp=sharing");
                startActivity(intent);
            }
        });

       aie105.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Level1Sem1.this,VisitingSite.class);
                intent.putExtra("url","https://drive.google.com/drive/folders/1qJrOZ34GY_9II4LJqz-pu_VuaIbkrDOu?usp=sharing");
                startActivity(intent);
            }
        });

        eng101.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Level1Sem1.this,VisitingSite.class);
                intent.putExtra("url","https://drive.google.com/drive/folders/1fMpBUEGBjyXgqvB7OQd2cW92IWkR8nAh?usp=sharing");
                startActivity(intent);
            }
        });

        eng102.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Level1Sem1.this,VisitingSite.class);
                intent.putExtra("url","https://drive.google.com/drive/folders/16_bphBgYeHxSAzSf9yUOrcF0yZCuMlvL?usp=sharing");
                startActivity(intent);
            }
        });


    }
}