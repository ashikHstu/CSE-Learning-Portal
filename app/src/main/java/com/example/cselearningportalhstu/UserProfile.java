package com.example.cselearningportalhstu;




import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


import com.example.cselearningportalhstu.Prevalent.Prevalent;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.StorageReference;
import com.google.firebase.storage.StorageTask;
import com.squareup.picasso.Picasso;
import com.theartofdev.edmodo.cropper.CropImage;

import org.jetbrains.annotations.NotNull;

import java.util.HashMap;

import de.hdodenhof.circleimageview.CircleImageView;

import android.os.Bundle;

public class UserProfile extends AppCompatActivity {

    private CircleImageView profileImageView;
    private TextView fullNameEditText,userPhoneEditText,addressEditText;
    private TextView profileChangeTextBtn,closeTextBtn,saveTextButton;

    private Uri imageUri;
    private String myUrl="";
    private StorageReference storageProfilePictureRef;
    private String checker="";
    private StorageTask uploadTask;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_profile);

        storageProfilePictureRef= FirebaseStorage.getInstance().getReference().child("Profile pictures");
        profileImageView=(CircleImageView)findViewById(R.id.settings_profile_image);
        fullNameEditText=(TextView) findViewById(R.id.settings_full_name);
        userPhoneEditText=(TextView) findViewById(R.id.settings_phone_number);
        addressEditText=(TextView)findViewById(R.id.settings_adress);

        profileChangeTextBtn=(TextView)findViewById(R.id.profile_image_change_btn);
        closeTextBtn=(TextView)findViewById(R.id.close_settings_btn);
        saveTextButton=(TextView)findViewById(R.id.update_account_settings_btn);

        userInfoDisplay(profileImageView,fullNameEditText,userPhoneEditText,addressEditText);

        closeTextBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        saveTextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(UserProfile.this,SettingsActivity.class);
                startActivity(intent);
            }
        });




    }

    private void userInfoDisplay(CircleImageView profileImageView, TextView fullNameEditText, TextView userPhoneEditText, TextView addressEditText) {

        DatabaseReference UserRef= FirebaseDatabase.getInstance().getReference().child("Users").child(Prevalent.currentOnlineUser.getPhone());

        UserRef.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull @NotNull DataSnapshot snapshot) {
                if(snapshot.exists())
                {
                    if(snapshot.child("image").exists())
                    {
                        String image=snapshot.child("image").getValue().toString();
                        String name=snapshot.child("name").getValue().toString();
                        String phone=snapshot.child("phoneOrder").getValue().toString();
                        String address=snapshot.child("address").getValue().toString();

                        Picasso.get().load(image).into(profileImageView);

                        fullNameEditText.setText("Name  : "+name);
                        userPhoneEditText.setText("Phone : "+phone);
                        addressEditText.setText("Student id : "+address);

                    }
                    if(snapshot.child("name").exists())
                    {
                        String name=snapshot.child("name").getValue().toString();
                        fullNameEditText.setText("Name  : "+name);
                    }
                    if(snapshot.child("phoneOrder").exists())
                    {
                        String phone=snapshot.child("phoneOrder").getValue().toString();
                        userPhoneEditText.setText("Phone : "+phone);
                    }
                    if(snapshot.child("address").exists())
                    {
                        String address=snapshot.child("address").getValue().toString();
                        addressEditText.setText("Student id : "+address);
                    }

                }





            }

            @Override
            public void onCancelled(@NonNull @NotNull DatabaseError error) {

            }
        });

    }
}


