package com.example.internproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.button.MaterialButton;

public class AgeActivity extends AppCompatActivity {
    EditText editText;
    TextView textView_age;
    Button btn;
    int n,d,date;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_age);

        btn=findViewById(R.id.age_id);
        editText=(EditText)findViewById(R.id.user_id);
        textView_age=(TextView)findViewById(R.id.textView3);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                n=Integer.parseInt(editText.getText().toString());
                date=2020;
                d=date-n;
                textView_age.setText("="+d);
            }
        });
    }
}