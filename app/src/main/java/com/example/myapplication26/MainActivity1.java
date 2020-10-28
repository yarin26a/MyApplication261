package com.example.myapplication26;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity1 extends AppCompatActivity {
    String email="";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main1);
        Intent l=getIntent();
        Intent i=getIntent();
        email=i.getStringExtra("email");
        Toast.makeText(this, email, Toast.LENGTH_SHORT).show();
    }

    public void onClicksubmitlogin(View view) {
        Intent i=new Intent(this, MainActivity3.class);
        startActivity(i);
    }

    public void onClickrgisterInLogin(View view) {
        Intent r=new Intent(this, MainActivity2.class);
        startActivity(r);
    }
}