package com.example.cselearningportalhstu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AllCourses extends AppCompatActivity {

    Button cse101,cse102,cse103,mat101,phy103,phy104,aie105,eng101,eng102,cse151,cse152,cse153,cse154,eee155,eee156,aie106,mat105,soc103;

    Button cse201,cse202,cse203,cse204,cse205,cse206,eee209,eee210,mat201,stt227;

    Button cse254,cse255,cse256,cse257,cse258,cse259,ece259,ece260,act205,cse252;

    Button cse303,cse304,cse305,cse307,cse308,ece311,ecn305,cse302;


    Button cse353,cse354,cse355,cse356,cse357,cse358,cse359,cse360,cse361,cse352;

    Button cse403,cse404,cse405,cse406,cse408,cse402;


    Button cse453,cse454,cse455,mgt405,cse452;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_all_courses);




        cse101=(Button)findViewById(R.id.cse101);
        cse102=(Button)findViewById(R.id.cse102);
        cse103=(Button)findViewById(R.id.cse103);
        mat101=(Button)findViewById(R.id.mat101);
        phy103=(Button)findViewById(R.id.phy103);
        phy104=(Button)findViewById(R.id.phy104);
        aie105=(Button)findViewById(R.id.aie105);
        eng101=(Button)findViewById(R.id.eng101);
        eng102=(Button)findViewById(R.id.eng102);


        cse151=(Button)findViewById(R.id.cse151);
        cse152=(Button)findViewById(R.id.cse152);
        cse153=(Button)findViewById(R.id.cse153);
        cse154=(Button)findViewById(R.id.cse154);
        eee155=(Button)findViewById(R.id.eee155);
        eee156=(Button)findViewById(R.id.eee156);
        aie106=(Button)findViewById(R.id.aie106);
        mat105=(Button)findViewById(R.id.mat105);
        soc103=(Button)findViewById(R.id.soc103);



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


        cse303=(Button)findViewById(R.id.cse303);
        cse304=(Button)findViewById(R.id.cse304);
        cse305=(Button)findViewById(R.id.cse305);
        cse307=(Button)findViewById(R.id.cse307);
        cse308=(Button)findViewById(R.id.cse308);
        ece311=(Button)findViewById(R.id.ece311);
        ecn305=(Button)findViewById(R.id.ecn305);
        cse302=(Button)findViewById(R.id.cse302);



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





        cse403=(Button)findViewById(R.id.cse403);
        cse404=(Button)findViewById(R.id.cse404);
        cse405=(Button)findViewById(R.id.cse405);
        cse406=(Button)findViewById(R.id.cse406);
        cse408=(Button)findViewById(R.id.cse408);
        cse402=(Button)findViewById(R.id.cse402);






        cse453=(Button)findViewById(R.id.cse453);
        cse454=(Button)findViewById(R.id.cse454);
        cse455=(Button)findViewById(R.id.cse455);
        mgt405=(Button)findViewById(R.id.mgt405);
        cse452=(Button)findViewById(R.id.cse452);


        // Level 1, Semester I
        cse101.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent=new Intent(AllCourses.this,VisitingSite.class);
                intent.putExtra("url","https://drive.google.com/drive/folders/1v5DDkBF2B2A6AvciyyyxtzfOSHsQJkgk?usp=sharing");
                startActivity(intent);
            }
        });

        cse102.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent=new Intent(AllCourses.this,VisitingSite.class);
                intent.putExtra("url","https://drive.google.com/drive/folders/1LoTGEux4xzGCqmGTI3QkTblD2Fuhn8_4?usp=sharing");
                startActivity(intent);
            }
        });



        cse103.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(AllCourses.this,VisitingSite.class);
                intent.putExtra("url","https://drive.google.com/drive/folders/1esO4Co3H3o2zHVLoEEAmeFwQsOX9s0y5?usp=sharing");
                startActivity(intent);
            }
        });

        mat101.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(AllCourses.this,VisitingSite.class);
                intent.putExtra("url","https://drive.google.com/drive/folders/1vdZ-XrpETU1KSqBsf9dQhE3-btQOQwc8?usp=sharing");
                startActivity(intent);
            }
        });

        phy103.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(AllCourses.this,VisitingSite.class);
                intent.putExtra("url","https://drive.google.com/drive/folders/1ZXE_atpN4NdqhBwY6G8gCtBr5h0EXbjv?usp=sharing");
                startActivity(intent);
            }
        });

        phy104.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(AllCourses.this,VisitingSite.class);
                intent.putExtra("url","https://drive.google.com/drive/folders/1FYscs8qwXatUeuNdM6FIhZjrPTnJ0Vtn?usp=sharing");
                startActivity(intent);
            }
        });

        aie105.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(AllCourses.this,VisitingSite.class);
                intent.putExtra("url","https://drive.google.com/drive/folders/1qJrOZ34GY_9II4LJqz-pu_VuaIbkrDOu?usp=sharing");
                startActivity(intent);
            }
        });

        eng101.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(AllCourses.this,VisitingSite.class);
                intent.putExtra("url","https://drive.google.com/drive/folders/1fMpBUEGBjyXgqvB7OQd2cW92IWkR8nAh?usp=sharing");
                startActivity(intent);
            }
        });

        eng102.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(AllCourses.this,VisitingSite.class);
                intent.putExtra("url","https://drive.google.com/drive/folders/16_bphBgYeHxSAzSf9yUOrcF0yZCuMlvL?usp=sharing");
                startActivity(intent);
            }
        });







        // Level 1, Semester II

        cse151.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(AllCourses.this,VisitingSite.class);
                intent.putExtra("url","https://drive.google.com/drive/folders/1ZTtp8LOB-Hp975I9bQF1ZMFQJIb3J2Oy?usp=sharing");
                startActivity(intent);
            }
        });

        cse152.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(AllCourses.this,VisitingSite.class);
                intent.putExtra("url","https://drive.google.com/drive/folders/10Sj7t_obqFfHW6perxU7oq8U8mtYewgg?usp=sharing");
                startActivity(intent);
            }
        });

        cse153.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(AllCourses.this,VisitingSite.class);
                intent.putExtra("url","https://drive.google.com/drive/folders/1sQHDe0fvB9m7bv169k3AaiRux2_MwODz?usp=sharing");
                startActivity(intent);
            }
        });

        cse154.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(AllCourses.this,VisitingSite.class);
                intent.putExtra("url","https://drive.google.com/drive/folders/1VHpiqNNMDZ9GCbXMuK_nifH-iUZcgVrr?usp=sharing");
                startActivity(intent);
            }
        });

        eee155.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(AllCourses.this,VisitingSite.class);
                intent.putExtra("url","https://drive.google.com/drive/folders/1nWuZHXn86wYK__r5s5qoqzvrvv3afE4f?usp=sharing");
                startActivity(intent);
            }
        });



        eee156.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(AllCourses.this,VisitingSite.class);
                intent.putExtra("url","https://drive.google.com/drive/folders/1UosSawS99TGRRaDha75l7dCrk9kZ3f-g?usp=sharing");
                startActivity(intent);
            }
        });

        aie106.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(AllCourses.this,VisitingSite.class);
                intent.putExtra("url","https://drive.google.com/drive/folders/1QL2AoDrVvcy9KYs_V2wMQDUYyj026KnP?usp=sharing");
                startActivity(intent);
            }
        });

        mat105.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(AllCourses.this,VisitingSite.class);
                intent.putExtra("url","https://drive.google.com/drive/folders/1WrZAwNhRST3tkRoTAUlk-HjQBrXK2-mW?usp=sharing");
                startActivity(intent);
            }
        });

        soc103.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(AllCourses.this,VisitingSite.class);
                intent.putExtra("url","https://drive.google.com/drive/folders/1uvzz9CBBeJctvN0KZaCi1HJMa1r3q3u2?usp=sharing");
                startActivity(intent);
            }
        });





        // Level 2, Semester I


        cse201.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(AllCourses.this,VisitingSite.class);
                intent.putExtra("url","https://drive.google.com/drive/folders/1F84bbrOAGCt7NWbBS0BsQOTtkXN4Pive?usp=sharing");
                startActivity(intent);
            }
        });

        cse202.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(AllCourses.this,VisitingSite.class);
                intent.putExtra("url","https://drive.google.com/drive/folders/1NC0u1i_edPU1azjJFoH3_ho24oGbvN8P?usp=sharing");
                startActivity(intent);
            }
        });


        cse203.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(AllCourses.this,VisitingSite.class);
                intent.putExtra("url","https://drive.google.com/drive/folders/1_nrRHwHxsBzwkZwXf9RITJLaScAhtsLb?usp=sharing");
                startActivity(intent);
            }
        });

        cse204.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(AllCourses.this,VisitingSite.class);
                intent.putExtra("url","https://drive.google.com/drive/folders/1GYAAI_ajoarc2bcp5_a_Ms3Ncvdah0Td?usp=sharing");
                startActivity(intent);
            }
        });


        cse205.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(AllCourses.this,VisitingSite.class);
                intent.putExtra("url","https://drive.google.com/drive/folders/1X9gJ9lwJk-AC0cpwhSrB5Jwny_u3OgB9?usp=sharing");
                startActivity(intent);
            }
        });


        cse206.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(AllCourses.this,VisitingSite.class);
                intent.putExtra("url","https://drive.google.com/drive/folders/1gk2K7RxbAphcV0ZZcQswZP-C0z2EwZ64?usp=sharing");
                startActivity(intent);
            }
        });

        eee209.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(AllCourses.this,VisitingSite.class);
                intent.putExtra("url","https://drive.google.com/drive/folders/1mbpjRsIrBvTn0inEtYnei1PQKAFCJt36?usp=sharing");
                startActivity(intent);
            }
        });
        eee210.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(AllCourses.this,VisitingSite.class);
                intent.putExtra("url","https://drive.google.com/drive/folders/1q7FU9pAaaB4irMH29yhQp9VUNU_77xi-?usp=sharing");
                startActivity(intent);
            }
        });


        mat201.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(AllCourses.this,VisitingSite.class);
                intent.putExtra("url","https://drive.google.com/drive/folders/1ScddefqQtdHuiZUb-6RQa2sAb-aCGmS_?usp=sharing");
                startActivity(intent);
            }
        });
        stt227.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(AllCourses.this,VisitingSite.class);
                intent.putExtra("url","https://drive.google.com/drive/folders/1bdYsRcni7h30mAtMXcWbV5gKpXhDbdXj?usp=sharing");
                startActivity(intent);
            }
        });




        // Level2, Semester II


        cse254.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(AllCourses.this,VisitingSite.class);
                intent.putExtra("url","https://drive.google.com/drive/folders/1jftqvD18mrqrMwEKKnBBS6dxvVEepni2?usp=sharing");
                startActivity(intent);
            }
        });

        cse255.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(AllCourses.this,VisitingSite.class);
                intent.putExtra("url","https://drive.google.com/drive/folders/18zxqndpoTnZy5Vjx2L0Jgve5PRZg-7sR?usp=sharing");
                startActivity(intent);
            }
        });

        cse256.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(AllCourses.this,VisitingSite.class);
                intent.putExtra("url","https://drive.google.com/drive/folders/1m3ypjDnxdzA9sjQJB0hiz04TzJ8Txi6D?usp=sharing");
                startActivity(intent);
            }
        });


        cse257.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(AllCourses.this,VisitingSite.class);
                intent.putExtra("url","https://drive.google.com/drive/folders/1WOEmgkwnn3ghQZE-b8K_7JAVRyO5UVS9?usp=sharing");
                startActivity(intent);
            }
        });


        cse258.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(AllCourses.this,VisitingSite.class);
                intent.putExtra("url","https://drive.google.com/drive/folders/1Ilz-DeallerOVwQwZsCvrji9PTBtgYU-?usp=sharing");
                startActivity(intent);
            }
        });

        cse259.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(AllCourses.this,VisitingSite.class);
                intent.putExtra("url","https://drive.google.com/drive/folders/1S8GfVPIAwSGo68sua_WKKJQauhJNcXvU?usp=sharing");
                startActivity(intent);
            }
        });

        ece259.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(AllCourses.this,VisitingSite.class);
                intent.putExtra("url","https://drive.google.com/drive/folders/1-GbJOT6DRmWXo1Ea7q-rWMBOrAxBZpHP?usp=sharing");
                startActivity(intent);
            }
        });




        ece260.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(AllCourses.this,VisitingSite.class);
                intent.putExtra("url","https://drive.google.com/drive/folders/1KWO0zThjDQ2H8N4IUJJCF05snTaTy58o?usp=sharing");
                startActivity(intent);
            }
        });

        act205.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(AllCourses.this,VisitingSite.class);
                intent.putExtra("url","https://drive.google.com/drive/folders/1bf9Epadl4AlBpQ4e9IVaKcCfmFf1Umey?usp=sharing");
                startActivity(intent);
            }
        });

        cse252.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(AllCourses.this,VisitingSite.class);
                intent.putExtra("url","https://drive.google.com/drive/folders/1SnOv3VnOI1k6Chn6Nk9TtbFKHefH4Si8?usp=sharing");
                startActivity(intent);
            }
        });



        // Level 3, Semester I

        cse303.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(AllCourses.this,VisitingSite.class);
                intent.putExtra("url","https://drive.google.com/drive/folders/1EAqbNBdxutOVi_v0C7FOl-K_c-0YCoHl?usp=sharing");
                startActivity(intent);
            }
        });

        cse304.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(AllCourses.this,VisitingSite.class);
                intent.putExtra("url","https://drive.google.com/drive/folders/1K6dzmtLic9zBlRdGZNc6w7fK4Q_O0Ipn?usp=sharing");
                startActivity(intent);
            }
        });

        cse305.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(AllCourses.this,VisitingSite.class);
                intent.putExtra("url","https://drive.google.com/drive/folders/1mi-S1SIzWUf6DQ7NbMHick5Bks9d7clB?usp=sharing");
                startActivity(intent);
            }
        });

        cse307.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(AllCourses.this,VisitingSite.class);
                intent.putExtra("url","https://drive.google.com/drive/folders/1piWYyCe0bjZ_tP-TbNcG8zQzE3KNmwEH?usp=sharing");
                startActivity(intent);
            }
        });

        cse308.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(AllCourses.this,VisitingSite.class);
                intent.putExtra("url","https://drive.google.com/drive/folders/1MVNHcy8WCn0RG68_cejpQx5zGy6_DN92?usp=sharing");
                startActivity(intent);
            }
        });

        ece311.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(AllCourses.this,VisitingSite.class);
                intent.putExtra("url","https://drive.google.com/drive/folders/1492SV0Uszp368P_b0vbEqZGbBCDZbHyo?usp=sharing");
                startActivity(intent);
            }
        });

        ecn305.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(AllCourses.this,VisitingSite.class);
                intent.putExtra("url","https://drive.google.com/drive/folders/1fhjY-1XRRJZKQhh4pe1rSCiPcL0HI4c_?usp=sharing");
                startActivity(intent);
            }
        });

        cse302.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(AllCourses.this,VisitingSite.class);
                intent.putExtra("url","https://drive.google.com/drive/folders/1v21IbRaCWGdMZV8lT5dkDTUzde3Ei1dk?usp=sharing");
                startActivity(intent);
            }
        });


        // Level 3, Semester II



        cse353.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(AllCourses.this,VisitingSite.class);
                intent.putExtra("url","https://drive.google.com/drive/folders/14IfFt-mwdTELGHbfdgjhjbqch9uO-04n?usp=sharing");
                startActivity(intent);
            }
        });


        cse354.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(AllCourses.this,VisitingSite.class);
                intent.putExtra("url","https://drive.google.com/drive/folders/1sBfrkV3DvYHqBzZSm8n7_wOoDLCRTTG1?usp=sharing");
                startActivity(intent);
            }
        });

        cse355.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(AllCourses.this,VisitingSite.class);
                intent.putExtra("url","https://drive.google.com/drive/folders/16Yu_DT_Z2ZzSdoATOTaDlpMA_8Ug5R12?usp=sharing");
                startActivity(intent);
            }
        });


        cse356.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(AllCourses.this,VisitingSite.class);
                intent.putExtra("url","https://drive.google.com/drive/folders/1ZervNs5SOB_I2SnsGlI599tYD2XMrdYn?usp=sharing");
                startActivity(intent);
            }
        });


        cse357.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(AllCourses.this,VisitingSite.class);
                intent.putExtra("url","https://drive.google.com/drive/folders/1KmSdcvFV6KZfVzPKYHtn2CFWkXu8-77P?usp=sharing");
                startActivity(intent);
            }
        });

        cse358.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(AllCourses.this,VisitingSite.class);
                intent.putExtra("url","https://drive.google.com/drive/folders/1tFzWaAh-gsmZKdewRUlOCqQPMiaOnCaG?usp=sharing");
                startActivity(intent);
            }
        });


        cse359.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(AllCourses.this,VisitingSite.class);
                intent.putExtra("url","https://drive.google.com/drive/folders/1qJGvDxECI1t4aoDlnChj44JMpxZ7WgZ_?usp=sharing");
                startActivity(intent);
            }
        });

        cse360.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(AllCourses.this,VisitingSite.class);
                intent.putExtra("url","https://drive.google.com/drive/folders/113B3Q2t7ZIf0MoyFJvFdL_mOE80TLRp5?usp=sharing");
                startActivity(intent);
            }
        });


        cse361.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(AllCourses.this,VisitingSite.class);
                intent.putExtra("url","https://drive.google.com/drive/folders/1pZjfSh1SU5VoCIBe49iNZRDa5PtCfkXi?usp=sharing");
                startActivity(intent);
            }
        });

        cse352.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(AllCourses.this,VisitingSite.class);
                intent.putExtra("url","https://drive.google.com/drive/folders/1R4hD40KvSuZkFRqV8BL5SUMDEgomLecu?usp=sharing");
                startActivity(intent);
            }
        });





        // Level 4, Semester I



        cse403.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(AllCourses.this,VisitingSite.class);
                intent.putExtra("url","https://drive.google.com/drive/folders/1xLT0bCW1YVXsNML6QB5flzfwe0vQqzbX?usp=sharing");
                startActivity(intent);
            }
        });

        cse404.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(AllCourses.this,VisitingSite.class);
                intent.putExtra("url","https://drive.google.com/drive/folders/1bPQVk1rCQGdc2lyG8Zawo9-Iy1fETA66?usp=sharing");
                startActivity(intent);
            }
        });

        cse405.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(AllCourses.this,VisitingSite.class);
                intent.putExtra("url","https://drive.google.com/drive/folders/1IDbc8sJ78YmoxnBMjmJUL8cp80e0fUl1?usp=sharing");
                startActivity(intent);
            }
        });

        cse406.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(AllCourses.this,VisitingSite.class);
                intent.putExtra("url","https://drive.google.com/drive/folders/1-ZWa6_F8QdOmG38K0GdhH77oA3wsLpbG?usp=sharing");
                startActivity(intent);
            }
        });

        cse408.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(AllCourses.this,VisitingSite.class);
                intent.putExtra("url","https://drive.google.com/drive/folders/1QkjgR3QcfL-7M8Ly3AzoQsBxsw-nHXDp?usp=sharing");
                startActivity(intent);
            }
        });


        cse402.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(AllCourses.this,VisitingSite.class);
                intent.putExtra("url","https://drive.google.com/drive/folders/1CgRKNQ-B-h1PlHBgrhb_hnQs4-VzP1Tn?usp=sharing");
                startActivity(intent);
            }
        });



        // Level 4, Semester -II


        cse453.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(AllCourses.this,VisitingSite.class);
                intent.putExtra("url","https://drive.google.com/drive/folders/1t-ITUrSxRzvI5uthjYlaH-VVGIEp-Zr7?usp=sharing");
                startActivity(intent);
            }
        });

        cse454.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(AllCourses.this,VisitingSite.class);
                intent.putExtra("url","https://drive.google.com/drive/folders/1xSWJQvj1n7J50umGAdP40zW7lhgkCz1n?usp=sharing");
                startActivity(intent);
            }
        });

        cse455.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(AllCourses.this,VisitingSite.class);
                intent.putExtra("url","https://drive.google.com/drive/folders/1H8RJZVEwJJv78GfYkEBuOYN9Z4e2G8ql?usp=sharing");
                startActivity(intent);
            }
        });

        mgt405.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(AllCourses.this,VisitingSite.class);
                intent.putExtra("url","https://drive.google.com/drive/folders/1Q7SQoRSlFDTkQLlUFyzZWiLbIjy3gV_6?usp=sharing");
                startActivity(intent);
            }
        });

        cse452.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(AllCourses.this,VisitingSite.class);
                intent.putExtra("url","https://drive.google.com/drive/folders/1aU5OS-Z4vYRWTZCwfIOIStSgZDP_029X?usp=sharing");
                startActivity(intent);
            }
        });



    }
}