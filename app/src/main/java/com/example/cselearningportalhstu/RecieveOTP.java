package com.example.cselearningportalhstu;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.FirebaseException;
import com.google.firebase.FirebaseTooManyRequestsException;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseAuthInvalidCredentialsException;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.auth.PhoneAuthCredential;
import com.google.firebase.auth.PhoneAuthOptions;
import com.google.firebase.auth.PhoneAuthProvider;

import java.util.concurrent.TimeUnit;


public class RecieveOTP extends AppCompatActivity {


    private EditText verifyET;
    private Button verifyBtn;
    private String code,mVerificationId,phoneNumber;
    FirebaseAuth firebaseAuth;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recieve_otp);

        verifyET=(EditText)findViewById(R.id.otp_code);
        verifyBtn=(Button)findViewById(R.id.verify_otp_btn);
        phoneNumber=getIntent().getStringExtra("mobile");
        firebaseAuth=FirebaseAuth.getInstance();

        Toast.makeText(this, "Phone number is : "+phoneNumber, Toast.LENGTH_SHORT).show();


        sendOTP();
        verifyBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                code=verifyET.getText().toString().trim();


//                Intent intent=new Intent(RecieveOTP.this,RegisterActivity.class);
//                intent.putExtra("mobile",phoneNumber);
//                startActivity(intent);
                if(code.length()==6)
                {
                    Toast.makeText(RecieveOTP.this, "verify called", Toast.LENGTH_SHORT).show();
                    verify();
                }
                else {
                    Toast.makeText(RecieveOTP.this, "Invalid code length", Toast.LENGTH_SHORT).show();
                }
            }
        });


//        verifyBtn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                code=verifyET.getText().toString().trim();
//                if(code.length()!=6)
//                {
//                    Toast.makeText(RecieveOTP.this, "verify called", Toast.LENGTH_SHORT).show();
//                    //verify();
//                }
//                else {
//                    Toast.makeText(RecieveOTP.this, "Invalid code length", Toast.LENGTH_SHORT).show();
//                }
//            }
//        });






    }

    private void sendOTP() {

        PhoneAuthProvider.getInstance().verifyPhoneNumber(
                "+88"+phoneNumber,        // Phone number to verify
                60,                 // Timeout duration
                TimeUnit.SECONDS,   // Unit of timeout
                this,               // Activity (for callback binding)
                new PhoneAuthProvider.OnVerificationStateChangedCallbacks()
                {
                    @Override
                    public void onCodeSent(String s, PhoneAuthProvider.ForceResendingToken forceResendingToken)
                    {
                        mVerificationId=s;
                    }

                    @Override
                    public void onVerificationCompleted(PhoneAuthCredential phoneAuthCredential)
                    {
                        signInWithPhoneAuthCredential(phoneAuthCredential);
                    }

                    @Override
                    public void onVerificationFailed(FirebaseException e) {
                        Toast.makeText(getApplicationContext(),"failed message from : "+e.getMessage(),Toast.LENGTH_LONG).show();
                    }
                });        // OnVerificationStateChangedCallbacks

    }

    private void verify() {

        PhoneAuthCredential credential = PhoneAuthProvider.getCredential(mVerificationId, code);
        signInWithPhoneAuthCredential(credential);
    }

    private void signInWithPhoneAuthCredential(PhoneAuthCredential credential) {
        firebaseAuth.signInWithCredential(credential)
                .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if (task.isSuccessful())
                        {
                            Toast.makeText(RecieveOTP.this, "Verified", Toast.LENGTH_SHORT).show();
                            Intent intent=new Intent(RecieveOTP.this,RegisterActivity.class).putExtra("mobile",phoneNumber);
                            startActivity(intent);

                            //startActivity(new Intent(RecieveOTP.this,RegisterActivity.class));
                            //finish();

                        } else {
                            Toast.makeText(getApplicationContext(),"Signin Code Error",Toast.LENGTH_LONG).show();
                        }
                    }
                });

    }

}