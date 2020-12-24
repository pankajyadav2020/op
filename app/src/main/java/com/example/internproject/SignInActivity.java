package com.example.internproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.android.material.snackbar.BaseTransientBottomBar;
import com.google.android.material.snackbar.Snackbar;

public class SignInActivity extends AppCompatActivity {
    Button login;
    EditText user,pss;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);

        login=findViewById(R.id.button2);
        user=findViewById(R.id.editTextTextEmailAddress);
        pss=findViewById(R.id.editTextTextPassword);
    }

    public void loginDetails(View view) {
        String u=user.getText().toString();
        String p=pss.getText().toString();
        Snackbar.make(findViewById(R.id.contra),"user id="+u+"\npassword="+p,Snackbar.LENGTH_LONG).show();
    }
}