package com.example.cselearningportalhstu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class SendOTP extends AppCompatActivity {

    private EditText mobileNumberEditText;
    private Button verifyNumberBtn;
    private String mobileNumber;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_send_otp);

        mobileNumberEditText=(EditText)findViewById(R.id.otp_phn);

        verifyNumberBtn=(Button)findViewById(R.id.send_otp_btn);



        verifyNumberBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                mobileNumber=mobileNumberEditText.getText().toString().trim();
                if(mobileNumber.length()!=11)
                {
                    Toast.makeText(SendOTP.this, "Invalid mobile number at sendOTP: "+mobileNumber, Toast.LENGTH_SHORT).show();
                }
                else {
                    Intent intent = new Intent(SendOTP.this, RecieveOTP.class);
                    intent.putExtra("mobile", mobileNumber);
                    startActivity(intent);
                }
            }
        });
    }


}