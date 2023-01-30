package com.example.cselearningportalhstu;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.cselearningportalhstu.Model.Users;
import com.example.cselearningportalhstu.Prevalent.Prevalent;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import org.jetbrains.annotations.NotNull;

import io.paperdb.Paper;

public class MainActivity extends AppCompatActivity {

    Button joiNow,logIn;
    ProgressDialog loadingBar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        joiNow=(Button)findViewById(R.id.main_join_now_btn);
        logIn=(Button)findViewById(R.id.main_login_btn);
        loadingBar=new ProgressDialog(this);
        Paper.init(this);

        logIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent=new Intent(MainActivity.this,LoginActivity.class);
                startActivity(intent);
            }
        });

        joiNow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,SendOTP.class);
                startActivity(intent);
            }
        });

        String userPhoneKey=Paper.book().read(Prevalent.userPhoneKey);
        String userPasswordKey=Paper.book().read(Prevalent.userPasswordKey);

        if(userPhoneKey!="" && userPasswordKey!="")
        {

            if(!TextUtils.isEmpty(userPasswordKey) && !TextUtils.isEmpty(userPhoneKey))
            {
                AllowAccess(userPhoneKey,userPasswordKey);
                loadingBar.setTitle("Already Logged in");
                loadingBar.setMessage("Please wait while we are checking your information..");
                loadingBar.setCanceledOnTouchOutside(false);
                loadingBar.show();


            }
        }




    }

    private void AllowAccess(String phone, String password) {

        final DatabaseReference rootRef;
        rootRef= FirebaseDatabase.getInstance().getReference();
        rootRef.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull @NotNull DataSnapshot snapshot) {
                if(snapshot.child("Users").child(phone).exists())
                {

                    Users userData=snapshot.child("Users").child(phone).getValue(Users.class);
                    if(userData.getPhone().equals(phone))
                    {

                        if(userData.getPassword().equals(password))
                        {
                            Toast.makeText(MainActivity.this, "You are already logged in, Please wait...", Toast.LENGTH_SHORT).show();
                            loadingBar.dismiss();
                            Intent intent=new Intent(MainActivity.this,HomeActivity.class);
                            Prevalent.currentOnlineUser=userData;
                            startActivity(intent);
                        }
                        else
                        {
                            loadingBar.dismiss();
                            Toast.makeText(MainActivity.this, "Password is incorrect.", Toast.LENGTH_SHORT).show();
                        }
                    }
                }
                else
                {
                    Toast.makeText(MainActivity.this, "Account with this "+phone+" number do not exists.", Toast.LENGTH_SHORT).show();
                    loadingBar.dismiss();
                }
            }

            @Override
            public void onCancelled(@NonNull @NotNull DatabaseError error) {

            }
        });
    }
}