package com.example.internproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.github.clans.fab.FloatingActionButton;
import com.github.clans.fab.FloatingActionMenu;

public class MainActivity extends AppCompatActivity {
    FloatingActionMenu fam;
    FloatingActionButton age,sign;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fam=findViewById(R.id.fab_menu);
        age=findViewById(R.id.age);

    }

    public void goLogin(View view) {
        Intent i=new Intent(this,SignInActivity.class);
        startActivity(i);

    }

    public void getAge(View view) {
        Intent intent=new Intent(this,AgeActivity.class);
        startActivity(intent);
    }
}