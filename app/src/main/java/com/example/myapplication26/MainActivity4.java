package com.example.myapplication26;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;

public class MainActivity4 extends AppCompatActivity {
    private EditText editTextTextPersonName2;
    private EditText editTextTextPersonName3;
    private EditText editTextTextPersonName4;
    private EditText editTextTextPersonName5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        Intent i=getIntent();
        Dal dal = new Dal(this);
        Contact c = dal.Getcontactinfo(i.getStringExtra("email"));
        //int numoftrain = dal.Gettrain(i.getIntExtra("id", 0));
        int numoftrain = dal.Gettrain((int)c.getId());
        editTextTextPersonName2 = findViewById(R.id.editTextTextPersonName2);
        editTextTextPersonName3 = findViewById(R.id.editTextTextPersonName3);
        editTextTextPersonName4 = findViewById(R.id.editTextTextPersonName4);
        editTextTextPersonName5 = findViewById(R.id.editTextTextPersonName5);

        editTextTextPersonName2.setText(c.getName());
        editTextTextPersonName3.setText(String.valueOf( c.getAge()));
        editTextTextPersonName4.setText(String.valueOf( c.getweight()));
        editTextTextPersonName5.setText(String.valueOf(numoftrain));
    }
}