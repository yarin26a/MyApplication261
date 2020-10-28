package com.example.myapplication26;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {
    String email="";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Intent r=getIntent();
        Intent i=getIntent();
        email=i.getStringExtra("email");
        Toast.makeText(this, email, Toast.LENGTH_SHORT).show();
    }

    public void onClicksubmitregister(View view) {
        Intent j=new Intent(this, MainActivity3.class);
        startActivity(j);
    }

    public void onClickloginInRegister(View view) {
        Intent l=new Intent(this, MainActivity1.class);
        startActivity(l);
    }
}