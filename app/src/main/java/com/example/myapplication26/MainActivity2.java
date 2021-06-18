package com.example.myapplication26;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.SeekBar;
import android.widget.SeekBar.OnSeekBarChangeListener;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {
    String email = "";
    int age;
    int weight;
    public SeekBar customSeekBar;
    public SeekBar customSeekBar1;
    private TextView customAgeTextView;
    private TextView customWeightTextView;
    private EditText editTextTextPersonName;
    private EditText editTextTextEmailAddress2;
    private EditText editTextTextPassword3;

    private OnSeekBarChangeListener customSeekBarListener = new OnSeekBarChangeListener() {
        @Override
        public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
            age = seekBar.getProgress();
            customAgeTextView.setText(String.valueOf(age));
        }

        @Override
        public void onStartTrackingTouch(SeekBar seekBar) {

        }

        @Override
        public void onStopTrackingTouch(SeekBar seekBar) {

        }

    };

    private OnSeekBarChangeListener customSeekBarListener1 = new OnSeekBarChangeListener() {
        @Override
        public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
          weight = seekBar.getProgress();
          customWeightTextView.setText( String.valueOf(weight));
        }

        @Override
        public void onStartTrackingTouch(SeekBar seekBar) {

        }

        @Override
        public void onStopTrackingTouch(SeekBar seekBar) {

        }

    };



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Intent r=getIntent();
        Intent i=getIntent();
        email=i.getStringExtra("email");
        Toast.makeText(this, email, Toast.LENGTH_SHORT).show();

        customWeightTextView = findViewById(R.id.customWeightTextView);
        customAgeTextView = findViewById(R.id.customAgeTextView);
        customSeekBar = findViewById(R.id.customSeekBar);
        customSeekBar.setOnSeekBarChangeListener(customSeekBarListener);
        customSeekBar1 = findViewById(R.id.customSeekBar1);
        customSeekBar1.setOnSeekBarChangeListener(customSeekBarListener1);
        editTextTextPersonName = findViewById(R.id.editTextTextPersonName);
        editTextTextEmailAddress2 = findViewById(R.id.editTextTextEmailAddress2);
        editTextTextPassword3 = findViewById(R.id.editTextTextPassword3);
    }

    public void onClicksubmitregister(View view) {
        Dal dal=new Dal(this);
       if( dal.addContact(editTextTextPersonName.getText().toString(), editTextTextEmailAddress2.getText().toString(), editTextTextPassword3.getText().toString(), Integer.parseInt(customWeightTextView.getText().toString()),Integer.parseInt( customAgeTextView.getText().toString()))){
           Intent j=new Intent(this, MainActivity3.class);
           j.putExtra("email" ,editTextTextEmailAddress2.getText().toString());
           j.putExtra("id", dal.Getcontactinfo(editTextTextEmailAddress2.getText().toString()).getId());
            startActivity(j);}
    }

    public void onClickloginInRegister(View view) {
        Intent l=new Intent(this, MainActivity1.class);
        startActivity(l);
    }
}