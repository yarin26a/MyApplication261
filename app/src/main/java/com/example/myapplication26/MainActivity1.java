package com.example.myapplication26;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity1 extends AppCompatActivity {
    String email="";
    String password="";
    private EditText editTextTextEmailAddress;
    private EditText editTextTextPassword;
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main1);
        Intent l=getIntent();
        Intent i=getIntent();
        email=i.getStringExtra("email");
        Toast.makeText(this, email, Toast.LENGTH_SHORT).show();
        editTextTextEmailAddress = findViewById(R.id.editTextTextEmailAddress);
        editTextTextPassword = findViewById(R.id.editTextTextPassword);
    }

    public void onClicksubmitlogin(View view) {
        Dal dal = new Dal(this);
        if(dal.login(editTextTextEmailAddress.getText().toString(), editTextTextPassword.getText().toString() )){
        Intent i=new Intent(this, MainActivity3.class);
        i.putExtra("email" ,editTextTextEmailAddress.getText().toString());
        i.putExtra("id", dal.Getcontactinfo(editTextTextEmailAddress.getText().toString()).getId());
        startActivity(i);}
    }

    public void onClickrgisterInLogin(View view) {
         Intent r=new Intent(this, MainActivity2.class);
        startActivity(r);
    }
}