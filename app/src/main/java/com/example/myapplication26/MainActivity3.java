package com.example.myapplication26;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        Intent i=getIntent();
        Intent j=getIntent();
    }

    public void onClickuserinfo(View view) {
        Intent i=new Intent(this, MainActivity4.class);
        i.putExtra("email", getIntent().getStringExtra("email"));
        startActivity(i);
    }

    public void onClickbordlist(View view) {
        Intent j=new Intent(this, MainActivity5.class);
        startActivity(j);
    }

    public void onClicktrainlist(View view) {
        Intent z=new Intent(this, MainActivity6.class);
        startActivity(z);
    }
}