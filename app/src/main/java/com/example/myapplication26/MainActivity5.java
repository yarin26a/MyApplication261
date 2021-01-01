package com.example.myapplication26;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity5 extends AppCompatActivity {
int datei;
int timei;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);
        Intent j=getIntent();
    }

    public void OnClickDate(View view) {
        Intent d=new Intent(this, MainActivity7.class);
        startActivityForResult(d, datei);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode==datei)
            if(resultCode==RESULT_OK)
            {
                EditText date=findViewById(R.id.dateInput);
                try {
                    if(data.getData()!=null) {
                        if (data.getData().toString().charAt(1) == '/' ||  data.getData().toString().charAt(2) == '/' ||  data.getData().toString().charAt(3) == '/') {
                            date.setText(data.getData().toString());
                        }
                    }
                }
                catch(Exception e)
                {
                    Toast.makeText(this,"Error",Toast.LENGTH_LONG).show();
                }
            }
        if(requestCode==timei)
        if(resultCode==RESULT_OK)
        {
            EditText time=findViewById(R.id.timeInput);
            try {
                if (data.getData()!=null) {
                    if(data.getData().toString().charAt(1)==':' || data.getData().toString().charAt(2)==':' || data.getData().toString().charAt(3)==':') {
                        time.setText(data.getData().toString());
                    }
                }
            }
            catch(Exception e)
            {
                Toast.makeText(this,"Error",Toast.LENGTH_LONG).show();
            }
        }
    }

    public void onClickTime(View view) {
        Intent t=new Intent(this, MainActivity8.class);
        startActivityForResult(t, timei);
    }


}