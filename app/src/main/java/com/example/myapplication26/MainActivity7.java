package com.example.myapplication26;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.DatePicker;

public class MainActivity7 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main7);

    }

    public void onClickOk(View view) {
        Intent data=new Intent();
        String date;
        DatePicker datePicker=findViewById(R.id.datePicker);

        int   day  = datePicker.getDayOfMonth();
        int   month= datePicker.getMonth() + 1;
        int   year = datePicker.getYear();

        date=String.valueOf(day)+'/'+String.valueOf( month)+'/'+String.valueOf(year) ;
        data.setData(Uri.parse(date));
        setResult(RESULT_OK,data);

        finish();
    }

    public void onClickBuck(View view) {
        finish();
    }
}