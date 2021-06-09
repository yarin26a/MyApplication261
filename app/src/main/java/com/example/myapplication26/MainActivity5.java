package com.example.myapplication26;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity5 extends AppCompatActivity {
int datei;
int timei;
    private EditText  dateInput;
    private EditText timeInput;
    private EditText nameId;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);
        Intent j=getIntent();
        String[] name=new String[]{"Cidny","Marph","Tabata","Amrap","Mobility"};
        final ListView lv = findViewById(R.id.listTrianId);
        final List<String> members_list=new ArrayList<String>(Arrays.asList(name));
        final ArrayAdapter<String> arrayAdapter=new ArrayAdapter<String>(MainActivity5.this,android.R.layout.simple_list_item_1,members_list);
        lv.setAdapter(arrayAdapter);
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String S;
              S = members_list.get(position);
               EditText name = findViewById(R.id.nameId);
               name.setText(S);
            }
        });
        dateInput = findViewById(R.id.dateInput);
        timeInput = findViewById(R.id.timeInput);
        nameId = findViewById(R.id.nameId);
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


    public void onClickOk(View view) {
        Dal dal=new Dal(this);
        dal.addBoard_list(dateInput.getText().toString(), timeInput.getText().toString(), nameId.getText().toString());

    }
}